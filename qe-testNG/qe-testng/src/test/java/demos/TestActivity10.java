package demos;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity10 {

     private WebDriver driver;
     private WebDriverWait wait;

    // @BeforeClass
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/simple-form");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }

    // @AfterClass
    @AfterMethod(alwaysRun = true)
    public void closeResources(){
        driver.quit();
    }

    @DataProvider(name = "excelData")
    public Iterator<Object[]> getExcelData() throws IOException {
        List<Object[]> data = new ArrayList<>();
       String excelPath = "src/test/resources/activity10_input.xlsx";

        try (FileInputStream fis = new FileInputStream(excelPath)) {
            Workbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(0);
            DataFormatter formatter = new DataFormatter();

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {
                Row row = sheet.getRow(i);
                if(row == null) continue;
                
                String[] rowData = new String[row.getLastCellNum()];
                // for (int j = 0; j < row.getLastCellNum(); j++) {
                //     rowData[j] = formatter.formatCellValue(row.getCell(j));
                // }

                for (int j = 0; j < row.getLastCellNum(); j++) {
    Cell cell = row.getCell(j);

    if (cell == null) {
        rowData[j] = "";
        continue;
    }

    if (cell.getCellType() == CellType.NUMERIC && DateUtil.isCellDateFormatted(cell)) {
        // Convert Excel date to String
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        rowData[j] = sdf.format(cell.getDateCellValue());
    } else {
        rowData[j] = formatter.formatCellValue(cell);
    }
}
                data.add(rowData);
            }
            workbook.close();
        }
        return data.iterator();
    }

    @Test(dataProvider = "excelData")
    public void verifyUserDetails(String name, String email, String date, String details) {
        WebElement nameElement = driver.findElement(By.id("full-name"));
        WebElement emailElement = driver.findElement(By.id("email"));
        WebElement dateElement = driver.findElement(By.xpath("//input[contains(@name,'event-date')]"));;
        WebElement textAreaElement = driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]"));
        // driver.findElement(By.xpath("//button[text() = 'Submit']")).click();
       
        nameElement.sendKeys(name);
        emailElement.sendKeys(email);
        dateElement.sendKeys(date);
        textAreaElement.sendKeys(details);
         WebElement submitBtn = wait.until(
    ExpectedConditions.elementToBeClickable(
        By.xpath("//button[text()='Submit']")
    )
);

submitBtn.click();
        
        WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[@id='action-confirmation']")));
        

        Assert.assertEquals(messageElement.getText(), "Your event has been scheduled!");

    }

}