package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import io.cucumber.java.hu.Ha;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashSet;
import java.util.List;

public class FilesPage {

    public FilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//label[@for='select_all_files']")
    public WebElement topLeftCheckBox;

    @FindBy (xpath = "//tbody//tr//td//input[@type='checkbox']")
    public List<WebElement> allCheckBoxes;

    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement firstActionThreeDot;

    @FindBy (xpath = "//span[@class='icon icon-star-dark']")
    public WebElement removeFromFavorites;

    @FindBy (xpath = "//span[@class='icon icon-starred']")
    public WebElement addToFavorites;

    @FindBy (xpath = "(//td[@class='filename']//span[@class='nametext'])[1]")
    public WebElement firstFile;

    @FindBy (xpath = "(//span[@class='nametext extra-data'])[1]")
    public WebElement deletedFirstFile;

    @FindBy (xpath = "//a[@class='button new']")
    public WebElement addIcon;

    @FindBy (xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;

    @FindBy (xpath = "//span[@class='nametext']//span[.='sunflower']")
    public WebElement uploadedSunflowerFile;

    @FindBy (xpath = "//a[@data-action='folder']")
    public WebElement newFolder;

    @FindBy (xpath = "//input[@class='icon-confirm']")
    public WebElement submitIcon;

    @FindBy (xpath = "//span[@class='nametext']//span[.='keke']")
    public WebElement newKekeFolder;

    @FindBy (id = "view13-input-folder")
    public WebElement nameTheFolder;

    @FindBy (id = "commentsTabView")
    public WebElement commentsTab;

    @FindBy (xpath = "//div[@data-placeholder='New comment …']")
    public WebElement commentInsideCommentTab;

    @FindBy (xpath = "//input[@class=\"submit icon-confirm has-tooltip\"]")
    public WebElement commentSubmitButton;

    @FindBy (xpath = "//button[@class='settings-button']")
    public WebElement settingsDropdown;

    @FindBy (id = "showRichWorkspacesToggle")
    public WebElement dropdownOptionOne;

    @FindBy (id = "recommendationsEnabledToggle")
    public WebElement dropdownOptionTwo;

    @FindBy (id = "showhiddenfilesToggle")
    public WebElement dropdownOptionThree;

    public void actionsThreeDotActions(String string){
        switch (string){
            case "Add to Favorites":
            case "Remove from favorites":
                Driver.getDriver().findElement(By.xpath("//a[@data-action='Favorite']")).click();
                break;
            case "Details":
                Driver.getDriver().findElement(By.xpath("//a[@data-action='Details']")).click();
                break;
            case "Rename":
                Driver.getDriver().findElement(By.xpath("//a[@data-action='Rename']")).click();
                break;
            case "Move or copy":
                Driver.getDriver().findElement(By.xpath("//a[@data-action='MoveCopy']")).click();
                break;
            case "Download":
                Driver.getDriver().findElement(By.xpath("//a[@data-action='Download']")).click();
                break;
            case "Delete file":
                Driver.getDriver().findElement(By.xpath("//a[@data-action='Delete']")).click();
                break;
        }
    }

    public void locateToSubModule(String string){
        WebElement subModule = Driver.getDriver().findElement(By.linkText(string));
        subModule.click();
    }
    public WebElement selectThisFile(String thisFile){
        String xpath = "//span[@class='nametext']//span[.='" + thisFile + "']";
        WebElement selectedFile = Driver.getDriver().findElement(By.xpath(xpath));
        return selectedFile;
    }

}
