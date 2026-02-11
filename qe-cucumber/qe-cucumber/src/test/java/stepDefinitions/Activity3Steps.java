package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Activity3Steps extends Base{

    @Given("User is on the page")
    public void userOnAlertPage(){
        driver.get("https://training-support.net/webelements/alerts");
        System.out.println("The user is on : " + driver.getTitle());
    }

    //Clicks On Alert Button
    @When("User clicks the Simple Alert button")
    public void simpleBtn(){
        WebElement simpleAlertElement = driver.findElement(By.id("simple"));
        simpleAlertElement.click();
    }

     @When("User clicks the Confirm Alert button")
    public void ConfirmBtn(){
        WebElement confirmAlertElement = driver.findElement(By.id("confirmation"));
        confirmAlertElement.click();
    }

     @When("User clicks the Prompt Alert button")
    public void promptBtn(){
        WebElement promptAlertElement = driver.findElement(By.id("prompt"));
        promptAlertElement.click();
    }
    


    //Alerts Open

    @Then("Simple Alert opens")
    public void simpleAlertOpens(){
        wait.until(ExpectedConditions.alertIsPresent());
        simpleAlert = driver.switchTo().alert();
    }
    @Then("Confirm Alert opens")
    public void confirmAlertOpens(){
        wait.until(ExpectedConditions.alertIsPresent());
        confirmAlert = driver.switchTo().alert();
    }
    @Then("Prompt Alert opens")
    public void promptAlertOpens(){
        wait.until(ExpectedConditions.alertIsPresent());
        promptAlert = driver.switchTo().alert();
    }



    //And("Read the text and print it")

      @And("Read the text from simple alert and print it")
    public void printSimpleAlertText(){
        System.out.println(simpleAlert.getText());
    }

      @And("Read the text from confirm alert and print it")
    public void printConfirmAlertText(){
        System.out.println(confirmAlert.getText());
    }

      @And("Read the text from prompt alert and print it")
    public void printPromptAlertText(){
        System.out.println(promptAlert.getText());
    }


    @And("write a custom message in Prompt Alert")
    public void PromptCustomMessege(){
        promptAlert.sendKeys("Hello");
        System.out.println(promptAlert.getText());
    }

    //close the alerts 

    @And("Close the simple alert")
    public void closeSimpleAlert(){
        simpleAlert.accept();
    }

     @And("Close the confirm alert with Cancel")
    public void closeConfirmAlert(){
        confirmAlert.dismiss();
    }

     @And("Close the prompt alert")
    public void closePromptAlert(){
        promptAlert.accept();
    }

    

    //Read the result text

    @And("Read the simple alert result text")
    public void simpleAlertText(){
        WebElement simpleAlertResult = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@id='result']"))));
        System.out.println(simpleAlertResult.getText());
    }
    @And("Read the confirm alert result text")
    public void confirmAlertText(){
        WebElement confirmAlertResult = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@id='result']"))));
        System.out.println(confirmAlertResult.getText());
    }
    @And("Read the prompt alert result text")
    public void promptAlertText(){
        WebElement promptAlertResult = wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[@id='result']"))));
        System.out.println(promptAlertResult.getText());
    }


}
