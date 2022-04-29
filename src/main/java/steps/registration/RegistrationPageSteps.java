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

    public RegistrationPageSteps checkRegistrationUrlIslCorrectly(WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), REGISTRATION_URL, "Incorrect URL!!!");
        return this;
    }

    public RegistrationPageSteps waitRegistrationFormIsRendered() {
        registrationPage.waitRegistrationForm();
        Assert.assertTrue(registrationPage.getRegistrationForm().isDisplayed(), "'Registration Form' is not displayed!!!");
        return this;
    }

    public RegistrationPageSteps checkFirstNameFieldIsEmpty() {
        Assert.assertEquals(registrationPage.getFirstNameField().getAttribute("defaultValue"), "", "‘First Name’ field is not empty by default!!!");
        return this;
    }

    public RegistrationPageSteps fillFirstNameField(String firstName) {
        registrationPage.fillFieldFirstName(firstName);
        return this;
    }

    public RegistrationPageSteps checkLastNameFieldIsEmpty() {
        Assert.assertEquals(registrationPage.getLastNameField().getAttribute("defaultValue"), "", "'Last Name’ field is not empty by default!!!");
        return this;
    }

    public RegistrationPageSteps fillLastNameField(String lastName) {
        registrationPage.fillFieldLastName(lastName);
        return this;
    }

    public RegistrationPageSteps checkEmailAddressFieldIsEmpty() {
        Assert.assertEquals(registrationPage.getEmailAddressField().getAttribute("defaultValue"), "", "‘Email address’ field is not empty by default!!!");
        return this;
    }

    public RegistrationPageSteps fillEmailAddressFieldWithData(String emailAddress) {
        registrationPage.fillEmailAddress(emailAddress);
        return this;
    }

    public RegistrationPageSteps checkPasswordFieldIsEmpty() {
        Assert.assertEquals(registrationPage.getPasswordField().getAttribute("defaultValue"), "", "‘Password’ field is not empty by default!!!");
        return this;
    }

    public RegistrationPageSteps fillPasswordFieldFieldWithData(String password) {
        registrationPage.fillPassword(password);
        return this;
    }

    public RegistrationPageSteps checkConfirmPasswordFieldIsEmpty() {
        Assert.assertEquals(registrationPage.getConfirmPasswordField().getAttribute("defaultValue"), "", "'Confirm password’ field is not empty by default");
        return this;
    }

    public RegistrationPageSteps fillConfirmPasswordFieldFieldWithData(String confPassword) {
        registrationPage.fillConfirmPassword(confPassword);
        return this;
    }

    public RegistrationPageSteps checkThatButtonSignUpIsEnabled() {
        Assert.assertTrue(registrationPage.getButtonSignUp().isEnabled(), "'Button SignUp' is not enabled!!!");
        return this;
    }

    public RegistrationPageSteps clickButtonSignUp() {
        registrationPage.clickButtonSignUp();
        return this;
    }

    public RegistrationPageSteps checkRegisterSuccessMessage() {
        Assert.assertEquals(registrationPage.getRegistrationDoneMessage().getAttribute("textContent"), MESSAGE_DONE_REGISTRATION);
        return this;
    }

    public RegistrationPageSteps checkRegisterSuccessText() {
        Assert.assertEquals(registrationPage.getRegistrationDoneText().getAttribute("textContent"), MESSAGE_DONE_REGISTRATION_TEXT);
        return this;
    }

    public AuthPageSteps clickButtonBackToReturnAuthPage(WebDriver driver) {
        registrationPage.clickButtonBack();
        return new AuthPageSteps(driver);
    }

    public RegistrationPageSteps clickOutField() {
        registrationPage.getRegistrationTitle().click();
        return this;
    }

    public void verifyFirstNameErrorMessage(String error) {

        Assert.assertEquals(registrationPage.getMessageErrorFirstName().getText(), error, "Message error does not match!!!");
    }

    public void verifyLastNameErrorMessage(String error) {

        Assert.assertEquals(registrationPage.getMessageErrorLastName().getText(), error, "Message error does not match!!!");
    }

    public void verifyEmailErrorMessage(String error) {

        Assert.assertEquals(registrationPage.getMessageErrorEmail().getText(), error, "Message error does not match!!!");
    }

    public void verifyPasswordErrorMessage(String error) {

        Assert.assertEquals(registrationPage.getMessageErrorPassword().getText(), error, "Message error does not match!!!");
    }

    public void verifyConfirmPasswordErrorMessage(String error) {

        Assert.assertEquals(registrationPage.getMessageErrorPasswordConfirm().getText(), error, "Message error does not match!!!");
    }

    public void verifyExistingAccountErrorMessage(String error) {

        Assert.assertEquals(registrationPage.getMessageExistingAccount().getText(), error, "Message error does not match!!!");
    }

    public RegistrationPageSteps waitMessageIsRendered() {
        registrationPage.waitWebElementVisible(registrationPage.getMessageExistingAccount(), ELEMENT_WAIT);
        Assert.assertTrue(registrationPage.getRegistrationForm().isDisplayed(), "'Message Alert' is not displayed!!!");
        return this;
    }
}
