package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class AccountSteps {
    @Then("^user account page is opened$")
    public void userAccountPageIsOpened() throws Throwable {
        System.out.println("ACCOUNT CREATED!");
    }
}
