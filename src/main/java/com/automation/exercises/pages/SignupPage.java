package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignupPage.class.getName());

    @CacheLookup
    @FindBy(id = "id_gender1")
    WebElement titleAsMrRadioButton;

    @CacheLookup
    @FindBy (id = "id_gender2")
    WebElement titleAsMrsRadioButton;

    @CacheLookup
    @FindBy (id = "password")
    WebElement passwordField;

    @CacheLookup
    @FindBy (id = "days")
    WebElement dayInDOBDropdown;

    @CacheLookup
    @FindBy (id = "months")
    WebElement monthInDOBDropdown;

    @CacheLookup
    @FindBy (id = "years")
    WebElement yearInDOBDropdown;

    @CacheLookup
    @FindBy (id = "first_name")
    WebElement fNameFieldInAddressInfo;

    @CacheLookup
    @FindBy (id = "last_name")
    WebElement lNameFieldInAddressInfo;

    @CacheLookup
    @FindBy (id = "address1")
    WebElement address1Field;

    @CacheLookup
    @FindBy (id = "address2")
    WebElement address2Field;

    @CacheLookup
    @FindBy (id = "country")
    WebElement countryDropDown;

    @CacheLookup
    @FindBy (id = "state")
    WebElement stateField;

    @CacheLookup
    @FindBy (id = "city")
    WebElement cityField;

    @CacheLookup
    @FindBy (id = "zipcode")
    WebElement zipcodeField;

    @CacheLookup
    @FindBy (id = "mobile_number")
    WebElement mobileNumberField;

    @CacheLookup
    @FindBy (xpath = "(//button[@type = 'submit'])[1]")
    WebElement createAccountButton;

    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Account Created!']")
    WebElement accountCreatedMessage;

    @CacheLookup
    @FindBy (xpath = "//a[normalize-space()='Continue']")
    WebElement continueButtonAfterAccountCreated;

    @CacheLookup
    @FindBy (xpath = "//b[normalize-space()='Enter Account Information']")
    WebElement enterAccountInformationText;

    @CacheLookup
    @FindBy (xpath = "//input[@id='newsletter']")
    WebElement newsLetterCheckBox;

    @CacheLookup
    @FindBy (xpath = "//input[@id='optin']")
    WebElement specialOfferCheckBox;


    public void sendDataToSignupForm(String title, String password, String day, String month, String year, String fName,
                                     String lName, String add1, String add2, String country, String state, String city,
                                     String zipcode, String mNumber) {
        if (title.equalsIgnoreCase("Mr")){
            clickOnElement(titleAsMrRadioButton);
        } else {
            clickOnElement(titleAsMrsRadioButton);
        }
        sendTextToElement(passwordField, password);
        selectByVisibleTextFromDropDown(dayInDOBDropdown, day);
        selectByVisibleTextFromDropDown(monthInDOBDropdown, month);
        selectByVisibleTextFromDropDown(yearInDOBDropdown, year);
        sendTextToElement(fNameFieldInAddressInfo, fName);
        sendTextToElement(lNameFieldInAddressInfo, lName);
        sendTextToElement(address1Field, add1);
        sendTextToElement(address2Field, add2);
        selectByVisibleTextFromDropDown(countryDropDown, country);
        sendTextToElement(stateField, state);
        sendTextToElement(cityField, city);
        sendTextToElement(zipcodeField, zipcode);
        sendTextToElement(mobileNumberField, mNumber);
    }

    public void clickOnCreateAccountButton() {
        // clickOnElement(createAccountButton);
        try {
            createAccountButton.click();
        } catch (Exception e) {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button[@type = 'submit'])[1]")));
        }
    }

    public String getAccountCreatedMessage() {
        return getTextFromElement(accountCreatedMessage);
    }

    public void clickOnContinueButtonAfterAccountCreated() {
        clickOnElement(continueButtonAfterAccountCreated);
    }

    public String getEnterAccountInformation() {
        return getTextFromElement(enterAccountInformationText);
    }

    public void clickOnSignUpNewLetterCheckBox() {
        clickOnElement(newsLetterCheckBox);
    }

    public void clickOnReceiveSpecialOfferCheckBox() {
        clickOnElement(specialOfferCheckBox);
    }

}
