package steps.registration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.registration.RegistrationPage;
import steps.BasePageSteps;
import steps.auth.AuthPageSteps;

import static constants.Constants.*;
import static constants.Messages.DoneMessages.*;

public class RegistrationPageSteps extends BasePageSteps {

    RegistrationPage registrationPage;

    public RegistrationPageSteps(WebDriver driver) {
        super(driver);
        registrationPage = new RegistrationPage(driver);
    }

    public RegistrationPageSteps verifyRegistrationUrlIslCorrectly(WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), REGISTRATION_URL);
        return this;
    }

    public RegistrationPageSteps waitRegistrationFormIsRendered() {
        registrationPage.waitRegistrationForm();
        return this;
    }

    public RegistrationPageSteps checkFirstNameFieldIsEmpty() {
        /**
         * ‘First Name’ fields are empty by default
         */
        Assert.assertEquals(registrationPage.getFirstNameField().getAttribute("defaultValue"), "");
        return this;
    }

    public RegistrationPageSteps fillFirstNameField(String firstName) {
        registrationPage.fillFieldFirstName(firstName);
        return this;
    }

    public RegistrationPageSteps checkLastNameFieldIsEmpty() {
        /**
         * ‘Last Name’ fields are empty by default
         */
        Assert.assertEquals(registrationPage.getLastNameField().getAttribute("defaultValue"), "");
        return this;
    }

    public RegistrationPageSteps fillLastNameField(String lastName) {
        registrationPage.fillFieldLastName(lastName);
        return this;
    }

    public RegistrationPageSteps checkEmailAddressFieldIsEmpty() {
        /**
         * ‘Email address’ fields are empty by default
         */
        Assert.assertEquals(registrationPage.getEmailAddressField().getAttribute("defaultValue"), "");
        return this;
    }

    public RegistrationPageSteps fillEmailAddressFieldWithData(String emailAddress) {
        registrationPage.fillEmailAddress(emailAddress);
        return this;
    }

    public RegistrationPageSteps checkPasswordFieldIsEmpty() {
        /**
         * ‘Password’ fields are empty by default
         */
        Assert.assertEquals(registrationPage.getPasswordField().getAttribute("defaultValue"), "");
        return this;
    }

    public RegistrationPageSteps fillPasswordFieldFieldWithData(String password) {
        registrationPage.fillPassword(password);
        return this;
    }

    public RegistrationPageSteps checkConfirmPasswordFieldIsEmpty() {
        /**
         * ‘Confirm password’ fields are empty by default
         */
        Assert.assertEquals(registrationPage.getConfirmPasswordField().getAttribute("defaultValue"), "");
        return this;
    }

    public RegistrationPageSteps fillConfirmPasswordFieldFieldWithData(String confPassword) {
        registrationPage.fillConfirmPassword(confPassword);
        return this;
    }

   public RegistrationPageSteps checkThatButtonSignUpIsEnabled() {
        registrationPage.getButtonSignUp().isEnabled();
        return this;
   }

    public RegistrationPageSteps clickButtonSignUp() {
        registrationPage.clickButtonSignUp();
        return this;
    }

    public RegistrationPageSteps checkThatUserRegistered() {
        Assert.assertEquals(registrationPage.getRegistrationDoneMessage().getAttribute("textContent"), MESSAGE_DONE_REGISTRATION);
        Assert.assertEquals(registrationPage.getRegistrationDoneText().getAttribute("textContent"), MESSAGE_DONE_REGISTRATION_TEXT);
        return this;
    }

    public AuthPageSteps clickButtonBackToReturnAuthPage(WebDriver driver) {
        registrationPage.clickButtonBack();
        return new AuthPageSteps(driver);
    }

}
