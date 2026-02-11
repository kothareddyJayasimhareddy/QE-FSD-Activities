package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity2LoginSteps extends Base{

    @Given("the user is on the login page")
    public void userOnLoginPage(){
        driver.get("https://training-support.net/webelements/login-form");
        System.out.println("The user is on : " + driver.getTitle());
    }

    @When("the user enters username and password")
    public void entersNamePass(){
        WebElement usernameElement = driver.findElement(By.id("username"));
        WebElement passwordElement = driver.findElement(By.id("password"));
        usernameElement.sendKeys("admin");
        passwordElement.sendKeys("password");
    }


    @And("clicks the submit button")
    public void clicksSubmitBtn(){
        driver.findElement(By.xpath("//button[text()='Submit']")).click();;
    }
    
    @Then("get the confirmation message and verify it")
    public void verifyMessage(){
        String message = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h2[contains(@class,'mt-5')]")))).getText();
        Assertions.assertEquals(message, "Welcome Back, Admin!");
    }

}
