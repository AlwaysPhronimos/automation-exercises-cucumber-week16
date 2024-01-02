package com.automation.exercises.steps;

import com.automation.exercises.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class AdditionalFunctionalitySteps {


    @When("I click Test Cases on header menu option")
    public void iClickTestCasesOnHeaderMenuOption() {
        new HomePage().clickTestCasesLink();
    }

    @Then("I am on text cases page and verify the text {string} test cases")
    public void iAmOnTextCasesPageAndVerifyTheTextTestCases(String arg0) {
        Assert.assertEquals(new TestCasesPage().getVerifyTestCasesText(), "Test Cases");
    }

    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on the header menu Products link")
    public void iClickOnTheHeaderMenuProductsLink() {
        new HomePage().clickOnProductsLink();
    }

    @Then("I should see text {string} on product page")
    public void iShouldSeeTextOnProductPage(String name) {
        Assert.assertEquals(new ProductPage().verifyAllProductsText(), "ALL PRODUCTS");
    }

    @And("I click on view product of first product {string}")
    public void iClickOnViewProductOfFirstProduct(String firstProduct) {
        Assert.assertEquals(new ProductPage().verifyAllProductsText(),"ALL PRODUCTS");
    }

    @And("I should see product name {string}")
    public void iShouldSeeProductName(String name){
        new ProductPage().clickFirstProduct();
    }

    @And("I should see category {string}")
    public void iShouldSeeCategory(String category) {
        Assert.assertEquals(new ProductPage().verifyProductCategory(),"Category: Women > Tops");
    }

    @And("I should see price {string}")
    public void iShouldSeePrice(String price) {
        Assert.assertEquals(new ProductPage().verifyProductCategory(), "Rs. 500");
    }

    @And("I should see availability {string}")
    public void iShouldSeeAvailability(String availability) {
        Assert.assertEquals(new ProductPage().verifyProductPrice(), "Availability: In Stock");
    }

    @And("I should see condition {string}")
    public void iShouldSeeCondition(String condition) {
        Assert.assertEquals(new ProductPage().verifyProductCondition(), "Condition: New");
    }

    @And("I should see brand {string}")
    public void iShouldSeeBrand(String brand) {
        Assert.assertEquals(new ProductPage().verifyProductBrand(),"Brand: Polo");
    }

    @When("I scroll down up to subscription link")
    public void iScrollDownUpToSubscriptionLink() {
        new HomePage().scrollDownToSubscriptionLink();
    }

    @Then("I enter email {string} in email field")
    public void iEnterEmailInEmailField(String email) {
        new HomePage().sendDataToSubscriptionEmail(email);
    }

    @And("I click on arrow button")
    public void iClickOnArrowButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @And("I should see the success subscription message {string}")
    public void iShouldSeeTheSuccessSubscriptionMessage(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);

    }

    @Then("I click on cross button to remove the product from the cart")
    public void iClickOnCrossButtonToRemoveTheProductFromTheCart() {
        Assert.assertEquals(new HomePage().getSubscriptionText(), "Error message");

    }

    @And("I click on register link in the checkout popup")
    public void iClickOnRegisterLinkInTheCheckoutPopup() {
        new ShoppingCartPage().clickOnRegisterLoginLinkOnCheckoutPopup();
    }

    @And("I click on download invoice after order success")
    public void iClickOnDownloadInvoiceAfterOrderSuccess() {
        new PaymentPage().clickOnDownloadInvoiceButtonAfterOrderSuccessMessage();
    }

    @And("I click on continue button after order success")
    public void iClickOnContinueButtonAfterOrderSuccess() {
        new PaymentPage().clickOnContinueButtonAfterOrderSuccessMessage();
    }

    @Then("I should see the subscription {string} text")
    public void iShouldSeeTheSubscriptionText(String expectedMessage) {
        Assert.assertEquals(new HomePage().getSubscriptionSuccessMessage(), expectedMessage);
    }

    @And("I click on arrow up button at bottom right corner")
    public void iClickOnArrowUpButtonAtBottomRightCorner() {
        new HomePage().clickOnBottomRightArrowButton();

    }

    @And("I should see the message {string}")
    public void iShouldSeeTheMessage(String expectedText) {
        Assert.assertEquals(new HomePage().getFullFledgedText(), expectedText);
    }
}
