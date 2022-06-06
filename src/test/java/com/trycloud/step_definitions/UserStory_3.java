package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UserStory_3 {

    LoginPage loginPage = new LoginPage();
    Dashboard dashboard = new Dashboard();

    @When("the users log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
    loginPage.usernameTab.sendKeys(ConfigurationReader.getProperty("username"));
    loginPage.passwordTab.sendKeys(ConfigurationReader.getProperty("password"));
    loginPage.loginButton.click();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<WebElement> modules) {

        Assert.assertEquals(modules, dashboard.modules);
    }

}
