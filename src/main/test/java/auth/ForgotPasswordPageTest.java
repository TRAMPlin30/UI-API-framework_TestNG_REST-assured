package auth;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import properties.Drivers;
import steps.auth.AuthPageSteps;

public class ForgotPasswordPageTest {

    WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);

    @Test
    public void verifyThatUserCanSendForgotPassword() {
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);

        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .clickForgotPasswordLink(driver)
                .checkForgotPasswordUrlIslCorrectly(driver)
                .waitForgotPasswordFormIsRendered()
                .checkEmailAddressFieldIsEmpty()
                .fillEmailAddressFieldWithData()
                .checkThatButtonSendIsEnabled()
                .clickButtonSend()
                .checkThatForgotPasswordSend()
                .checkThatButtonBackIsEnabled()
                .clickButtonBack();
    }
}