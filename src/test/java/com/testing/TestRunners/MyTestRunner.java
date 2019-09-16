package com.testing.TestRunners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import stepdefinitions.BaseStepDef;



/**
 * @author vijayakarthikeyanarul
 *
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
				 glue="stepdefinitions",
                 plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
             			   "junit:target/cucumber-reports/Cucumber.xml",
            			   "html:target/cucumber-reports",
            			   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 monochrome = true,
                 dryRun = false,
                 tags = "@design"
				 )
public class MyTestRunner extends BaseStepDef{
	
	@AfterClass
	public static void teardown() {
		getDriver().quit();
	}
	
	
}
