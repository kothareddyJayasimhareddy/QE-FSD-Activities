package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestActivity3 {

    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form");
    }

    @AfterClass
    public void closeResources(){
        driver.quit();
    }

      @Test
    public void test2(){
        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("password"));

        username.sendKeys("admin");
        password.sendKeys("password");

        driver.findElement(By.xpath("//button[text() = 'Submit']")).click();

        String message = driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText();

        Assert.assertEquals(message, "Welcome Back, Admin!");
    }

}
