package pages.auth;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.AUTH_URL;
import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.AuthPage.*;
import static constants.Locators.MyProfileItems.*;

@Getter
public class AuthPage extends BasePage {

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

    @FindBy(xpath = MESSAGE_ALERT_EMAIL_FIELD)
    private WebElement messageAlertEmail;


    @FindBy(xpath = MY_PROFILE_ICON)
    private WebElement myProfileIcon;
    @FindBy(xpath = MY_PROFILE_DROPDOWN_ITEM)
    private WebElement myProfile;
    @FindBy(xpath = MY_PROFILE_DROPDOWN_LOG_OUT)
    private WebElement logOut;


    public AuthPage(WebDriver driver) {
        super(driver);
    }

    public void openAuthUrlPage() {
        super.openURL(AUTH_URL);
    }

    public void waitLoginForm() {
        super.waitWebElementVisible(loginForm, ELEMENT_WAIT);
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

    public void clickMyProfileIcon() {
        super.clickButton(myProfileIcon);
    }
}
