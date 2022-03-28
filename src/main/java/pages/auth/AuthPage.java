package pages.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.AUTH_URL;
import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.AuthPage.*;
import static constants.Locators.MyProfileItems.MY_PROFILE_FULL_NAME;

public class AuthPage  extends BasePage {

    @FindBy(xpath = LOGIN_FORM)
    private WebElement loginForm;
    @FindBy(id = EMAIL_FIELD)
    private WebElement emailField;
    @FindBy(id = PASSWORD_FIELD)
    private WebElement passwordField;
    @FindBy(xpath = BUTTON_SIGN_IN)
    private WebElement signInButton;
    @FindBy(xpath = MY_PROFILE_FULL_NAME)
    private WebElement myProfileFullName;
    @FindBy(xpath = REGISTRATION_LINK)
    private WebElement registrationLink;
    @FindBy(xpath = FORGOT_PASSWORD_LINK)
    private WebElement forgotPasswordLink;

    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getMyProfileFullName() {
        return myProfileFullName;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getRegistrationLink() {
        return registrationLink;
    }

    public WebElement getForgotPasswordLink() {
        return forgotPasswordLink;
    }

    public void openAuthUrlPage() {
        super.openURL(AUTH_URL);
    }

    public void waitLoginForm() {
        waitWebElementVisible(loginForm, ELEMENT_WAIT);
    }

    public void fillEmailField(String email) {
        super.fillField(emailField, email);
    }

    public void fillPasswordField(String password) {
        super.fillField(passwordField, password);
    }

    public void clickButtonSignIN() {
        super.clickButton(signInButton);
    }

    public void clickButtonForgotPassword() {
        super.clickButton(forgotPasswordLink);
    }

    public void clickButtonRegistration() {
        super.clickButton(registrationLink);
    }

}
