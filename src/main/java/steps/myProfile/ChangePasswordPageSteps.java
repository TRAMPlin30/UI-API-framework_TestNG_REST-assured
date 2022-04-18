package steps.myProfile;

import static constants.Messages.AlertMessages.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.myProfile.ChangePasswordPage;
import steps.BasePageSteps;

public class ChangePasswordPageSteps extends BasePageSteps {

    ChangePasswordPage changePasswordPage;

    public ChangePasswordPageSteps(WebDriver driver) {
        super(driver);
        changePasswordPage = new ChangePasswordPage(driver);
    }

    public ChangePasswordPageSteps verifyEmailAddressIsDisplayedCorrectly(String email) {
        Assert.assertEquals(changePasswordPage.getEmailData().getAttribute("value"), email);
        return this;
    }

    public ChangePasswordPageSteps verifyCurrentPasswordFieldIsEmpty() {
        Assert.assertTrue(changePasswordPage.currentPasswordFieldIsEmpty());
        return this;
    }

    public ChangePasswordPageSteps fillCurrentPasswordField(String pass, String password) {
        changePasswordPage.fillCurrentPasswordField(pass);
        //Assert.assertEquals(changePasswordPage.getCurrentPasswordInputField().getAttribute("defaultValue"), password);
        return this;
    }

    public ChangePasswordPageSteps verifyNewPasswordFieldIsEmpty() {
        Assert.assertTrue(changePasswordPage.newPasswordFieldIsEmpty());
        return this;
    }

    public ChangePasswordPageSteps fillNewPasswordField(String newPassword) {
        changePasswordPage.fillNewPasswordField(newPassword);
        return this;
    }

    public ChangePasswordPageSteps verifyConfirmNewPasswordFieldIsEmpty() {
        Assert.assertTrue(changePasswordPage.confirmPasswordFieldIsEmpty());
        return this;
    }

    public ChangePasswordPageSteps fillConfirmPasswordField(String confirmPassword) {
        changePasswordPage.fillConfirmPasswordField(confirmPassword);
        return this;
    }

    public ChangePasswordPageSteps clickCurrentPasswordInputField() {
        changePasswordPage.clickCurrentPasswordInputField();
        return this;
    }

    public ChangePasswordPageSteps clickNewPasswordInputField() {
        changePasswordPage.clickNewPasswordInputField();
        return this;
    }

    public ChangePasswordPageSteps clickConfirmNewPasswordInputField() {
        changePasswordPage.clickConfirmNewPasswordInputField();
        return this;
    }

    public ChangePasswordPageSteps verifyCurrentPasswordErrorMessage() {
        Assert.assertEquals(changePasswordPage.getCurrentPasswordErrorMessage(), MESSAGE_ALERT_REQUIRED_FIELD);
        return this;
    }

    public ChangePasswordPageSteps verifyNewPasswordErrorMessage() {
        Assert.assertEquals(changePasswordPage.getNewPasswordErrorMessage(), MESSAGE_ALERT_PROVIDE_NEW_PASSWORD);
        return this;
    }

    public ChangePasswordPageSteps verifyNewPasswordNotValidErrorMessage() {
        Assert.assertEquals(changePasswordPage.getNewPassNotValidData().getText(),MESSAGE_ALERT_TOO_SHORT_PASSWORD);
        return this;
    }

    public ChangePasswordPageSteps verifyConfirmNewPasswordErrorMessage() {
        Assert.assertEquals(changePasswordPage.getConfirmNewPasswordErrorMessage(), MESSAGE_ALERT_REQUIRED_FIELD);
        return this;
    }

    public ChangePasswordPageSteps verifyConfirmNewPasswordNotValidErrorMessage() {
        Assert.assertEquals(changePasswordPage.getConfirmNewPassNotValidData().getText(), MESSAGE_ALERT_CONFIRM_PASSWORD);
        return this;
    }

    public ChangePasswordPageSteps clickSaveButton() {
        changePasswordPage.clickSaveButton();
        return this;
    }

    public ChangePasswordPageSteps clickCancelItem(){
        changePasswordPage.clickCancelItem();
        return this;
    }

    public <T> T clickCancelButton(WebDriver driver, Class<T> type){
        changePasswordPage.clickCancelButton();
        return super.redirectToPage(driver, type);
    }

    public ChangePasswordPageSteps clickConfirmButton() {
        changePasswordPage.clickConfirmButton();
        return this;
    }

    public ChangePasswordPageSteps clickDropdownMenu() {
        changePasswordPage.clickDropdownProfile();
        return this;
    }

    public <T> T clickLogOut(WebDriver driver, Class<T> type) {
        changePasswordPage.clickLogOut();
        return super.redirectToPage(driver, type);
    }
}
