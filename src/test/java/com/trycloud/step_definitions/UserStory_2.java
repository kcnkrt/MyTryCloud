package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UserStory_2 {

    LoginPage loginPage = new LoginPage();

    @When("user enter invalid {string} and {string}")
    public void user_enter_invalid_and(String string, String string2) {
        loginPage.usernameTab.sendKeys(string);
        loginPage.passwordTab.sendKeys(string2);
    }

    @Then("verify {string} message should be displayed")
    public void verify_message_should_be_displayed(String string) {
        Assert.assertEquals(loginPage.errorMessage.getText(), string);
    }
}
