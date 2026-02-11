package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity4LoginSteps extends Base{

    @Given("the user is on login page")
    public void userOnLoginPage(){
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println("The user is on : " + driver.getTitle());
    }

    @When("the user enters {string} and {string}")
    public void nameAndPassWithParameters(String username, String password){
        WebElement usernameElement = driver.findElement(By.id("username"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        usernameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
    }

    @Then("get the confirmation text and verify message as {string}")
    public void verifyMessage(String message1){
        String message = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(@class,'mt-5')]")))).getText();
        Assertions.assertEquals(message, "Welcome Back, Admin!");
        System.out.println(message1);
    }

}
