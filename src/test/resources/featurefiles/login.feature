@regression
Feature: As a user,
  I should login successfully with correct email and password
  I should not login successfully with incorrect email and password
  I should logout successfully


#  Test Case 2: Login User with correct email and password
Scenario: User should login successfully with correct email and password
    Given   I am on homepage and verify the homepage URL
    When    I click on header menu option "Signup / Login"
    Then    I should see the login page text "Login to your account"
    And     I enter "smarttest@gmail.com" email and "smart123" password for login
    And     I click on button "Login"


#  Test Case 3: Login User with incorrect email and password
  Scenario: User should not login successfully with incorrect email and password
    Given     I am on homepage and verify the homepage URL
    When      I click on header menu option "Signup / Login"
    Then      I should see the login page text "Login to your account"
    And       I enter "testsmart@gmail.com" email and "123smart" password for login
    And       I click on button "Login"
    And       I should see the login page text "Your email or password is incorrect!"


#  Test Case 4: Logout User
  Scenario: User should logout successfully
    Given     I am on homepage and verify the homepage URL
    When      I click on header menu option "Signup / Login"
    Then      I should see the login page text "Login to your account"
    And       I enter "smarttest@gmail.com" email and "smart123" password for login
    And       I click on button "Login"
    And       I click on header menu option "Logout"
    And       I am on login page and verify the login URL







