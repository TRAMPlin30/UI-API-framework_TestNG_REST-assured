package steps.auth;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.auth.AuthPage;
import steps.BasePageSteps;
import steps.forgotPassword.ForgotPasswordPageSteps;

import static constants.Constants.*;

public class AuthPageSteps extends BasePageSteps {
    AuthPage authPage;

    public AuthPageSteps(WebDriver driver) {
        super(driver);
        authPage = new AuthPage(driver);
    }

    public AuthPageSteps openWhatProjectApp() {
        authPage.openAuthUrlPage();
        return this;
    }

    public AuthPageSteps checkAuthUrlIslCorrectly(WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), AUTH_URL, "Incorrect URL!!!");
        return this;
    }

    public AuthPageSteps checkAuthFormIsRendered() {
        authPage.waitLoginForm();
        Assert.assertTrue(authPage.getLoginForm().isDisplayed(), "Login Form is not displayed!!!");
        return this;
    }

    public AuthPageSteps checkEmailFieldIsEmpty() {
        Assert.assertEquals(authPage.getEmailField().getAttribute("defaultValue"), "", "'Email address' field is not empty by default!!!");
        return this;
    }

    public AuthPageSteps fillEmailFieldWithData(String email) {
        authPage.fillEmailField(email);
        return this;
    }

    public AuthPageSteps checkPasswordFieldIsEmpty() {
        Assert.assertEquals(authPage.getPasswordField().getAttribute("defaultValue"), "", "'Password' field is not empty by default!!!");
        return this;
    }

    public AuthPageSteps fillPasswordFieldWithData(String password) {
        authPage.fillPasswordField(password);
        return this;
    }

    public AuthPageSteps checkThatButtonSignInIsEnabled() {
        Assert.assertTrue(authPage.getSignInButton().isEnabled(), "SignInButton is not enabled!!!");
        return this;
    }

    public AuthPageSteps clickSignInButton() {
        authPage.clickButtonSignIN();
        return this;
    }

    public void verifyErrorMessage(String error) {
        System.out.println(authPage.getMessageAlertEmail().getText());
        Assert.assertEquals(authPage.getMessageAlertEmail().getText(), error, "Message error does not match!!!");
    }

    public <T> T clickSignInButton(WebDriver driver, Class<T> type) {
        authPage.clickButtonSignIN();
        return super.redirectToPage(driver, type);
    }

    public <T> T clickMyProfileIcon(WebDriver driver, Class<T> type) {
        authPage.clickMyProfileIcon();
        return super.redirectToPage(driver, type);
    }

    public <T> T clickRegistrationLink(WebDriver driver, Class<T> type) {
        authPage.clickButtonRegistration();
        return super.redirectToPage(driver, type);
    }

    public ForgotPasswordPageSteps clickForgotPasswordLink(WebDriver driver) {
        authPage.clickButtonForgotPassword();
        return new ForgotPasswordPageSteps(driver);
    }
}
