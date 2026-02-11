@activity3
Feature: Testing with Tags

  @SimpleAlert @SmokeTest
Scenario: Testing with Simple Alert
Given User is on the page
When User clicks the Simple Alert button
Then Simple Alert opens
And Read the text from simple alert and print it
And Close the simple alert
And Read the simple alert result text

  @ConfirmAlert
  Scenario: Testing with Confirm Alert
    Given User is on the page
    When User clicks the Confirm Alert button
    Then Confirm Alert opens
    And Read the text from confirm alert and print it
    And Close the confirm alert with Cancel
    And Read the confirm alert result text

  @PromptAlert
  Scenario Outline: Testing with Prompt Alert
    Given User is on the page
    When User clicks the Prompt Alert button
    Then Prompt Alert opens
    And Read the text from prompt alert and print it
    And write a custom message in Prompt Alert    
    And Close the prompt alert
    And Read the prompt alert result text
