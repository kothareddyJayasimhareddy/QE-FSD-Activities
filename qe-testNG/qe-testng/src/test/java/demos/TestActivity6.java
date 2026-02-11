package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestActivity6 {

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
    @Parameters({"username", "password"})
    public void test(String username, String password){
        WebElement usernameElement = driver.findElement(By.id("username"));
        WebElement passwordElement = driver.findElement(By.id("password"));

        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);

        driver.findElement(By.xpath("//button[text() = 'Submit']")).click();

        String message = driver.findElement(By.xpath("//h2[text()='Welcome Back, Admin!']")).getText();

        Assert.assertEquals(message, "Welcome Back, Admin!");
    }

}
