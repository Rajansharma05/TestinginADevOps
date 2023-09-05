package Selenium.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAutomation {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the login page
        driver.get("https://accounts.google.com");
        
        // Fill in login form fields
        driver.findElement(By.id("username")).sendKeys("yourusername");
        driver.findElement(By.id("password")).sendKeys("yourpassword");
        
        // Click the login button
        driver.findElement(By.id("login-button")).click();
        
        // Perform assertions or verifications as needed
        // For example, check if login was successful
        
        // Close the browser
        driver.quit();
    }
}
