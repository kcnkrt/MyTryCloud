package com.trycloud.step_definitions;

import com.trycloud.pages.FilesPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UserStory_9 {

    FilesPage filesPage = new FilesPage();

    @When("user click Comment module")
    public void user_click_comment_module() {
        filesPage.commentsTab.click();
    }
    @When("user write a {string} comment inside the input box")
    public void user_write_a_comment_inside_the_input_box(String string) {
        filesPage.commentInsideCommentTab.sendKeys(string);
    }
    @When("user click the submit button to post it")
    public void user_click_the_submit_button_to_post_it() {
        filesPage.commentSubmitButton.click();
    }
    @Then("Verify the {string} comment is displayed in the comment section.")
    public void verify_the_comment_is_displayed_in_the_comment_section(String string) {
        String xpath = "(//div[.='"+string+"'])[1]";
        WebElement comment = Driver.getDriver().findElement(By.xpath(xpath));
        Assert.assertTrue(comment.isDisplayed());
    }


}
