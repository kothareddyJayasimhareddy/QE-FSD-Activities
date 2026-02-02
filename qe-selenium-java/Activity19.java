package demos;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity19 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    driver.get("https://training-support.net/webelements/alerts");
    System.out.println("Title of the Page: "+driver.getTitle());

    System.out.println(driver.getTitle());

    WebElement confirmationButton = driver.findElement(By.id("confirmation"));
    confirmationButton.click();

    wait.until(ExpectedConditions.alertIsPresent());

    Alert alert = driver.switchTo().alert();

    System.out.println("Text in Alert: "+alert.getText());

    alert.accept();

    
    confirmationButton.click();
    wait.until(ExpectedConditions.alertIsPresent());
    Alert alert2 = driver.switchTo().alert();

    alert2.dismiss();
    // Close browser
    driver.quit();
    }
}
    


