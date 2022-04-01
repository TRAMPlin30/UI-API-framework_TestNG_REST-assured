package registration;

import base.BaseTest;
import org.testng.annotations.Test;

public class RegistrationPageTest extends BaseTest {

    @Test

    public void verifyThatUserCanRegistration() {


        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .clickRegistrationLink(driver)
                .waitRegistrationFormIsRendered()
                .verifyRegistrationUrlIslCorrectly(driver)
                .checkFirstNameFieldIsEmpty()
                .fillFirstNameFieldWithData()
                .checkLastNameFieldIsEmpty()
                .fillLastNameFieldWithData()
                .checkEmailAddressFieldIsEmpty()
                .fillEmailAddressFieldWithData()
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldFieldWithData()
                .checkConfirmPasswordFieldIsEmpty()
                .fillConfirmPasswordFieldFieldWithData()
                .checkThatButtonSignUpIsEnabled()
                .clickButtonSignUp()
                .checkThatUserRegistered()
                .clickButtonBackToReturnAuthPage(driver)
                .checkAuthUrlIslCorrectly(driver);
    }
}
