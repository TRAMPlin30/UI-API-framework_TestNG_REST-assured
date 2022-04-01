package pages.myProfile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.ChangePasswordPage.*;

public class ChangePasswordPage extends BasePage {
    @FindBy(xpath = CHANGE_PASSWORD_HEADER)
    private WebElement changePasswordHeader;

    @FindBy(xpath = EMAIL_ADDRESS_FIELD)
    private WebElement emailAddressField;

    @FindBy(xpath = CURRENT_PASSWORD_FIELD)
    private WebElement currentPasswordField;

    @FindBy(xpath = NEW_PASSWORD_FIELD)
    private WebElement newPasswordField;

    @FindBy(xpath = CONFIRM_PASSWORD_FIELD)
    private WebElement confirmPasswordField;

    @FindBy(xpath = EMAIL_DATA)
    private WebElement emailData;

    @FindBy(xpath = CURRENT_PASSWORD_INPUT_FIELD)
    private WebElement currentPasswordInputField;

    @FindBy(xpath = NEW_PASSWORD_INPUT_FIELD)
    private WebElement newPasswordInputField;

    @FindBy(xpath = CONFIRM_PASSWORD_INPUT_FIELD)
    private WebElement confirmPasswordInputField;

    @FindBy(xpath = CURRENT_PASSWORD_ERROR)
    private WebElement currentPasswordError;

    @FindBy(xpath = NEW_PASSWORD_ERROR)
    private WebElement newPasswordError;

    @FindBy(xpath = CONFIRM_PASSWORD_ERROR)
    private WebElement confirmPasswordError;

    @FindBy(xpath = SAVE_BUTTON)
    private WebElement saveButton;

    @FindBy(xpath = CANCEL_BUTTON)
    private WebElement cancelButton;

    public ChangePasswordPage(WebDriver driver) {
        super(driver);
    }

    public String getLabel() {
        return changePasswordHeader.getText();
    }

    public boolean verifyEmailAddressField() {
        return emailAddressField.isDisplayed();
    }

    public boolean currentPasswordField() {
        return currentPasswordField.isDisplayed();
    }

    public boolean newPasswordField() {
        return newPasswordField.isDisplayed();
    }

    public boolean confirmPasswordField() {
        return confirmPasswordField.isDisplayed();
    }

    public boolean verifyEmailAddressFieldIsDisplayed() {
        return emailData.isDisplayed();
    }

    public boolean verifyEmailAddressFieldIsDisable() {
        return !emailData.isEnabled();
    }

    public boolean emailAddressIsDisplayedCorrectly(String email) {
        return emailData.getAttribute("value").equals(email);
    }

    public boolean currentPasswordFieldIsEmpty() {
        return currentPasswordField.getText().isEmpty();
    }

    public boolean newPasswordFieldIsEmpty() {
        return newPasswordField.getText().isEmpty();
    }

    public boolean confirmPasswordFieldIsEmpty() {
        return confirmPasswordField.getText().isEmpty();
    }

    public void fillCurrentPasswordField(String currentPassword) {
        fillField(currentPasswordInputField, currentPassword);
    }

    public void fillNewPasswordField(String newPassword) {
        fillField(newPasswordInputField, newPassword);
    }

    public void fillConfirmPasswordField(String confirmNewPassword) {
        fillField(confirmPasswordInputField, confirmNewPassword);
    }

    public boolean verifySaveButtonIsDisable() {
        return !saveButton.isEnabled();
    }

    public void clickOnCurrentPasswordField() {
        currentPasswordInputField.click();
    }

    public void clickOnNewPasswordField() {
        newPasswordInputField.click();
    }

    public void clickOnConfirmNewPasswordField() {
        confirmPasswordInputField.click();
    }

    public boolean verifySaveButtonIsEnabled() {
        return saveButton.isEnabled();
    }

    public boolean verifyCancelButtonIsEnabled() {
        return cancelButton.isEnabled();
    }

    public MyProfilePage verifyCancelButton() {
        cancelButton.click();
        return new MyProfilePage(driver);
    }
}
