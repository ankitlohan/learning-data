package com.demo.framework;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainTest {

    WebDriver driver;
    TestPageFactory page;

    @BeforeClass
    public void setUp() {
        driver = TestPageFactory.setUpDriver();
        page = new TestPageFactory(driver);
        page.openApplication();
    }

    @Test(priority = 1)
    public void testTextBox() {
        page.clickElements();
        page.openTextBox();
        page.fillTextBox();
    }

    @Test(priority = 2)
    public void testCheckBox() {
        page.CheckBox();
        page.openCheckBox();
        page.selectCheckBox();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}