package com.trycloud.step_definitions;

import com.trycloud.pages.TalksPage;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class UserStory_11 {

    TalksPage talksPage = new TalksPage();

    @When("the user clicks the Talk module")
    public void theUserClicksTheTalkModule() {
        // this is an exception, that's why we didn't use the locateToModule method
        Driver.getDriver().findElement(By.xpath("//ul[@id='appmenu']//li[@data-id='spreed']")).click();
    }

    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String string) {
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(string));
    }

    @And("user search user {string} from the search box")
    public void userSearchUserFromTheSearchBox(String arg0) {
        talksPage.searchUser(arg0);
        talksPage.searchedUser.click();
    }

    @And("user write {string} message")
    public void userWriteMessage(String arg0) {
        BrowserUtils.waitForPageToLoad(2);
        talksPage.writeMessage.sendKeys(arg0);
    }

    @And("user clicks to submit button")
    public void userClicksToSubmitButton() {
        BrowserUtils.sleep(1);
        talksPage.submitMessage.click();
    }

    @Then("the user should be able to see the {string} message is displayed on the conversation log")
    public void theUserShouldBeAbleToSeeTheMessageIsDisplayedOnTheConversationLog(String arg0) {
        Assert.assertTrue(talksPage.sentMessage(arg0).isDisplayed());
    }


}
