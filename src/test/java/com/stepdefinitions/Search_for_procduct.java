package com.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pageclasses.PageObjectManager;
import com.pageclasses.Searchforproduct;
import com.utilities.Util;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search_for_procduct {

	    public Util Util;
	    
public Search_for_procduct(Util Util) {
			this.Util = Util;
			
		}
	 
@Given("User is on landing page")
public void user_is_on_landing_page() {
		
		Util.pg.searchforprod1().verifyheader();
	}
@When("User Search for the product (.+)$")
public void user_search_for_the_product(String prod) throws InterruptedException {
	    
	
		Util.pg.searchforprod1().seachforprod(prod);
		Thread.sleep(3000);
	    Util.homepageprod=Util.pg.searchforprod1().getprod1result();
	    
	}
}
