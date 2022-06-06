package com.trycloud.pages;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameTab;

    @FindBy (id = "password")
    public WebElement passwordTab;

    @FindBy (id = "submit-form")
    public WebElement loginButton;

    @FindBy (xpath = "//p[@class='warning wrongPasswordMsg']")
    public WebElement errorMessage;

    public void login(){
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        usernameTab.sendKeys(ConfigurationReader.getProperty("username"));
        passwordTab.sendKeys(ConfigurationReader.getProperty("password"));
        loginButton.click();
    }

}
