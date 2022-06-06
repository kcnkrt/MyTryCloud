package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TalksPage {

    public TalksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//input[@class='app-navigation-search__input']")
    public WebElement searchConvoOrUSer;

    @FindBy (xpath = "//span[@class='acli__content__line-one__title']")
    public WebElement searchedUser;

    @FindBy (xpath = "//div[@class='new-message-form__advancedinput']")
    public WebElement writeMessage;

    @FindBy (xpath = "//button[@aria-label=\"Send message\"]")
    public WebElement submitMessage;

    public WebElement sentMessage(String message){
        String xpath = "//div[@class='message__main__text']//div[.='"+message+"']";
        WebElement theMessage = Driver.getDriver().findElement(By.xpath(xpath));
        return theMessage;
    }

    public void searchUser(String user){
        searchConvoOrUSer.sendKeys(user);
    }
}
