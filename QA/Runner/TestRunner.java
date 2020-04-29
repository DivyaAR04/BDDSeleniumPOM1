package com.QA.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:/seleniumBDDFrameWork/com.CucumberBDD.Selenium.POM/src/main/java/com/QA/features/freeCRM.features",
		glue= {"com/QA/stepDefinations"},
		monochrome=true,
		strict=true,
		dryRun=false
		)




public class TestRunner {

}
