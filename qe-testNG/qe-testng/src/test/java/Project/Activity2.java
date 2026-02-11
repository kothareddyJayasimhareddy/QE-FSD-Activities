package Project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity2 {

     private WebDriver driver;
     private WebDriverWait wait;

    // @BeforeClass
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        

    }
    @Test
    public void test1(){WebElement username = driver.findElement(By.id("user_name"));
        WebElement password = driver.findElement(By.id("username_password"));

        username.sendKeys("admin");
        password.sendKeys("pa$$w0rd");

        driver.findElement(By.id("bigbutton")).click();

        driver.findElement(By.id("grouptab_0")).click();    
    
        WebElement leadsOption = wait.until(
        ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Leads"))
);
leadsOption.click();



    //    wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("(//tbody//tr)[2]/td[last()]//span[@title='Additional Details']/parent::span")))).click();

    List<WebElement> rows = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//table/tbody/tr"))));
    // List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
    System.out.println("No of Rows: "+rows.size());


    }
}

