package demos;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestActivity5 {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test1() {
        Assert.assertEquals(driver.getTitle(), "Selenium: Target Practice");
    }

    @Test(groups = {"Header Tests"})
    public void test2() {
        WebElement header3 =
            driver.findElement(By.xpath("//h3[text()='Heading #3']"));
        Assert.assertEquals(header3.getText(), "Heading #3");
    }

    @Test(groups = {"Header Tests"})
    public void test3() {
        WebElement header5 =
            driver.findElement(By.xpath("//h5[text()='Heading #5']"));
        Assert.assertEquals(header5.getCssValue("color"),"purple");
    }

    @Test(groups = {"Button Tests"})
    public void test5() {
        String text =
            driver.findElement(By.xpath("//button[text()='Emerald']")).getText();
        Assert.assertEquals(text, "Emerald");
    }
}

