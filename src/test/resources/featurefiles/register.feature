Feature: Register functionality
  As a user I should be able to register

#  Test Case 1: Register User
  Scenario: User should register successfully
    Given  I am on homepage and verify the homepage URL
    When   I click on header menu option "Signup / Login"
    Then   I should see the login page text "New User Signup!"
    And    I send name "Smart" and email "smart.tester@gmail.com" to signup
    And    I click on button "Signup"
    Then   I should see text "ENTER ACCOUNT INFORMATION"
    And    I fill all details in signup page "Ms" "Smart" "1" "July" "1981" "Smart" "Tester" "Millcar Drive" "Scarborough" "India" "Gujarat" "Surat" "396445" "09123456789"
    And    I click on news letter subscription check box
    And    I click on special offers check box
    And    I click on Create Account button
    Then   I see account created message "ACCOUNT CREATED!"
    And    I click on continue button
    Then   I should see the text "Logged in as " "Smart"
    And    I click on header menu option "Delete Account"
    Then   I should see the account deleted message "ACCOUNT DELETED!"
    And    I click on continue button after deleting account


#  Test Case 5: Register User with existing email
  Scenario: User should see error message while register with existing email
    Given I am on homepage and verify the homepage URL
    When  I click on header menu option "Signup / Login"
    Then  I should see the login page text "New User Signup!"
    And   I send name "Smart" to name field in signup
    And   I send email "smart.tester@gmail.com" to email field in signup
    And   I click on button "Signup"
    Then  I should see error message "Email Address already exist!"


#  Test Case 14: Place Order: Register while Checkout
  Scenario: User should Place Order: Register while Checkout
    Given I am on homepage and verify the homepage URL
    When  I add product "Blue Top" to the cart
    And   I click on view cart in popup
    And   I should see the welcome text on shopping cart page "Shopping Cart"
    And   I click on Proceed to Checkout button
    And   I click on register link in the checkout popup
    And   I send name "Smart" and email "Smart" to signup
    And   I click on button "Signup"
    And   I fill all details in signup page "Ms" "Smart@test" "1" "July" "1981" "Smart" "Tester" "Millcar Drive" "Scarborough" "India" "Gujarat" "Surat" "396445" "09123456789"
    And   I click on Create Account button
    Then  I see account created message "ACCOUNT CREATED!"
    And   I click on continue button
    And   I click on header menu option "Cart"
    And   I click on Proceed to Checkout button
    And   I should see the text on checkout page "Review Your Order"
    And   I should see the text on checkout page "Address Details"
    And   I enter details into comment area "Please deliver it on time."
    And   I click on place order button
    And   I enter payment details "Smart Tester" "4568236547896542" "232" "07" and "2026"
    And   I click on Pay and Confirm Order button
    Then  I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And   I click on header menu option "Delete Account"
    Then  I should see the account deleted message "ACCOUNT DELETED!"
    Then  I click on continue button after deleting account


#  Test Case 15: Place Order: Register before Checkout
  Scenario: User should Place Order: Register before Checkout
    Given   I am on homepage and verify the homepage URL
    When    I click on header menu option "Signup / Login"
    And     I click on button "Signup"
    And     I fill all details in signup page "Ms" "Smart@test" "1" "July" "1981" "Smart" "Tester" "Millcar Drive" "Scarborough" "India" "Gujarat" "Surat" "396445" "09123456789"
    And     I click on Create Account button
    Then    I see account created message "ACCOUNT CREATED!"
    And     I click on continue button
    Then    I should see the text "Logged in as " "Smart"
    And     I add product "Blue Top" to the cart
    And     I click on view cart in popup
    And     I should see the welcome text on shopping cart page "Shopping Cart"
    And     I click on Proceed to Checkout button
    And     I should see the text on checkout page "Review Your Order"
    And     I should see the text on checkout page "Address Details"
    And     I enter details into comment area "Please deliver it on time."
    And     I click on place order button
    And     I enter payment details "Smart Tester" "4568236547896542" "232" "07" and "2026"
    And     I click on Pay and Confirm Order button
    Then    I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And     I click on header menu option "Delete Account"
    Then    I should see the account deleted message "ACCOUNT DELETED!"
    Then    I click on continue button after deleting account


#  Test Case 16: Place Order: Login before Checkout
  Scenario: User should place the order successfully : Login before Checkout
    Given I am on homepage and verify the homepage URL
    When  I click on menu "Signup / Login"
    Then  I should see the login page title "Login to your account"
    And   I enter email "smart.tester@gmail.com" and password "testsmart1" field
    And   I click on button "Login"
    Then  I should see the text "Logged in as "
    And   I add product "Blue Top" to the cart
    And   I click on view cart in popup
    And   I should see the welcome text on shopping cart page "Shopping Cart"
    And   I click on Proceed to Checkout button
    And   I should see the text on checkout page "Review Your Order"
    And   I should see the text on checkout page "Address Details"
    And   I enter details into comment area "Please deliver it on time."
    And   I click on place order button
    And   I enter payment details "Smart Tester" "4568236547896542" "232" "07" and "2026"
    And   I click on Pay and Confirm Order button
    Then  I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And   I click on header menu option "Logout"



































