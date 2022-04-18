package testUi.auth;

import testUi.base.BaseTest;
import entities.InvalidDataEntity;
import org.testng.annotations.Test;
import pages.auth.invalidDataForLogin.InvalidStaticProvider;

public class InvalidDataUserLoginTest extends BaseTest {

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidEmail")
    public void verifyErrorMessagesEmailField(InvalidDataEntity invalidEmail, String validPassword) {
        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .checkAuthFormIsRendered()
                .fillEmailFieldWithData(invalidEmail.getEmailValue())
                .fillPasswordFieldWithData(validPassword)
                .checkThatButtonSignInIsEnabled()
                .clickSignInButton()
                .verifyErrorMessage(invalidEmail.getEmailError());
    }

    @Test(dataProviderClass = InvalidStaticProvider.class, dataProvider = "invalidPassword")
    public void verifyErrorMessagesPasswordField(String validEmail, InvalidDataEntity invalidPassword) {
        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .checkAuthFormIsRendered()
                .fillEmailFieldWithData(validEmail)
                .fillPasswordFieldWithData(invalidPassword.getPasswordValue())
                .checkThatButtonSignInIsEnabled()
                .clickSignInButton()
                .verifyErrorMessage(invalidPassword.getPasswordError());
    }
}
