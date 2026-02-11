package demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestActivity8 {

    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/alerts");
    }

    @AfterClass
    public void closeResources(){
        driver.quit();
    }

    @Test
    public void simpleAlertTestCase(){
        WebElement simpleAlerElement = driver.findElement(By.id("simple"));
        simpleAlerElement.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Reporter.log("Alert Accepted");
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You just accepted a simple alert!");
    }

     @Test
    public void confirmAlertTestCase(){
        WebElement confirmAlertElement = driver.findElement(By.id("confirmation"));
        confirmAlertElement.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Reporter.log("Alert Accepted");
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You just accepted a confirmation alert!");
    }

    @Test
    public void promptAlertTestCase(){
       WebElement promptAlertElement = driver.findElement(By.id("prompt"));
        promptAlertElement.click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Hello!");
        alert.accept();
        Reporter.log("prompt Alert Accepted");
        Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You typed \"Hello!\" into the prompt!");
    }


    @BeforeMethod
    public void method(){
        driver.switchTo().defaultContent();
    }

}
