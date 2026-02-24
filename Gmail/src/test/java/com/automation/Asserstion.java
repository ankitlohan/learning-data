	package com.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Asserstion {

    @Test
    public void hardAssertDemo() {

        // Setup Chrome driver automatically
        WebDriverManager.chromedriver().setup();
        
        // Launch browser
        WebDriver driver = new ChromeDriver();

        try {
            // Open Google
            driver.get("https://www.google.com");

            // Get page title
            String actualTitle = driver.getTitle();
            String expectedTitle = "Google";

            // 1️⃣ assertEquals → check exact match
            Assert.assertEquals(actualTitle, expectedTitle, 
                    "Title is not matching");

            // 2️⃣ assertTrue → condition should be true
            Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed(),
                    "Search box is not visible");

            // 3️⃣ assertFalse → condition should be false
            Assert.assertFalse(actualTitle.isEmpty(),
                    "Title should not be empty");

            // 4️⃣ assertNotNull → object should not be null
            Assert.assertNotNull(driver,
                    "Driver is null");

            // 5️⃣ assertNull → object should be null (example)
            String test = null;
            Assert.assertNull(test, 
                    "Value should be null");

            // This line executes only if ALL above assertions pass
            System.out.println("Hard Assertion Test Passed");

        } catch (Exception e) {
            // Handle unexpected exceptions
            System.out.println("Exception occurred: " + e.getMessage());
        } finally {
            // Always close browser
            driver.quit();
        }
    }
}
