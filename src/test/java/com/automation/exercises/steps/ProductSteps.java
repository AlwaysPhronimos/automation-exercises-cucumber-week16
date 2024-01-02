package com.automation.exercises.steps;

import com.automation.exercises.pages.HomePage;
import com.automation.exercises.pages.ProductDetailsPage;
import com.automation.exercises.pages.ProductPage;
import com.automation.exercises.pages.ShoppingCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ProductSteps {
    @When("I click on products tab")
    public void iClickOnProductsTab() {
        new HomePage().clickOnProductsTab();
    }

    @And("I enter product name {string} in search bar")
    public void iEnterProductNameInSearchBar(String productName) {
        new ProductPage().sendTextToSearchBar(productName);
    }

    @And("I click on search button")
    public void iClickOnSearchButton() {
        new ProductPage().clickOnSearchButton();

    }

    @Then("I should see the text {string} on the page")
    public void iShouldSeeTheTextOnThePage(String expectedText) {
        Assert.assertEquals(new ProductPage().getSearchedProductsText(), expectedText);
    }

    @And("I should see the searched product {string}")
    public void iShouldSeeTheSearchedProduct(String productName) {
        Assert.assertEquals(new ProductPage().getSearchedProductName(), productName);
    }

    @And("I click on continue shopping link")
    public void iClickOnContinueShoppingLink() {
        new ProductPage().clickOnContinueShoppingLink();
    }

    @Then("I verify the product {string} in shopping cart")
    public void iVerifyTheProductInShoppingCart(String productName) {
        Assert.assertEquals(new ShoppingCartPage().getProductNameFromCart(productName), productName);
    }

    @And("I am on product details page and verify the URL")
    public void iAmOnProductDetailsPageAndVerifyTheURL() {
        Assert.assertTrue(new ProductDetailsPage().verifyTheURL().contains("https://automationexercise.com/product_details"));
    }

    @And("I increase the quantity {string}")
    public void iIncreaseTheQuantity(String quantity) {
        new ProductDetailsPage().sendQuantity(quantity);
    }

    @And("I click on add to cart button")
    public void iClickOnAddToCartButton() {
        new ProductDetailsPage().clickOnAddToCartButton();
    }

    @And("I click on view cart link in success message")
    public void iClickOnViewCartLinkInSuccessMessage() {
        new ProductDetailsPage().clickOnViewCartLinkInSuccessMessage();
    }

    @Then("I should see quantity {string}")
    public void iShouldSeeQuantity(String quantity) {
        Assert.assertEquals(new ShoppingCartPage().getQuantity(), quantity);
    }

    @Then("I click on {string} category")
    public void iClickOnCategory(String category) {
        new ProductPage().clickOnCategory(category);
    }

    @And("I click on {string} in women category")
    public void iClickOnInWomenCategory(String subCategory) {
        new ProductPage().clickOnSubCategoryOfWomen(subCategory);
    }

    @And("I should see {string} page title")
    public void iShouldSeePageTitle(String expectedTitle) {
        Assert.assertEquals(new ProductPage().getSubMenuPageTitle(), expectedTitle);
    }

    @And("I click on {string} in men category")
    public void iClickOnInMenCategory(String arg0) {
    }

    @Then("I click on {string} brand in Brands tab")
    public void iClickOnBrandInBrandsTab(String brand) {
        new ProductPage().clickOnBrandOnBrandsTab(brand);
    }

    @And("I enter {string} name at your name field")
    public void iEnterNameAtYourNameField(String name) {
        new ProductDetailsPage().sendNameToYourNameField(name);
    }

    @And("I enter {string} email at email address field")
    public void iEnterEmailAtEmailAddressField(String email) {
        new ProductDetailsPage().sendEmailToEmailAddressField(email);
    }

    @And("I enter {string} message to review here field")
    public void iEnterMessageToReviewHereField(String review) {
        new ProductDetailsPage().sendReviewToAddReviewField(review);
    }

    @And("I click on review submit button")
    public void iClickOnReviewSubmitButton() {
        new ProductDetailsPage().clickOnReviewSubmitButton();
    }

    @Then("I should see {string} message")
    public void iShouldSeeMessage(String message) {
        Assert.assertEquals(new ProductDetailsPage().getThankYouForReviewMessage(), message);
    }

    @When("I scroll down up to recommended items text")
    public void iScrollDownUpToRecommendedItemsText() {
        new HomePage().scrollDownToRecommendedItems();
    }

    @Then("I should see {string} text")
    public void iShouldSeeText(String expectedText) {
        Assert.assertEquals(new HomePage().getRecommendedItemText(), expectedText);
    }

    @And("I add to cart {string} product from recommended items")
    public void iAddToCartProductFromRecommendedItems(String productName) {
        new HomePage().clickAddToCartOnRecommendedItems(productName);
    }
}
