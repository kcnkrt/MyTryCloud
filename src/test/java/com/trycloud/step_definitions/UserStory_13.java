package com.trycloud.step_definitions;

import com.trycloud.pages.ContactsPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class UserStory_13 {

    ContactsPage contactsPage = new ContactsPage();

    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {
        Assert.assertTrue(contactsPage.contact.isDisplayed());
    }
}
