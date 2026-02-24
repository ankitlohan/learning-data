package com.demo.framework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestPage {

    @FindBy(xpath = "//a[@href='/elements']")
    public WebElement elementsLink;

    @FindBy(xpath = "//span[text()='Text Box']")
    public WebElement textBoxMenu;

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement userEmail;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddress;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(xpath = "//*[@href='/checkbox']")
    public WebElement checkBoxMenu;

    @FindBy(xpath = "//span[text()='Home']/../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")
    public WebElement homeExpand;

    @FindBy(xpath = "//span[text()='Desktop'] /../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")
    public WebElement desktopExpand;
    
    @FindBy(xpath = "//span[text()='Documents']/../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")
    public WebElement documentExpand;

    @FindBy(xpath = "//span[text()='Downloads'] /../..//span[@class='rc-tree-switcher rc-tree-switcher_close']")
    public WebElement downloadExpand;
    
    @FindBy (xpath = "//span[text()='Notes'] /../..//span[@class='rc-tree-checkbox']")
    public WebElement selectNotes;
    
    @FindBy (xpath = "//span[text()='Commands'] /../..//span[@class='rc-tregfkgke-checkbox']")
    public WebElement selectCommands;
  
    
    
    
}