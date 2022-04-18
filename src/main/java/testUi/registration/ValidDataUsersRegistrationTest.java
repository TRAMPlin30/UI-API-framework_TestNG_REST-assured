package testUi.registration;

import testUi.base.BaseTest;
import org.testng.annotations.Test;
import pages.registration.validDataForRegistration.ValidStaticProvider;
import steps.registration.RegistrationPageSteps;

public class ValidDataUsersRegistrationTest extends BaseTest {

    @Test(dataProviderClass = ValidStaticProvider.class, dataProvider = "create")
    public void verifyPossibilityRegistration(String firstName, String lastName, String email, String password, String confirmPassword) {
        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .clickRegistrationLink(driver, RegistrationPageSteps.class)
                .waitRegistrationFormIsRendered()
                .checkRegistrationUrlIslCorrectly(driver)
                .checkFirstNameFieldIsEmpty()
                .fillFirstNameField(firstName)
                .checkLastNameFieldIsEmpty()
                .fillLastNameField(lastName)
                .checkEmailAddressFieldIsEmpty()
                .fillEmailAddressFieldWithData(email)
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldFieldWithData(password)
                .checkConfirmPasswordFieldIsEmpty()
                .fillConfirmPasswordFieldFieldWithData(confirmPassword)
                .checkThatButtonSignUpIsEnabled()
                .clickButtonSignUp()
                .checkRegisterSuccessMessage()
                .checkRegisterSuccessText();
    }
}
