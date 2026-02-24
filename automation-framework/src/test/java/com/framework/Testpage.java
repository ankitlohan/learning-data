package com.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Testpage {

    @FindBy(name = "search_query")
    WebElement searchBox;

    @FindBy(xpath = "//button[@title='Search']")
    WebElement searchBtn;

    @FindBy(xpath = "(//ytd-video-renderer//a[@id='thumbnail'])[2]")
    WebElement secondVideo;
    
}

