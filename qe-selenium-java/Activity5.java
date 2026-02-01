package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/dynamic-controls");
    System.out.println(driver.getTitle());

    WebElement checkBox = driver.findElement(By.xpath("//input[@id = 'checkbox']"));
    System.out.println(checkBox.isDisplayed());

    driver.findElement(By.xpath("//button[text() = 'Toggle Checkbox']")).click();;
    System.out.println(checkBox.isDisplayed());

    driver.quit();

}
}
