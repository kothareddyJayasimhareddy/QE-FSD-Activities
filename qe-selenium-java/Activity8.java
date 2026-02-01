package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity8 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    Actions builder = new Actions(driver);

    driver.get("https://training-support.net/webelements/mouse-events");
    // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
    System.out.println(driver.getTitle());

    WebElement cargoLockButton = driver.findElement(By.cssSelector("div.file:nth-child(1) > div:nth-child(1)"));
    WebElement  cargoTomlButton= driver.findElement(By.cssSelector("div.file:nth-child(2) > div:nth-child(1)"));
  
    WebElement srcButton = driver.findElement(By.cssSelector("div.file:nth-child(3) > div:nth-child(1)"));
    WebElement targetButton = driver.findElement(By.cssSelector("div.file:nth-child(4) > div:nth-child(1)"));


         builder
               .click(cargoLockButton)
               .moveToElement(cargoTomlButton)
               .click(cargoTomlButton)
               .build()
              .perform();
              

WebElement messageElement = driver.findElement(By.id("result"));
String message1 = messageElement.getText();
System.out.println(message1);

// Double click on src
builder.doubleClick(srcButton).perform();

String message2 = messageElement.getText();
System.out.println(message2);

// Right click on target
builder.contextClick(targetButton).perform();

WebElement openButton = driver.findElement(By.cssSelector("li.w-full:nth-child(1)"));

builder.click(openButton).perform();

try {
    Thread.sleep(500);
} catch (InterruptedException ex) {
    ex.printStackTrace();
}

String openBtnMessage = messageElement.getText();
System.out.println(openBtnMessage);

driver.quit();

}
}
