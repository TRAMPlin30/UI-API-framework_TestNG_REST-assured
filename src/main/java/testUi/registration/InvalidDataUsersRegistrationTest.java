package testUi.registration;

import testUi.base.BaseTest;
import org.testng.annotations.Test;
import entities.InvalidDataEntity;
import pages.registration.invalidDataForRegistration.InvalidStaticProvider;
import steps.registration.RegistrationPageSteps;

public class InvalidDataUsersRegistrationTest extends BaseTest {

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidFirstName")
    public void verifyErrorMessagesFirstNameField(InvalidDataEntity invalidData) {
        authPageSteps
                .openWhatProjectApp()
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .fillFirstNameField(invalidData.getFirstNameValue())
                .clickOutField()
                .verifyFirstNameErrorMessage(invalidData.getFirstNameError());
    }

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidLastName")
    public void verifyErrorMessagesLastNameField(InvalidDataEntity invalidData) {
        authPageSteps
                .openWhatProjectApp()
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .fillLastNameField(invalidData.getLastNameValue())
                .clickOutField()
                .verifyLastNameErrorMessage(invalidData.getLastNameError());
    }

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidEmail")
    public void verifyErrorMessagesEmailField(InvalidDataEntity invalidData) {
        authPageSteps
                .openWhatProjectApp()
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .fillEmailAddressFieldWithData(invalidData.getEmailValue())
                .clickOutField()
                .verifyEmailErrorMessage(invalidData.getEmailError());
    }

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidPassword")
    public void verifyErrorMessagesPasswordField(InvalidDataEntity invalidData) {
        authPageSteps
                .openWhatProjectApp()
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .fillPasswordFieldFieldWithData(invalidData.getPasswordValue())
                .clickOutField()
                .verifyPasswordErrorMessage(invalidData.getPasswordError());
    }

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidConfirmPassword")
    public void verifyErrorMessagesPasswordConfirmField(InvalidDataEntity invalidData) {
        authPageSteps
                .openWhatProjectApp()
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .fillConfirmPasswordFieldFieldWithData(invalidData.getPasswordValue())
                .clickOutField()
                .verifyConfirmPasswordErrorMessage(invalidData.getPasswordError());
    }

    @Test
    public void verifyErrorMessagesAccountAlreadyExists() {
        authPageSteps
                .openWhatProjectApp()
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered().fillFirstNameField("Root")
                .fillLastNameField("Root")
                .fillEmailAddressFieldWithData(user.getEmail())
                .fillPasswordFieldFieldWithData("Bc8=Pu0$")
                .fillConfirmPasswordFieldFieldWithData("Bc8=Pu0$")
                .checkThatButtonSignUpIsEnabled()
                .clickButtonSignUp()
                .waitMessageIsRendered()
                .verifyExistingAccountErrorMessage("Account already exists!");
    }
}
