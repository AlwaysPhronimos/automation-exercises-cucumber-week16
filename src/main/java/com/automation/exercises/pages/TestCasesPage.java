package com.automation.exercises.pages;

import com.automation.exercises.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class TestCasesPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//b[.=\"Test Cases\"]")
    WebElement titleTestCases;

    public String getVerifyTestCasesText(){
        return getTextFromElement(titleTestCases);
    }
}
