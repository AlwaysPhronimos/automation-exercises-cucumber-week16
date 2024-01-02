package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends Utility {

    private static final Logger log = LogManager.getLogger(PaymentPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Payment']")
    WebElement paymentPageWelcomeText;

    @CacheLookup
    @FindBy (xpath = "//input[@name='name_on_card']")
    WebElement nameOnCardField;

    @CacheLookup
    @FindBy (xpath = "//input[@name='card_number']")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='ex. 311']")
    WebElement CVCField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='MM']")
    WebElement expirationMonthField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='YYYY']")
    WebElement expirationYearField;

    @CacheLookup
    @FindBy (xpath = "//button[@id='submit']")
    WebElement payAndConfirmButton;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Congratulations! Your order has been confirmed!']")
    WebElement orderConfirmationMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Download Invoice']")
    WebElement downloadInvoiceButtonAfterOrderSuccessMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterOrderSuccessMessage;

    public String getWelcomeTextOnPaymentPage() {
        return getTextFromElement(paymentPageWelcomeText);
    }
    public void sendPaymentDetails(String name, String cNumber, String CVCNumber, String eMonth, String eYear){
        sendTextToElement(nameOnCardField, name);
        sendTextToElement(cardNumberField, cNumber);
        sendTextToElement(CVCField, CVCNumber);
        sendTextToElement(expirationMonthField, eMonth);
        sendTextToElement(expirationYearField, eYear);
    }

    public void clickOnPayAndConfirmOrderButton() {
        clickOnElement(payAndConfirmButton);
    }

    public String getOrderConfirmationMessage(){
        return getTextFromElement(orderConfirmationMessage);
    }

    public void clickOnDownloadInvoiceButtonAfterOrderSuccessMessage() {
        clickOnElement(downloadInvoiceButtonAfterOrderSuccessMessage);
    }

    public void clickOnContinueButtonAfterOrderSuccessMessage() {
        clickOnElement(continueButtonAfterOrderSuccessMessage);
    }
}
