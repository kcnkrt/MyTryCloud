package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory_7 {

    FilesPage filesPage = new FilesPage();

    @When("user click \"new folder”")
    public void user_click_new_folder() {
        filesPage.newFolder.click();
    }
    @When("user write a folder name")
    public void user_write_a_folder_name() {
        filesPage.nameTheFolder.sendKeys("keke");
    }
    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        filesPage.submitIcon.click();
    }
    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        Assert.assertTrue(filesPage.newKekeFolder.isDisplayed());
    }
}
