#Test Case 6: Contact Us Form
Feature: As a user I test Contact Us form

  Scenario: User should be able to access contact us form
    When    I click on Contact Us link
    Then    I verify the text GET IN TOUCH "GET IN TOUCH" is visible
    And     I enter name "Smart"
    And     I enter email "smart.tester@gmail.com"
    And     I enter subject "Test"
    And     I enter message "I am an automation Tester"
    And     I upload the file
    Then    I click on submit button
    When    I click OK button
    Then    I verify success message "Success! Your details have been submitted successfully." is visible
    And     I click Home button
    Then    I verify I am on homepage





