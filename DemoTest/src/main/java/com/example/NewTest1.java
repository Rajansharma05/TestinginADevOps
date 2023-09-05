
/**import org.testng.annotations.Test;

public class NewTest1 {

	@Test(groups = {"Eduction"})
	public void test1() {
		System.out.println("this is test 1");
		
	}
	
	
	@Test(groups = {"smoke","functional"})
	public void test2() {
		System.out.println("this is test 2");
	}
	
	
	@Test(groups = {"regression"})
	public void test3() {
		System.out.println("this is test 3");
	}

}
**/

package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class NewTest1 {
    private WebDriver driver;

    @BeforeGroups(groups = {"Education"})
    public void beforeEducationGroup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        System.out.println("Redirecting to Simplilearn.com and Mphasis.com");
        driver.get("https://www.simplilearn.com");
        driver.get("https://www.mphasis.com");
    }
   

    @BeforeGroups(groups = {"Shopping"})
    public void beforeShoppingGroup() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
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

    @Test(groups = {"Education"})
    public void test1() {
        System.out.println("this is test 1 for Education");
        // Add education-related test logic here
    }

    @Test(groups = {"Shopping"})
    public void test2() {
        System.out.println("this is test 2 for Shopping");
        // Add shopping-related test logic here
    }

    @Test(groups = {"Regression"})
    public void test3() {
        System.out.println("this is test 3 for Regression");
        // Add regression-related test logic here
    }
}
