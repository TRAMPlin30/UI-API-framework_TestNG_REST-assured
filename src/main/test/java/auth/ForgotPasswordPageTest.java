package auth;

import base.BaseTest;
import org.testng.annotations.Test;

public class ForgotPasswordPageTest extends BaseTest {

    @Test
    public void verifyThatUserCanSendForgotPassword() {

        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .clickForgotPasswordLink(driver)
                .checkForgotPasswordUrlIslCorrectly(driver)
                .waitForgotPasswordFormIsRendered()
                .checkEmailAddressFieldIsEmpty()
                .fillEmailAddressFieldWithData(user.getEmail())
                .checkThatButtonSendIsEnabled()
                .clickButtonSend()
                .checkThatForgotPasswordSend()
                .checkThatButtonBackIsEnabled()
                .clickButtonBack();
    }
}