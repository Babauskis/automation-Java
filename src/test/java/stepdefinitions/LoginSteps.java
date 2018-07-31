package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import general.User;
import pages.login.LoginPageObject;
import pages.signup.SignUpPageObject;

public class LoginSteps {

    private LoginPageObject login = new LoginPageObject();
    private User user = new User();

    @Given("^I have opened login page$")
    public void iHaveOpenedLoginpPage() throws Throwable {
        System.out.println("Login form is visible");
    }

    @And("^I enter Email Adress in login form$")
    public void iEnterEmailAddress() throws Throwable {
        login.enterEmail(user.getFirstName());
    }

    @And("^I enter Password in Login form$")
    public void iEnterPassword() throws Throwable {
        login.enterPassword(user.getLastName());
    }

    @And("^I select Login button from login$")
    public void iSelectLoginButton() throws Throwable {
        login.selectLoginButton();
    }

    @Then("^I login in to created account$")
    public void iFillSignUpForm() throws Throwable {
        iEnterEmailAddress();
        iEnterPassword();
        iSelectLoginButton();
    }

}
