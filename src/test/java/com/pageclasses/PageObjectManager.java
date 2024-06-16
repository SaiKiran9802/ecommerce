package com.pageclasses;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	
	Searchforproduct search1;
	Topdeals dealspage;
	Checkcart cart;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		}
	public Searchforproduct searchforprod1() {
		search1=new Searchforproduct(driver);
		return search1;
	}
	
	public Topdeals topdeals() {
		dealspage =new Topdeals(driver);
		return dealspage;
	}	
	
	public Checkcart cart() {
		cart= new Checkcart(driver);
		return cart;
	}
}
