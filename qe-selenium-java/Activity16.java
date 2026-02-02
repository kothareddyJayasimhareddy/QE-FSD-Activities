package demos;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
public static void main(String[] args) {
    WebDriver driver = new FirefoxDriver();
    driver.get("https://training-support.net/webelements/selects");
    System.out.println("Title of the Page: "+driver.getTitle());

    System.out.println(driver.getTitle());

        WebElement singleSelectElement = driver.findElement(
        By.tagName("select")
);
            // Create Select object
            Select singleSelect = new Select(singleSelectElement);

            // Select second option using visible text
            singleSelect.selectByVisibleText("Two");

            // Select third option using index
            singleSelect.selectByIndex(2);

            // Select fourth option using value
            singleSelect.selectByValue("four");

            // Get all options and print them
            List<WebElement> options = singleSelect.getOptions();
            System.out.println("Available options:");

            for (WebElement option : options) {
                System.out.println(option.getText());
            }
            // Close browser
            driver.quit();
    }
}
    


