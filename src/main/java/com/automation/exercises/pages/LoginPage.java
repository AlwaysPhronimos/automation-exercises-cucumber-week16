package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Login to your account']")
    WebElement loginToYourAccountText;

    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='New User Signup!']")
    WebElement newUserSignupText;

    @CacheLookup
    @FindBy (xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailField;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Password']")
    WebElement loginPasswordField;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Your email or password is incorrect!']")
    WebElement incorrectLoginCredentialMessage;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Login']")
    WebElement loginButton;

    @CacheLookup
    @FindBy (xpath = "//button[normalize-space()='Signup']")
    WebElement signupButton;

    @CacheLookup
    @FindBy (xpath = "//input[@placeholder='Name']")
    WebElement signupNameField;

    @CacheLookup
    @FindBy (xpath = "//input[@data-qa='signup-email']")
    WebElement signupEmailField;

    @CacheLookup
    @FindBy (xpath = "//p[normalize-space()='Email Address already exist!']")
    WebElement emailAlreadyExistErrorMessage;

    public String getTextFromLoginPage(String text){
        if(text.equalsIgnoreCase("Login to your account")){
            return getTextFromElement(loginToYourAccountText);
        } else if (text.equalsIgnoreCase("New User Signup!")) {
            return getTextFromElement(newUserSignupText);
        } else if (text.equalsIgnoreCase("Your email or password is incorrect!")) {
            return getTextFromElement(incorrectLoginCredentialMessage);
        } else {
            return "Text is not correct";
        }
    }

    public String getCurrentURL(){
        System.out.println(driver.getCurrentUrl());
        return driver.getCurrentUrl();
    }

    public void sendDataToLoginFields(String email, String password){
        sendTextToElement(loginEmailField, email);
        sendTextToElement(loginPasswordField, password);
    }

    public void sendDataToSignupFields(String name, String email){
        sendTextToElement(signupNameField, name);
        sendTextToElement(signupEmailField, email+getRandomString(2)+"@gmail.com");
    }

    public void clickOnLoginPageButton(String button){
        if (Objects.equals(button, "Login")){
            clickOnElement(loginButton);
        } else if (Objects.equals(button, "Signup")) {
            clickOnElement(signupButton);
        } else {
            System.out.println("No button clicked");
        }
    }

    public String getEmailAlreadyExistErrorMessage() {
        return getTextFromElement(emailAlreadyExistErrorMessage);
    }

    public void sendDataToNameFieldInSignUp(String name){
        sendTextToElement(signupNameField, name);
    }

    public void sendDataToEmailFieldInSignup(String email) {
        sendTextToElement(signupEmailField, email);
    }
}
