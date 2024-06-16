package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/com/featurefiles", 
                  glue="com/stepdefinitions", 
                  monochrome=true,
                  dryRun=false,
                  tags= "@cart",
                  plugin= {"pretty","html: ecommerce.html"})
public class Runner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel= false) 
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
	
	
}
