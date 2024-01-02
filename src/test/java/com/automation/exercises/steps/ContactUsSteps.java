package com.automation.exercises.steps;

import com.automation.exercises.pages.ContactUsPage;
import com.automation.exercises.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsSteps {

    @When("I click on Contact Us link")
    public void iClickOnContactUsLink() {
        new HomePage().clickContactUsLink();
    }

    @Then("I verify the text GET IN TOUCH {string} is visible")
    public void iVerifyTheTextGETINTOUCHIsVisible(String arg0) {
        Assert.assertEquals(new ContactUsPage().getGetInTouchText(), "GET IN TOUCH");
    }

    @And("I enter name {string}")
    public void iEnterName(String name) {
        new ContactUsPage().enterName(name);
    }

    @And("I enter email {string}")
    public void iEnterEmail(String email) {
        new ContactUsPage().enterEmail(email);
    }

    @And("I enter subject {string}")
    public void iEnterSubject(String subject) {
        new ContactUsPage().enterSubject(subject);
    }

    @And("I enter message {string}")
    public void iEnterMessage(String message) {
        new ContactUsPage().enterMessage(message);
    }

    @And("I upload the file")
    public void iUploadTheFile() {
        new ContactUsPage().uploadMessageFile("C:\\Users\\Home\\Desktop\\Jugnu\\Software Testing");
    }
    @Then("I click on submit button")
    public void iClickOnSubmitButton() {
        new ContactUsPage().clickSubmit();
    }

    @When("I click OK button")
    public void iClickOKButton() {
        new ContactUsPage().clickOKButton();
    }

    @Then("I verify success message {string} is visible")
    public void iVerifySuccessMessageIsVisible(String arg0) {
        Assert.assertEquals(new ContactUsPage().getSuccessMessage(), "Success! Your details have been submitted successfully.");
    }
    @And("I click Home button")
    public void iClickHomeButton() { new ContactUsPage().clickHomeButton();
    }

    @Then("I verify I am on homepage")
    public void iVerifyIAmOnHomepage() {
        Assert.assertEquals(new HomePage().verifyAutomationExerciseTextOnHomePage(), "AutomationExercise");
    }
}
