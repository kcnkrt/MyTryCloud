package com.trycloud.step_definitions;

import com.trycloud.pages.Dashboard;
import com.trycloud.pages.FilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserStory_4 {

    LoginPage loginPage = new LoginPage();
    WebDriver driver = Driver.getDriver();
    Dashboard dashboard = new Dashboard();
    FilesPage filesPage = new FilesPage();

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        loginPage.login();
    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        dashboard.clickOnModule(string);
    }
    @Then("verify the page title is \"Files - Trycloud QA”")
    public void verify_the_page_title_is_files_trycloud_qa() {
        String title = driver.getTitle();
        String expectedTitle = "Files - Trycloud QA";
        Assert.assertEquals(expectedTitle,title);
    }
    @When("user click the top-left checkbox of the table")
    public void user_click_the_top_left_checkbox_of_the_table() {
       filesPage.topLeftCheckBox.click();
    }
    @Then("verify all the files are selected")
    public void verify_all_the_files_are_selected() {
        for (WebElement each : filesPage.allCheckBoxes) {
            Assert.assertTrue(each.isSelected());
        }
    }
}
