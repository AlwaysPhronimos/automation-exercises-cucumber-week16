
Feature: As a user,
  I should redirect to Test Cases page successfully
  I should subscribe in the homepage
  I should subscribe in the Cart page
  I should remove the product from cart
  I should download invoice after purchase order
  I should scroll down and scroll up using Arrow button at bottom right corner
  I should scroll down and scroll up without Arrow button

#  Test Case 7: Verify Test Cases Page
  Scenario: User should redirect to Test Cases page successfully
    Given   I am on homepage
    When    I click Test Cases on header menu option
    Then    I am on text cases page and verify the text "TEST CASES" test cases


#  Test Case 8: Verify All Products and product detail page
  Scenario: User should verify all products and product detail page
    Given   I am on homepage
    When    I click on the header menu Products link
    Then    I should see text "ALL PRODUCTS" on product page
    And     I click on view product of first product "Blue Top"
    And     I should see product name "Blue Top"
    And     I should see category "Category: Women > Tops"
    And     I should see price "Rs. 500"
    And     I should see availability "Availability: In Stock"
    And     I should see condition "Condition: New"
    And     I should see brand "Brand: Polo"


#  Test Case 10: Verify Subscription in home page
  Scenario: User should subscribe in the homepage
    Given I am on homepage and verify the homepage URL
    When  I scroll down up to subscription link
    Then  I enter email "smart.tester@gmail.com" in email field
    And   I click on arrow button
    And   I should see the success subscription message "You have been successfully subscribed!"


#  Test Case 11: Verify Subscription in Cart page
  Scenario: User should subscribe in the Cart page
    Given   I am on homepage and verify the homepage URL
    When    I click on header menu option "Cart"
    And     I scroll down up to subscription link
    Then    I enter email "smart.tester@gmail.com" in email field
    And     I click on arrow button
    And     I should see the success subscription message "You have been successfully subscribed!"

#  Test Case 17: Remove Products From Cart
  Scenario:   User should remove the product from cart
    Given     I am on homepage and verify the homepage URL
    When      I add product "Blue Top" to the cart
    And       I click on view cart in popup
    And       I should see the welcome text on shopping cart page "Shopping Cart"
    Then      I click on cross button to remove the product from the cart


#  Test Case 24: Download Invoice after purchase order
  Scenario: User should download invoice after purchase order
    Given   I am on homepage and verify the homepage URL
    When    I add product "Blue Top" to the cart
    And     I click on view cart in popup
    And     I should see the welcome text on shopping cart page "Shopping Cart"
    And     I click on Proceed to Checkout button
    And     I click on register link in the checkout popup
    And     I send name "Vish" and email "vish@gmail.com" to signup
    And     I click on button "Signup"
    And     I fill all details in signup page "Mr" "Vish@gmail.com" "1" "July" "1981" "Vish" "Raj" "High Street" "Balm" "Canada" "Ontario" "Scarborough" "396445" "09765432174"
    And     I click on Create Account button
    Then    I see account created message "ACCOUNT CREATED!"
    And     I click on continue button
    Then    I should see the text "Logged in as Vish"
    And     I click on header menu option "Cart"
    And     I click on Proceed to Checkout button
    And     I should see the text on checkout page "Review Your Order"
    And     I should see the text on checkout page "Address Details"
    And     I enter details into comment area "Please deliver it on time."
    And     I click on place order button
    And     I enter payment details "Vish Raj" "435864582364582" "232" "01" and "2027"
    And     I click on Pay and Confirm Order button
    Then    I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And     I click on download invoice after order success
    And     I click on continue button after order success
    And     I click on header menu option "Delete Account"
    Then    I should see the account deleted message "ACCOUNT DELETED!"
    Then    I click on continue button after deleting account


#  Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
  Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
    Given   I am on homepage and verify the homepage URL
    When    I scroll down up to subscription link
    Then    I should see the subscription "SUBSCRIPTION" text
    And     I click on arrow up button at bottom right corner
    And     I should see the message "Full-Fledged practice website for Automation Engineers"











