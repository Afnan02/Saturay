package com.test.PageTestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import com.test.Utill.TestBase;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


//format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"}, src/test/resources
@CucumberOptions(features = {"Feature/"} , format={"json:target/cucumber.json","html:target/site/cucumber-pretty"},
			glue = "StepDef",
			tags= {"@test"})
	
	public class CotactTestRunner extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void setUp(){
		TestBase test = new TestBase();
		test.initialization();
	}			
	


	@AfterTest
	public void tearDown(){
		TestBase test = new TestBase();
		//test.driver.quit();
		
	
	}	
}
