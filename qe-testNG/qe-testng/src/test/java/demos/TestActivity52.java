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

public class TestActivity52 {

    WebDriver driver;

    // @BeforeClass
    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/target-practice");
    }


    @Test
    public void verifyPageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Selenium: Target Practice");
    }

    @Test(groups = {"HeaderTests"})
    public void verifyThirdHeaderText() {
        WebElement thirdHeader = driver.findElement(By.xpath("//h3"));
        Assert.assertEquals(thirdHeader.getText(), "Heading #3");
    }

    @Test(groups = {"Header Tests"})
    public void verifyFifthHeaderColor() {
        WebElement fifthHeader = driver.findElement(By.xpath("//h5"));
        String color = fifthHeader.getCssValue("color");
        Assert.assertEquals(color, "rgba(0, 0, 255, 1)");
    }


    @Test(groups = {"ButtonTests"})
    public void verifyEmeraldButtonText() {
        WebElement emeraldButton = driver.findElement(By.xpath("//button[text()='Emerald']"));
        Assert.assertEquals(emeraldButton.getText(), "Emerald");
    }

    // @Test(groups = {"ButtonTests"})
    // public void verifyFirstButtonInThirdRowColor() {
    //     WebElement button = driver.findElement(By.xpath("//div[@class='flex flex-col space-y-2']/div[3]/button[1]"));
    //     String bgColor = button.getCssValue("background-color");
    //     Assert.assertEquals(bgColor, "rgba(59, 130, 246, 1)");
    // }

    // @AfterClass
    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.close();
    }
}
