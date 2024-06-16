package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	public WebDriver driver;
 
 
 
	public WebDriver webDriverManager() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis= new FileInputStream("D:\\Selenium Workspace\\ecommerce\\ src\\test\\java\\Globalfile.properties");
		prop.load(fis);
		driver= new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(prop.getProperty("QAurl"));
		
		return driver;
	}
	
	
	
}
