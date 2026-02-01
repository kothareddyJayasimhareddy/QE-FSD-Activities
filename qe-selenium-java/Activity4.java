package demos;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Activity4 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/target-practice");
    System.out.println(driver.getTitle());

    WebElement header3 = driver.findElement(By.xpath("//h3[text() = 'Heading #3']"));
    // WebElement header3 = driver.findElement(By.cssSelector("h3.text-3xl:nth-child(5)"));

    WebElement header5 = driver.findElement(By.xpath("//h5[text() = 'Heading #5']"));
      WebElement purpleButton = driver.findElement(By.cssSelector("button.rounded-xl:nth-child(9)"));
      

    // WebElement element3 = driver.findElement(By.cssSelector("button.rounded-xl:nth-child(9)"));
    WebElement slateButton = driver.findElement(By.xpath("//button[text()='Slate']"));


    // String text = header3.getText();
    // String text = header5.getCssValue("color");
    System.out.println("Header3: "+header3.getText());
    System.out.println("Header5 color: "+header5.getCssValue("color"));

    String purpleButtonClasses = purpleButton.getAttribute("class");
    System.out.println("Purple Button All Classes: "+purpleButtonClasses);

    String slateButtonText = slateButton.getText();
    System.out.println("Slate Button Text: "+slateButtonText);

    driver.quit();
    
}
}
