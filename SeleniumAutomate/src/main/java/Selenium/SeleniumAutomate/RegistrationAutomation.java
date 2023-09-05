package Selenium.SeleniumAutomate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationAutomation {
    public static void main(String[] args) {
        // Set the path to your ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJAN\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the registration page
        driver.get("https://accounts.google.com/signup");
        
        // Fill in registration form fields
        driver.findElement(By.id("username")).sendKeys("yourusername");
        driver.findElement(By.id("password")).sendKeys("yourpassword");
        driver.findElement(By.id("email")).sendKeys("youremail@example.com");
        
        // Click the registration button
        driver.findElement(By.id("register-button")).click();
        
        // Perform assertions or verifications as needed
        // For example, check if registration was successful
        
        // Close the browser
        driver.quit();
    }
}
