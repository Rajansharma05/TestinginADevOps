package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {

	
	WebDriver wd=null;
	
	@BeforeTest
	public void init() {
		  // register chrome driver 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
    //create an object to the driver to access the browser componenets 
    	wd=(WebDriver) new ChromeDriver();
    	//maximize the browser 
    	wd.manage().window().maximize();
    	//to open web url -> localhost , www.


	}
	
	
	@Test
  public void f() {		
		SoftAssert sf=new SoftAssert();
		wd.get("https://www.google.com/");
    	sf.assertEquals("Googl",wd.getTitle());
    	wd.get("https://www.amazon.in/");
    	sf.assertAll();//provide all the assert failures at the last
  }
	
	@AfterTest
	public void close() {
		wd.close();
	}
	
}


