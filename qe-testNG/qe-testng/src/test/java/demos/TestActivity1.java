package demos;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
// import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
// import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestActivity1 {
    private WebDriver driver;
    // @BeforeClass
    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net");
    }

    // @AfterClass
    @AfterMethod(alwaysRun = true)
    public void close(){
        driver.quit();
    }

    @Test
    public void test1(){
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title, "Training Support");
    }

     @Test(groups = {"aboutUs"})
    public void test2(){
        WebElement element = driver.findElement(By.linkText("About Us"));
        element.click();
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(), "About Training Support");
    }
}
