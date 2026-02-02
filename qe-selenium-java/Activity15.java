package demos;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity15 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    
    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    driver.get("https://training-support.net/webelements/dynamic-attributes");
    System.out.println("Title of the Page: "+driver.getTitle());


    System.out.println(driver.getTitle());

    WebElement fullName = driver.findElement(By.xpath("//input[starts-with(@id, 'full-name-')]"));
    // WebElement email = driver.findElement(By.cssSelector("input[id$ = 'email']"));
    WebElement email = driver.findElement(
    By.cssSelector("input[id$='email']")
);

    // WebElement email = driver.findElement(By.xpath("//input[contains(@id, 'email')]"));

    WebElement date = driver.findElement(By.xpath("//input[contains(@name,'event-date')]"));
    WebElement textArea = driver.findElement(By.xpath("//textarea[contains(@id,'additional-details')]"));

    fullName.sendKeys("admin");
    email.sendKeys("abc@xyz.com");
    date.sendKeys("2026-02-01");
    textArea.sendKeys("party Time!");

    driver.findElement(By.xpath("//button[text() = 'Submit']")).click();

        
    WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        
    System.out.println(message.getText());

    driver.quit();
    }
}
    


