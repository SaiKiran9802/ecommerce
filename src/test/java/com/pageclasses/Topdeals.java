package com.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Util;

public class Topdeals {

	public WebDriver driver;
	public Topdeals(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	private By search= By.xpath("//input[@type=\"search\"]");
	private By topdeals= By.xpath("//a[text()=\"Top Deals\"]");
	private By prod2= By.xpath("//td[1]");
	
	
	public void sarchforprod2(String prod2) {
		driver.findElement(search).sendKeys(prod2);
		
	}
	public String getprod2result() {
		
		String prod2=driver.findElement(this.prod2).getText();
		return prod2;
	  }
	public void clicktopdeals() {
		driver.findElement(topdeals).isDisplayed();
		driver.findElement(topdeals).click();
	}
	
	
}
