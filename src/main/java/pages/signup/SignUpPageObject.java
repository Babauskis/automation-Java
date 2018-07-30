package pages.signup;

import com.codeborne.selenide.SelenideElement;
import general.User;
import pages.account.AccountPageObject;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class SignUpPageObject {

    private SelenideElement getFirstNameField() {
        return $("test");
    }

    private SelenideElement getLastNameField() {
        return $("test");
    }

    private SelenideElement getMobileNumberField() {
        return $("test");
    }

    private SelenideElement getEmailField() {
        return $("test");
    }

    private SelenideElement getPasswordField() {
        return $("test");
    }

    private SelenideElement getConfirmField() {
        return $("test");
    }

    private SelenideElement getSignUpButton() {
        return $("test");
    }

    public void enterFirstName(String firstname) {
        getFirstNameField().sendKeys(firstname);
    }

    public void enterLastName(String lastname) {
        getLastNameField().sendKeys(lastname);
    }

    public void enterMobileNumber(String mobilenumber) {
        getMobileNumberField().sendKeys(mobilenumber);
    }

    public void enterEmail(String email) {
        getEmailField().sendKeys(email);
    }

    public void enterPassword(String password) {
        getPasswordField().sendKeys(password);
    }

    public void enterConfirmPassword(String password) {
        getConfirmField().sendKeys(password);
    }

    public AccountPageObject selectSignUpButton() {
        getSignUpButton().click();
        return page(AccountPageObject.class);
    }
}
