package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory_10 {

    FilesPage filesPage = new FilesPage();

    @When("user clicks {string} dropdown module")
    public void user_clicks_dropdown_module(String string) {
      filesPage.settingsDropdown.click();
    }
    @Then("the user should be able to click any buttons")
    public void the_user_should_be_able_to_click_any_buttons() {
        Assert.assertTrue(filesPage.dropdownOptionOne.isEnabled());
        Assert.assertTrue(filesPage.dropdownOptionTwo.isEnabled());
        Assert.assertTrue(filesPage.dropdownOptionThree.isEnabled());
    }

}
