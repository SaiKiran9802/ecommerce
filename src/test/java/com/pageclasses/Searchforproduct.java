package com.pageclasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utilities.Util;

public class Searchforproduct {
 
	public WebDriver driver;
	public Searchforproduct(WebDriver driver) {
		this.driver=driver;
		
	}
	private By search= By.xpath("//input[@type=\"search\"]");
	private By header= By.xpath("//header//div[@class=\"brand greenLogo\"]");
	private By prod1= By.xpath("//h4");
	private By pluseicon= By.xpath("//a[text()=\"+\"]");
	private By addtocartbutton= By.xpath("//button[text()=\"ADD TO CART\"]");
	
	
	
public void seachforprod(String prod1) throws InterruptedException {
	
	driver.findElement(search).sendKeys(prod1);
	//Thread.sleep(3000);
}
public String getprod1result() {
	
	String[] str=driver.findElement(prod1).getText().split("-");
    String str2=str[0];
    String prod1result=str2.trim();
    return prod1result;
}
 public void verifyheader() {
	 
	 driver.findElement(header).isDisplayed();
	 
 }
public int additemtocart(int pluseicon) {
	
	for(int i=1; i<pluseicon; i++) {
	driver.findElement(this.pluseicon).click();
	}
	driver.findElement(addtocartbutton).click();
return pluseicon;
}
	
	
}
