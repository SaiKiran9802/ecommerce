package com.pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkcart {
	public WebDriver driver;
	public Checkcart(WebDriver driver) {
		this.driver=driver;
		
	}
	
	
	private By addeditem= By.xpath("(//p[@class=\"product-name\"])[1]");
	private By quantity= By.xpath("(//p[@class=\"quantity\"][1])");
	private By cartbutton= By.xpath("//img[@src=\"https://rahulshettyacademy.com/seleniumPractise/images/bag.png\"]");
	
	
	public void clickcart() {
		driver.findElement(this.cartbutton).click();
		
	}
	public String checkitem() {
		String cartitem=driver.findElement(addeditem).getText().split("-")[0].trim();
		return cartitem;
	}
	
	public String quantitycheck() {
		
		String quantitychc=driver.findElement(quantity).getText().split(" ")[0];
		return quantitychc;
		
	}
}
