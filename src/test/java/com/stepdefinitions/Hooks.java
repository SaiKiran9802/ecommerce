 package com.stepdefinitions;

import java.io.IOException;

import com.utilities.Util;

import io.cucumber.java.After;

public class Hooks {

	  public Util Util;
	    
	  public Hooks(Util Util) {
	   			this.Util = Util;
	   			
	   		}
	
	
	 @After
	 public void  closethebrowser() throws IOException {
		 
		 Util.base.driver.quit();
		 
		 
	 }
	
	
	
	
	
	
	
}
