package pages.auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.ForgotPasswordPage.*;

public class ForgotPasswordPage extends BasePage {

    @FindBy(xpath = FORGOT_PASSWORD_FORM)
    private WebElement forgotPasswordForm;
    @FindBy(id = EMAIL_ADDRESS_FIELD)
    private WebElement emailAddressField;
    @FindBy(xpath = BUTTON_SEND)
    private WebElement buttonSend;

    @FindBy(xpath = BUTTON_BACK)
    private WebElement buttonBack;
    @FindBy(xpath = MESSAGE_FORGOT_PASSWORD_SEND)
    private WebElement forgotPasswordSendMessage;
    @FindBy(xpath = MESSAGE_FORGOT_PASSWORD_SEND_TEXT)
    private WebElement forgotPasswordSendText;

    public WebElement getButtonSend() {
        return buttonSend;
    }

    public WebElement getButtonBack() {
        return buttonBack;
    }

    public WebElement getForgotPasswordSendMessage() {
        return forgotPasswordSendMessage;
    }

    public WebElement getForgotPasswordSendText() {
        return forgotPasswordSendText;
    }

    public WebElement getEmailAddressField() {
        return emailAddressField;
    }

    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
    }

    public void waitForgotPasswordForm() {
        super.waitWebElementVisible(forgotPasswordForm, ELEMENT_WAIT);
    }

    public void fillEmailAddressField(String value) {
        super.fillField(emailAddressField, value);
    }

    public void clickButtonSend() {
        super.clickButton(buttonSend);
    }

    public void clickButtonBack() {super.clickButton(buttonBack);}

}
