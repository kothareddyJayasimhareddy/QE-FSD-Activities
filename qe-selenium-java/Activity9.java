package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println("Title of the Page: "+driver.getTitle());

        Actions actions = new Actions(driver);

        actions.sendKeys("Hello World!").perform();

        String text = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(text);

        
        driver.quit();

    }
}
