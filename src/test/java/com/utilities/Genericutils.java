package com.utilities;

import static org.junit.Assert.assertNull;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Genericutils {
	WebDriver driver;
	 

	public Genericutils(WebDriver driver) {
		this.driver=driver;
		}
	public void Switchtotopdeailswindow() {
		//Topdeals tp= new Topdeals(Util.driver);
		//Util.driver.findElement(By.xpath("//a[text()=\"Top Deals\"]")).click();
		if(driver.getCurrentUrl().equalsIgnoreCase("https://rahulshettyacademy.com/seleniumPractise/#/")) {
	    Set<String> wd=driver.getWindowHandles();
		Iterator<String> id= wd.iterator();
		String parentwindow=id.next();
		String childwindow=id.next();
	    driver.switchTo().window(childwindow);
		}else {
			assertNull("you are on inocrrect page");
		}
	}
}
