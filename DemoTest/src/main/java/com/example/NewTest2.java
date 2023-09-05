
/**
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver wd=null;
	
	@BeforeTest
	public void init() {
		  // register chrome driver 
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthik\\Downloads\\chromedriver-win32\\chromedriver.exe");
    //create an object to the driver to access the browser componenets 
    	wd=new ChromeDriver();
    	//maximize the browser 
    	wd.manage().window().maximize();
    	//to open web url -> localhost , www.
	}
	

	
  @Test(dataProvider = "dp")
  public void f(String url) {
  wd.get(url);
  Reporter.log("went to test1 and url is opened ");
  }
  
  @AfterTest
	public void close() {
		wd.close();
	}

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	//test1
      new Object[] {"https://www.google.com/"},
    //test2
      new Object[] { "https://www.amazon.in/" },
    };
  }
  }
**/

/**package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
    WebDriver wd = null;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }

    @Test(dataProvider = "dp")
    public void searchOnAmazon(String url, String searchItem) {
        wd.get(url);
        Reporter.log("Opened URL: " + url);

        // Locate the search box and enter the search item
        WebElement searchBox = wd.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchItem);

        // Submit the search
        searchBox.submit();
        Reporter.log("Searched for: " + searchItem);
    }

    @AfterTest
    public void close() {
        wd.quit();
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][] {
                // Scenario 1: Search for "samsung"
                new Object[] {"https://www.amazon.in/", "samsung"},

                // Scenario 2: Search for "apple"
                new Object[] {"https://www.amazon.in/", "apple"},
        };
    }
}**/

package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest2 {
    WebDriver wd = null;

    @BeforeTest
    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }

    @Test(dataProvider = "dp")
    public void searchOnAmazon(String url, String searchItem) {
        wd.get(url);
        Reporter.log("Opened URL: " + url);

        // Locate the search box and enter the search item
        WebElement searchBox = wd.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys(searchItem);

        // Submit the search
        searchBox.submit();
        Reporter.log("Searched for: " + searchItem);
    }

    @AfterTest
    public void close() {
        wd.quit();
    }

    @DataProvider
    public Object[][] dp() {
        return new Object[][] {
                // Scenario 1: Search for "samsung"
                new Object[] {"https://www.amazon.in/", "samsung"},

                // Scenario 2: Search for "apple"
                new Object[] {"https://www.amazon.in/", "apple"},
        };
    }
}


