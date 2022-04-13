package pages.myProfile;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

import static constants.Locators.ChangePasswordPage.*;
import static constants.Locators.MyProfileItems.MY_PROFILE_DROPDOWN_ITEM;
import static constants.Locators.MyProfileItems.MY_PROFILE_DROPDOWN_LOG_OUT;

@Getter
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

    @FindBy(xpath = CONFIRM_BUTTON)
    private WebElement confirmButton;

    @FindBy(xpath = CANCEL_BUTTON)
    private WebElement cancelButton;

    @FindBy(xpath = CANCEL_ITEM)
    private WebElement cancelItem;

    @FindBy(xpath = MY_PROFILE_DROPDOWN_ITEM)
    private WebElement myProfileDropdownItem;

    @FindBy(xpath = MY_PROFILE_DROPDOWN_LOG_OUT)
    private WebElement logOut;

    @FindBy(xpath = ERROR_MESSAGES)
    private List<WebElement> errorMessages;

    @FindBy(xpath = NEW_PASS_NOT_VALID_DATA)
    private WebElement newPassNotValidData;

    @FindBy(xpath = CONFIRM_NEW_PASS_NOT_VALID_DATA)
    private WebElement confirmNewPassNotValidData;

    public ChangePasswordPage(WebDriver driver) {
        super(driver);
    }

    public void clickDropdownProfile() {
        super.clickButton(myProfileDropdownItem);
    }

    public boolean currentPasswordFieldIsEmpty() {
        return currentPasswordInputField.getText().isEmpty();
    }

    public boolean newPasswordFieldIsEmpty() {
        return newPasswordInputField.getText().isEmpty();
    }

    public boolean confirmPasswordFieldIsEmpty() {
        return confirmPasswordInputField.getText().isEmpty();
    }

    public String getCurrentPasswordErrorMessage() {
        return errorMessages.get(0).getText();
    }

    public String getNewPasswordErrorMessage() {
        return errorMessages.get(1).getText();
    }

    public String getConfirmNewPasswordErrorMessage() {
        return errorMessages.get(2).getText();
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

    public void clickSaveButton(){
        super.clickButton(saveButton);
    }

    public void clickCancelButton(){
        super.clickButton(cancelButton);
    }

    public void clickCancelItem(){
        super.clickButton(cancelItem);
    }

    public void clickConfirmButton(){
        super.clickButton(confirmButton);
    }

    public void clickLogOut() {
        super.clickButton(logOut);
    }

    public void clickCurrentPasswordInputField(){
        super.clickButton(currentPasswordInputField);
    }

    public void clickNewPasswordInputField(){
        super.clickButton(newPasswordInputField);
    }

    public void clickConfirmNewPasswordInputField(){
        super.clickButton(confirmPasswordInputField);
    }
}
