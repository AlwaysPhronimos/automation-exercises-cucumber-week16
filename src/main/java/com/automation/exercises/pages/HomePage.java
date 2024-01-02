package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//ul[@class='nav navbar-nav']/li")
    List<WebElement> headerTabs;

    @CacheLookup
    @FindBy(xpath = "//a[@href=\"/test_cases\"]")
    WebElement testCasesLink;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-lock']")
    WebElement signUpLoginLink;

    @CacheLookup
    @FindBy(xpath = "//a[@href=\"/products\"]")
    WebElement productsLink;

    @CacheLookup
    @FindBy(xpath = "//a[@href=\"/contact_us\"]")
    WebElement contactUsLink;


    @CacheLookup
    @FindBy(xpath = "(//span[.=\"Automation\"])[1]")
    WebElement homePageText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='product-image-wrapper']/div/div/p")
    List<WebElement> productList;

    @CacheLookup
    @FindBy(xpath = "//li[10]//a[1]")
    WebElement loggedInAsTab;
    @CacheLookup
    @FindBy(xpath = "//u[normalize-space()='View Cart']")
    WebElement viewCartLink;
    @CacheLookup
    @FindBy(xpath = "//a[@class='btn btn-default add-to-cart']")
    WebElement addToProductButton;
    @CacheLookup
    @FindBy(xpath = "//b[normalize-space()='Account Deleted!']")
    WebElement accountDeletedMessage;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterAccountDeletedMessage;
    @CacheLookup
    @FindBy(xpath = "//a[@href='/products']")
    WebElement productsTab;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;
    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmail;
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscriptionArrowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='alert-success alert']")
    WebElement subscriptionSuccessMessage;
    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-angle-up']")
    WebElement bottomRightArrowButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement fullFledgedText;


    public String getCurrentURL() {
        waitUntilVisibilityOfElementLocated(By.xpath("//h2[normalize-space()='Brands']"), 5);
        return driver.getCurrentUrl();
    }

    public void clickOnProductsTab() {
        clickOnElement(productsTab);
    }

    public void clickOnHeaderTab(String option) {
        for (WebElement op : headerTabs) {
            //System.out.println(op.getText());
            if (op.getText().equalsIgnoreCase(option)) {
                op.click();
                break;
            }
        }
    }

    public void scrollDownToRecommendedItems() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", recommendedItemsText);
    }

    public String getAccountDeletedMessage() {
        return getTextFromElement(accountDeletedMessage);
    }

    public void mouseHoverAndClickAddToCartOnProduct(String pName) {
        for (WebElement pr : productList) {
            if (pr.getText().equalsIgnoreCase(pName)) {
                mouseHoverToElement(pr);
                try {
                    addToProductButton.click();
                } catch (Exception e) {
                    JavascriptExecutor executor = (JavascriptExecutor) driver;
                    executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[@class='btn btn-default add-to-cart']")));
                }
                break;
            }

        }
    }
    public void clickOnSignUpLoginLink(){
        clickOnElement(signUpLoginLink);
    }

    public void scrollDownToSubscriptionLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", subscriptionText);
    }

    public void clickOnContinueButtonAfterAccountDeletedMessage() {
        clickOnElement(continueButtonAfterAccountDeletedMessage);
    }

    public String getLoggedInAsUserNameText() {
        return getTextFromElement(loggedInAsTab);
    }

    public String getRecommendedItemText() {
        return getTextFromElement(recommendedItemsText);
    }

    public void clickOnViewCartLink() {
        clickOnElement(viewCartLink);
    }

    public void clickTestCasesLink() {
        clickOnElement(testCasesLink);
    }

    public void clickContactUsLink() {
        clickOnElement(contactUsLink);
    }

    public void clickOnProductsLink() {
        clickOnElement(productsLink);
    }

    public String verifyAutomationExerciseTextOnHomePage() {
        return getTextFromElement(homePageText);
    }

    public void sendDataToSubscriptionEmail(String email) {
        sendTextToElement(subscriptionEmail, email);
    }
    @CacheLookup
    @FindBy (xpath = "//div[@id = 'recommended-item-carousel']//div[@class = 'productinfo text-center']/p")
    List<WebElement> recommendedItemsProductsList;
    public void clickAddToCartOnRecommendedItems(String pName){
        for (WebElement pr : recommendedItemsProductsList) {
            if(pr.getText().equalsIgnoreCase(pName)) {
                driver.findElement(with(By.xpath("//a[@class='btn btn-default add-to-cart']")).below(pr)).click();
                break;
            }
        }
    }

    public String getSubscriptionSuccessMessage() {
        return getTextFromElement(subscriptionSuccessMessage);
    }

    public String getSubscriptionText() {
        return getTextFromElement(subscriptionText);
    }

    public void clickOnArrowToSubscribe() {
        clickOnElement(subscriptionArrowButton);
    }

    public void clickOnBottomRightArrowButton() {
        clickOnElement(bottomRightArrowButton);
    }
    public String getFullFledgedText() {
        return getTextFromElement(fullFledgedText);
    }
}
