package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity11 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    driver.get("https://training-support.net/webelements/dynamic-controls");
    System.out.println("Title of the Page: " + driver.getTitle());

    WebElement checkBox = driver.findElement(By.id("checkbox"));
    WebElement toggleButton = driver.findElement(By.cssSelector("section.mx-auto:nth-child(1) > button:nth-child(2)"));
    
    Actions actions = new Actions(driver);

    actions.click(toggleButton).perform();
    actions.click(toggleButton).perform();

    wait.until(ExpectedConditions.visibilityOf(checkBox));

    actions.click(checkBox).perform();

    driver.quit();


}
}
