package registration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import properties.Drivers;
import steps.auth.AuthPageSteps;

public class RegistrationPageTest {

    WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);

    @Test
    public void verifyThatUserCanRegistration() {

        AuthPageSteps authPageSteps = new AuthPageSteps(driver);

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
