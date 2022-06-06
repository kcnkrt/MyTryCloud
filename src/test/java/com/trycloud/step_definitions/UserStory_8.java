package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserStory_8 {

    FilesPage filesPage = new FilesPage();

    @Then("Verify the deleted file is displayed on the page.")
    public void verify_the_deleted_file_is_displayed_on_the_page() {
        Assert.assertTrue(filesPage.deletedFirstFile.isDisplayed());
    }

}
