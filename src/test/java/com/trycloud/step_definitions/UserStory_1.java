package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class UserStory_1 {

    WebDriver driver = Driver.getDriver();
    LoginPage loginPage = new LoginPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        driver.get(ConfigurationReader.getProperty("env"));
    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String string, String string2) {
        loginPage.usernameTab.sendKeys(string);
        loginPage.passwordTab.sendKeys(string2);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginButton.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Dashboard"));
    }

}
