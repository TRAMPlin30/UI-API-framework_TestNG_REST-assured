package steps.auth;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.auth.ForgotPasswordPage;
import steps.BasePageSteps;

import static constants.Constants.FORGOT_PASSWORD_URL;
import static constants.Messages.DoneMessages.*;

public class ForgotPasswordPageSteps extends BasePageSteps {
    ForgotPasswordPage forgotPasswordPage;

    public ForgotPasswordPageSteps(WebDriver driver) {
        super(driver);
       forgotPasswordPage = new ForgotPasswordPage(driver);
    }

    public ForgotPasswordPageSteps checkForgotPasswordUrlIslCorrectly(WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), FORGOT_PASSWORD_URL);
        return this;
    }

    public ForgotPasswordPageSteps waitForgotPasswordFormIsRendered() {
        forgotPasswordPage.waitForgotPasswordForm();
        return this;
    }

    public ForgotPasswordPageSteps checkEmailAddressFieldIsEmpty() {
        Assert.assertEquals(forgotPasswordPage.getEmailAddressField().getAttribute("defaultValue"), "");
        return this;
    }

    public ForgotPasswordPageSteps fillEmailAddressFieldWithData(String email) {
        forgotPasswordPage.fillEmailAddressField(email);
        return this;
    }

    public ForgotPasswordPageSteps checkThatButtonSendIsEnabled() {
        forgotPasswordPage.getButtonSend().isEnabled();
        return this;
    }

    public ForgotPasswordPageSteps clickButtonSend() {
        forgotPasswordPage.clickButtonSend();
        return this;
    }

    public ForgotPasswordPageSteps checkMessageForgotPasswordSent() {
        Assert.assertEquals(forgotPasswordPage.getForgotPasswordSendMessage().getAttribute("textContent"), MESSAGE_DONE_FORGOT_PASSWORD);
        Assert.assertEquals(forgotPasswordPage.getForgotPasswordSendText().getAttribute("textContent"), MESSAGE_DONE_FORGOT_PASSWORD_TEXT);
        return this;
    }

    public ForgotPasswordPageSteps checkThatButtonBackIsEnabled() {
        forgotPasswordPage.getButtonBack().isEnabled();
        return this;
    }

    public ForgotPasswordPageSteps clickButtonBack() {
        forgotPasswordPage.clickButtonBack();
        return this;
    }
}
