package com.utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.pageclasses.PageObjectManager;

public class Util {	
	//public WebDriver driver;
	public String Topdetailsprod;
	public String homepageprod;
	public PageObjectManager pg;
	public TestBase base;
	public Genericutils genricmethods;
	
	public Util() throws Exception {
		base= new TestBase();
		pg= new PageObjectManager(base.webDriverManager());
		genricmethods= new Genericutils(base.driver);
	}
	
}
