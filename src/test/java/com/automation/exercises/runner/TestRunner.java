package com.automation.exercises.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/featurefiles",
        glue = "com/automation/exercises/steps",
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                "rerun:target/rerun.txt"},
        tags = "@smoke or @sanity or @regression"
)
public class TestRunner extends AbstractTestNGCucumberTests {

}
