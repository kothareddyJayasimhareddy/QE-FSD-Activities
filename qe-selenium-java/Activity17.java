package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/selects");
    System.out.println("Title of the Page: "+driver.getTitle());

    System.out.println(driver.getTitle());

    WebElement multiSelectElement = driver.findElement(By.cssSelector(".h-80"));

    // Create Select object
    Select multiSelect = new Select(multiSelectElement);

    multiSelect.selectByVisibleText("HTML");

    multiSelect.selectByIndex(4);
    multiSelect.selectByIndex(5);
    multiSelect.selectByIndex(6);
    multiSelect.deselectByIndex(5);

    // Close browser
    driver.quit();

    }
}
    


