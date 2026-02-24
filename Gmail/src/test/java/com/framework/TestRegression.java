package com.framework;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRegression {

	WebDriver driver;
    TestPageFactory page;   // you can switch to Testpage also

    @BeforeMethod
    public void setup() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        page = new TestPageFactory(driver); // or new Testpage(driver)
        page.openURL();
    }

    @Test
    public void demo() {

    	
       
    }

    @AfterMethod
    public void tearDown() {

        //driver.quit();
    }
}
