package com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WebsiteAutomation {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path to the ChromeDriver executable.
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("\"https://www.amazon.in/\""); // Replace with the actual website URL.
    }

    @Test
    public void testLoginAndAddToCart() {
        // Click on the "Login" link (assuming there's a link with this text).
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        // Enter login credentials (replace with actual username and password).
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys("your_username");
        passwordField.sendKeys("your_password");
        loginButton.click();

        // Perform a search using a search bar (replace with your search query).
        WebElement searchBar = driver.findElement(By.id("searchBar"));
        searchBar.sendKeys("example product");
        searchBar.submit();

        // Add an item to the cart (assuming there's a "Add to Cart" button).
        WebElement addToCartButton = driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')]"));
        addToCartButton.click();

        // You can add assertions or further actions as needed.
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
