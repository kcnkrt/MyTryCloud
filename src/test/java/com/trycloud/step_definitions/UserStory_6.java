package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class UserStory_6 {

    FilesPage filesPage = new FilesPage();

    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verify_that_the_file_is_removed_from_the_favorites_sub_module_s_table() {
        Assert.assertFalse(isPresent());
    }
    public boolean isPresent() {
        try {
            Driver.getDriver().findElement(By.xpath("(//td[@class='filename']//a[@class='name']//span[@class='nametext'])[1]"));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    @When("the user clicks the add icon on the top")
    public void theUserClicksTheAddIconOnTheTop() {
        filesPage.addIcon.click();
    }

    @And("users uploads file with the “upload file” option")
    public void usersUploadsFileWithTheUploadFileOption() throws AWTException {

        filesPage.uploadFile.click();
        BrowserUtils.sleep(3);

        Robot robot = new Robot();
        StringSelection path = new StringSelection("C:\\Users\\Kcank\\Desktop\\vakum\\sunflower.jpg");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        BrowserUtils.sleep(1);

        robot.keyPress(KeyEvent.VK_V);
        BrowserUtils.sleep(1);

        robot.keyRelease(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_CONTROL);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);
        BrowserUtils.sleep(1);
    }

    @Then("verify the file is displayed on the page")
    public void verifyTheFileIsDisplayedOnThePage() {
       Assert.assertTrue(filesPage.uploadedSunflowerFile.isDisplayed());
    }
}
