package steps.auth;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.auth.AuthPage;
import steps.BasePageSteps;
import steps.registration.RegistrationPageSteps;


import static constants.Constants.AUTH_URL;

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
        Assert.assertEquals(driver.getCurrentUrl(), AUTH_URL);
        return this;
    }

    public AuthPageSteps checkAuthFormIsRendered() {
        authPage.waitLoginForm();
        return this;
    }

    public AuthPageSteps checkEmailFieldIsEmpty() {
        /**
         * 'Email address' field is empty by default.
         */
        Assert.assertEquals(authPage.getEmailField().getAttribute("defaultValue"), "");
        return this;
    }

    public AuthPageSteps fillEmailFieldWithData(String email) {
        authPage.fillEmailField(email);
        return this;
    }

    public AuthPageSteps checkPasswordFieldIsEmpty() {
        /**
         * 'Password' field is empty by default.
         */
        Assert.assertEquals(authPage.getPasswordField().getAttribute("defaultValue"), "");
        return this;
    }

    public AuthPageSteps fillPasswordFieldWithData(String password) {
        authPage.fillPasswordField(password);
        return this;
    }

    public AuthPageSteps checkThatButtonSignInIsEnabled() {
        authPage.getSignInButton().isEnabled();
        return this;
    }

    public AuthPageSteps clickSignInButton() {
        authPage.clickButtonSignIN();
        return this;
    }

    public <T> T clickSignInButton(WebDriver driver, Class<T> type) {
        authPage.clickButtonSignIN();
        return super.redirectToPage(driver, type);
    }

    public <T> T clickMyProfileIcon(WebDriver driver, Class<T> type) {
        authPage.clickMyProfileIcon();
        return super.redirectToPage(driver, type);
    }

    public AuthPageSteps clickLogOut() {
        authPage.clickLogOut();
        return this;
    }


    public RegistrationPageSteps clickRegistrationLink(WebDriver driver) {
        authPage.clickButtonRegistration();
        return new RegistrationPageSteps(driver);
    }

    public ForgotPasswordPageSteps clickForgotPasswordLink(WebDriver driver) {
        authPage.clickButtonForgotPassword();
        return new ForgotPasswordPageSteps(driver);
    }




}
