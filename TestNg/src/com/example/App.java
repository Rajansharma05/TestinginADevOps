package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
       // register chrome driver 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
    //create an object to the driver to access the browser componenets 
    	WebDriver wd=new ChromeDriver();
    	//maximize the browser 
    	wd.manage().window().maximize();
    	//to open web url -> localhost , www.
    	wd.get("https://www.amazon.in/");
    	wd.findElement(By.linkText("Start here.")).click();
    	wd.findElement(By.id("ap_customer_name")).sendKeys("karthik");
    	wd.findElement(By.id("ap_phone_number")).sendKeys("1234566789");
    	wd.findElement(By.id("ap_email")).sendKeys("k@c.c");
    	wd.findElement(By.id("ap_password")).sendKeys("123456789");
    	wd.findElement(By.id("continue")).click();

    	//close the browser
    	wd.close();
    }
}

