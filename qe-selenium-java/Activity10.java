package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/drag-drop");
    System.out.println("Title of the Page: "+driver.getTitle());

    WebElement ballElement = driver.findElement(By.cssSelector("#ball"));
    WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
    WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

    String text = driver.findElement(By.xpath("//div[@id=\"dropzone1\"]/span")).getText();
    
    Actions actions = new Actions(driver);
    actions.dragAndDrop(ballElement, dropzone1).build().perform();

    if(text=="Dropped!"){
        System.out.println("Ball entered dropzone1");
    }

    actions.dragAndDrop(ballElement, dropzone2).build().perform();

    if((driver.findElement(By.xpath("//div[@id=\"dropzone1\"]/span")).getText())==("Dropped!")){
        System.out.println("Ball entered dropzone2");
    }

    driver.quit();

}
}
