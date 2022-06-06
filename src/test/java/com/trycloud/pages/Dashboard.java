package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Locale;

public class Dashboard {

    public Dashboard(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> modules;

    @FindBy (xpath = "//span[@aria-label=\"Magnify icon\"]")
    public WebElement magnifierIcon;

    @FindBy (xpath = "//h3[@title='keke']")
    public WebElement kekeFolder;

    @FindBy (xpath = "//form[@role='search']//input[@type='search']")
    public WebElement searchForFileFolders;

    public void clickOnModule(String module){
        module = module.toLowerCase(Locale.ROOT);
        String xpath = "//ul[@id='appmenu']//li[@data-id='" +module+"']";
        Driver.getDriver().findElement(By.xpath(xpath)).click();
    }

}
