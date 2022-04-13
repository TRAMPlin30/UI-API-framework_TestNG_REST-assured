package forgotPassword;

import base.BaseTest;
import org.testng.annotations.Test;

public class ForgottenPasswordSendTest extends BaseTest {

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
                .checkMessageForgotPasswordSent()
                .checkThatButtonBackIsEnabled()
                .clickButtonBack();
    }
}