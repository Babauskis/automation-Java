package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.header.NavigationPageObject;

public class HomepageSteps {

    private NavigationPageObject homepage = new NavigationPageObject();

    @Given("^I have opened homepage$")
    public void iHaveOpenedHomepage() throws Throwable {
        System.out.println("Navigation is visible");
    }

    @When("^I select My account menu$")
    public void iSelectMyAccountMenu() throws Throwable {
        homepage.selectMyAccountButton();
    }

    @And("^I select Sign up button$")
    public void iSelectSignUpButton() throws Throwable {
        homepage.selectSignUpButton();
    }

    @And("^I select Login button$")
    public void iSelectLoginButton() throws Throwable {
        homepage.selectLoginButton();
    }

    @When("^I navigate to SignUp page$")
        public void iNavigateToSignUpPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectSignUpButton();
    }


    @When("^I navigate to Login page$")
    public void iNavigateToLoginPage() throws Throwable {
        iSelectMyAccountMenu();
        iSelectLoginButton();
    }

    @And("^I select Logout button$")
    public void iSelectLogoutButton() throws Throwable {
        homepage.selectLogoutButton();
    }

    @Then("^I logout from account")
    public void iLogoutFromAccount() throws Throwable {
        iSelectMyAccountMenu();
        iSelectLogoutButton();
    }


}
