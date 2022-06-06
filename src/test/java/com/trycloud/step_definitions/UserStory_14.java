package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory_14 {

    Dashboard dashboard = new Dashboard();

    @When("the user clicks the magnifier icon on the right top")
    public void the_user_clicks_the_magnifier_icon_on_the_right_top() {
      dashboard.magnifierIcon.click();
    }
    @When("users search any {string} existing file folder user name")
    public void users_search_any_existing_file_folder_user_name(String string) {
        dashboard.searchForFileFolders.sendKeys(string);
    }
    @Then("verify the {string} displays the expected result option")
    public void verify_the_displays_the_expected_result_option(String string) {
        // can create a folder method
        Assert.assertTrue(dashboard.kekeFolder.isDisplayed());
    }

}
