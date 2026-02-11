package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestHelloSelenium {
    private WebDriver driver;

    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }

    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Training Support");
    }

     @Test
    public void test2(){
        WebElement button = driver.findElement(By.linkText("About Us"));
        Assert.assertTrue(button.isDisplayed());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
