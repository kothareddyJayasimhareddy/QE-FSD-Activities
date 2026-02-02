package demos;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity14 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/tables");
    System.out.println("Title of the page: "+driver.getTitle());

    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
    List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
    System.out.println("No of Cols in the Table: "+cols.size());
    System.out.println("No of Rows in the Table: "+rows.size());

    WebElement bookName = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));

    System.out.println("Book Name in the 5th row: "+bookName.getText());

    WebElement priceHeader = driver.findElement(By.xpath("//table/thead/tr/th[last()]"));

    Actions actions = new Actions(driver);
    actions.click(priceHeader).perform();

    WebElement bookName2 = (driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]")));
    System.out.println("Book Name after sorting: "+bookName2.getText());

    driver.quit();
}
}
