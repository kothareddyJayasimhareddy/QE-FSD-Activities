package demos;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity20 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://training-support.net/webelements/alerts");
    System.out.println("Title of the Page: "+driver.getTitle());

    System.out.println(driver.getTitle());

    driver.findElement(By.id("prompt")).click();

    wait.until(ExpectedConditions.alertIsPresent());

    Alert alert = driver.switchTo().alert();

    System.out.println("Text in Alert: "+alert.getText());

    alert.sendKeys("Awesome!");
    alert.accept();

    // Close browser
    driver.quit();
    }
}
    


