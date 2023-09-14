/**
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
/**
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
                //new Object[] {"https://www.amazon.in/", "samsung"},

                // Scenario 2: Search for "apple"
                new Object[] {"https://www.flipkart.com/", "iPhone 13"},
        };
    }
}

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

/**

package com.example;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest2 {
    private WebDriver driver;

    @BeforeGroups(groups = {"Shopping"})
    public void beforeShoppingGroup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Redirecting to Amazon.in");
        driver.get("https://www.amazon.in");
    }

    @AfterSuite
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(groups = {"Shopping"})
    public void test1() {
        // Registration (Sign up) on Amazon
        System.out.println("Test 1 for Shopping - Registration");

        // Navigate to Amazon's registration page (You may need to adapt this URL)
        driver.get("https://www.amazon.in/ap/register");

        // Fill in registration form fields
        WebElement nameField = driver.findElement(By.id("ap_customer_name"));
        nameField.sendKeys("John Doe");

        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("johndoe@example.com");

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("yourpassword");

        WebElement reenterPasswordField = driver.findElement(By.id("ap_password_check"));
        reenterPasswordField.sendKeys("yourpassword");

        WebElement continueButton = driver.findElement(By.id("continue"));
        continueButton.click();

        // Additional registration steps can be added as needed

        // Verify successful registration
        WebElement successMessage = driver.findElement(By.xpath("//div[@class='a-box-inner']/h4"));
        assert successMessage.getText().contains("Hello, John Doe");
    }

    @Test(groups = {"Shopping"})
    public void test2() {
        // Login to Amazon
        System.out.println("Test 2 for Shopping - Login");

        // Navigate to Amazon's login page (You may need to adapt this URL)
        driver.get("https://www.amazon.in/ap/signin");

        // Fill in login credentials
        WebElement emailField = driver.findElement(By.id("ap_email"));
        emailField.sendKeys("johndoe@example.com");

        WebElement passwordField = driver.findElement(By.id("ap_password"));
        passwordField.sendKeys("yourpassword");

        WebElement signInButton = driver.findElement(By.id("signInSubmit"));
        signInButton.click();

        // Additional login steps can be added as needed

        // Verify successful login (You can add assertions or checks here)
    }

    @Test(groups = {"Shopping"})
    public void test3() {
        // Search on Amazon
        System.out.println("Test 3 for Shopping - Search");

        // Locate the search input field and enter a search query
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys("laptop");

        // Submit the search query
        searchInput.submit();

        // Additional search-related actions can be added as needed

        // Verify search results (You can add assertions or checks here)
    }

    @Test(groups = {"Shopping"})
    public void test4() {
        // Add-to-Cart on Amazon
        System.out.println("Test 4 for Shopping - Add to Cart");

        // Locate and click on a product (You may need to adapt this selector)
        WebElement productLink = driver.findElement(By.xpath("//a[contains(@href, '/product/')]"));
        productLink.click();

        // Locate and click on the "Add to Cart" button (You may need to adapt this selector)
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        // Additional add-to-cart actions can be added as needed

        // Verify that the product has been added to the cart (You can add assertions or checks here)
    }
}
**/
package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FlipkartLazyLoadingTest {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set up WebDriver (Make sure to download and set up the ChromeDriver executable)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testLazyLoadingFeature() {
        // Navigate to Flipkart homepage
        driver.get("https://www.flipkart.com/");

        // Perform a search for "iPhone 13" under the "Mobile" category
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("iPhone 13");
        searchBox.submit();

        // Scroll down to trigger lazy loading
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

     // Assuming you have already scrolled down to load more products
     // Replace this XPath with the appropriate locator for the specific image you want to check
     String imageXPath = "//div[@class='CXW8mj _3nMexc']//img[@alt='APPLE iPhone 13 (Midnight, 128 GB)']";

     WebElement fullImage = driver.findElement(By.xpath(imageXPath));

     // Check if the image is displayed (loaded)
        // Check if images are loaded till the screen height
        // You can use appropriate locators and assertions here

        // Check the presence of a scroll feature
        // You can use appropriate locators and assertions here

        // Check the frequency of content refresh while scrolling
        // You can use appropriate locators and assertions here
    }

    @AfterClass
    public void tearDown() {
        // Close the WebDriver instance
        if (driver != null) {
            driver.quit();
        }
    }
}

