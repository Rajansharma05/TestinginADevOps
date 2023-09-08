package com.example;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
    WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void googleSearchTest() {
        driver.get("https://www.amazon.in/s?k=iphone+13&crid=3R88XU1LR5X21&sprefix=iphone+%2Caps%2C334&ref=nb_sb_ss_ts-doa-p_1_7");
        driver.findElement(By.name("q")).sendKeys("TestNG");
        driver.findElement(By.name("btnK")).submit();
    }

    @AfterTest
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
