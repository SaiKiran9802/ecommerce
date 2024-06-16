package com.stepdefinitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pageclasses.Topdeals;
import com.utilities.Util;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Top_deals {

	public Util Util;
	public Top_deals(Util Util) {
		this.Util = Util;
	}

	@When("User seacrh for (.+) from Topdeatils$")
	public void user_user_seacrh_fot_from_topdeatils(String prod2) throws InterruptedException {
	    Util.pg.topdeals().clicktopdeals();
		Util.genricmethods.Switchtotopdeailswindow();
	    Util.pg.topdeals().sarchforprod2(prod2);
	    Util.Topdetailsprod=Util.pg.topdeals().getprod2result();
		
	}
	@Then("The searched products from homescreen and topdetails screen should be the same")
	public void the_searched_products_from_homescreen_and_topdetails_screen_should_be_the_same() {
	assertEquals(Util.homepageprod, Util.Topdetailsprod);
	System.out.println(Util.homepageprod + Util.Topdetailsprod);

	
	
	
	}

	
}
