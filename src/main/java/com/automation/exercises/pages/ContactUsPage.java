package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends Utility {
    @CacheLookup
    @FindBy (xpath = "//h2[text()='Get In Touch']")
    WebElement verityText;

    @CacheLookup
    @FindBy (xpath = "//input[@name='name']")
    WebElement nameField;

    @CacheLookup
    @FindBy (xpath = "//input[@name='email']")
    WebElement emailField;

    @CacheLookup
    @FindBy (xpath = "//input[@name='subject']")
    WebElement subjectField;

    @CacheLookup
    @FindBy (xpath = "//textarea[@name='message']")
    WebElement messageField;

    @CacheLookup
    @FindBy (xpath = "//input[@name='upload_file']")
    WebElement file;

    @CacheLookup
    @FindBy (xpath = "//input[@name='submit']")
    WebElement submitButton;

    @CacheLookup
    @FindBy (name = "submit")
    WebElement okButton;

    @CacheLookup
    @FindBy (xpath = "//div[@class='status alert alert-success']")
    WebElement successMessage;

    @CacheLookup
    @FindBy (xpath = "//i[@class='fa fa-angle-double-left']")
    WebElement homeButton;

    public String getGetInTouchText(){
        return getTextFromElement(verityText);
    }
    public void enterName(String name){
        sendTextToElement(nameField, name);
    }
    public void enterEmail(String email){
        sendTextToElement(emailField, email);
    }
    public void enterSubject(String subject){
        sendTextToElement(subjectField, subject);
    }
    public void enterMessage(String message){
        sendTextToElement(messageField, message);
    }
    public void uploadMessageFile(String uploadFile){
        sendTextToElement(file, uploadFile);
    }
    public void clickSubmit(){
        clickOnElement(submitButton);
    }

    public void clickOKButton(){
        driver.switchTo().alert().accept();
    }

    public String getSuccessMessage(){
        return getTextFromElement(successMessage);
    }

    public void clickHomeButton(){
        clickOnElement(homeButton);
    }

}
