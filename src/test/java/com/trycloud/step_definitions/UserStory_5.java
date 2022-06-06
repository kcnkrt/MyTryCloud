package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory_5 {

    FilesPage filesPage = new FilesPage();

    @When("the user clicks action-icon from any file on the page")
    public void the_user_clicks_action_icon_from_any_file_on_the_page() {
       filesPage.firstActionThreeDot.click();
    }
    @When("user choose the {string} option")
    public void user_choose_the_option(String string) {
        BrowserUtils.sleep(2);
        filesPage.actionsThreeDotActions(string);
    }
    @When("user click the {string} sub-module on the left side")
    public void user_click_the_sub_module_on_the_left_side(String string) {
        filesPage.locateToSubModule(string);
        BrowserUtils.waitForPageToLoad(2);
    }
    @Then("Verify the chosen file is listed on the table")
    public void verify_the_chosen_file_is_listed_on_the_table() {
        Assert.assertTrue(filesPage.firstFile.isDisplayed());
    }

}
