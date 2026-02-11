package demos;

// import java.util.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestActivity2 {

    private WebDriver driver;
    @BeforeClass
    public void setUp(){
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @AfterClass
    public void closeResources(){
        driver.quit();
    }

    @DataProvider(name = "Authuntication")
    public static Object[][] test6(){
        return new Object[][] {
            {"user1", "12345"},
            {"user2", "12234"}
        };
    }

    @Test(dataProvider = "Authuntication")
    public void test7(String name, String pass){
        
    }

    @Test
    public void test1(){
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selenium: Target Practice");
    }


    public void test2(String username, String password){
        WebElement blackButton = driver.findElement(By.linkText("Slate"));
        Assert.assertTrue(blackButton.isDisplayed(), "Not Displayed");
    }

     @Test(enabled = false)
    public void test3(){
        Assert.assertEquals("abc", "cba");
    }

     @Test
    public void test4() throws SkipException{
        
        throw new SkipException("Skipping Test");
    }
}
