package pages.registration;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.RegistrationPage.*;

@Getter
public class RegistrationPage extends BasePage {

    @FindBy(xpath = REGISTRATION_FORM)
    private WebElement registrationForm;
    @FindBy(xpath = REGISTRATION_TITLE)
    private WebElement registrationTitle;
    @FindBy(id = FIRST_NAME_FIELD)
    private WebElement firstNameField;
    @FindBy(id = LAST_NAME_FIELD)
    private WebElement lastNameField;
    @FindBy(id = EMAIL_ADDRESS_FIELD)
    private WebElement emailAddressField;
    @FindBy(id = PASSWORD_FIELD)
    private WebElement passwordField;
    @FindBy(id = CONFIRM_PASSWORD_FIELD)
    private WebElement confirmPasswordField;
    @FindBy(xpath = BUTTON_SIGN_UP)
    private WebElement buttonSignUp;
    @FindBy(xpath = LOGIN_LINK)
    private WebElement loginLink;

    @FindBy(xpath = MESSAGE_ALERT_FIRST_NAME_FIELD)
    private WebElement MessageErrorFirstName;
    @FindBy(xpath = MESSAGE_ALERT_LAST_NAME_FIELD)
    private WebElement MessageErrorLastName;
    @FindBy(xpath = MESSAGE_ALERT_EMAIL_FIELD)
    private WebElement MessageErrorEmail;
    @FindBy(xpath = MESSAGE_ALERT_PASSWORD_FIELD)
    private WebElement MessageErrorPassword;
    @FindBy(xpath = MESSAGE_ALERT_CONFIRM_PASSWORD_FIELD)
    private WebElement MessageErrorPasswordConfirm;
    @FindBy(xpath = MESSAGE_ACCOUNT_EXISTS)
    private WebElement MessageExistingAccount;


    @FindBy(xpath = BUTTON_BACK)
    private WebElement buttonBack;
    @FindBy(xpath = MESSAGE_REGISTRATION_DONE)
    private WebElement registrationDoneMessage;
    @FindBy(xpath = MESSAGE_REGISTRATION_DONE_TEXT)
    private WebElement registrationDoneText;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void waitRegistrationForm() {
        waitWebElementVisible(registrationForm, ELEMENT_WAIT);
    }

    public void fillFieldFirstName(String value) {
        super.fillField(firstNameField, value);
    }

    public void fillFieldLastName(String value) {
        super.fillField(lastNameField, value);
    }

    public void fillEmailAddress(String value) {
        super.fillField(emailAddressField, value);
    }

    public void fillPassword(String value) {
        super.fillField(passwordField, value);
    }

    public void fillConfirmPassword(String value) {
        super.fillField(confirmPasswordField, value);
    }

    public void clickButtonSignUp() {
        super.clickButton(buttonSignUp);
    }

    public void clickButtonBack() {
        super.clickButton(buttonBack);
    }

}
