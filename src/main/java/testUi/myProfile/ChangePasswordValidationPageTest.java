package testUi.myProfile;

import testUi.base.BaseTest;
import entities.Password;
import entities.Validation;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

public class ChangePasswordValidationPageTest extends BaseTest {
    Password password = Password.createPassword();
    Validation validation = Validation.createNewPassword();

    @Test
    public void verifyEmptyFieldsErrorMessages() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton()
                .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                .clickChangePasswordButton(driver)
                .verifyEmailAddressIsDisplayedCorrectly(user.getEmail())
                .clickCurrentPasswordInputField()
                .clickNewPasswordInputField()
                .verifyCurrentPasswordErrorMessage()
                .clickConfirmNewPasswordInputField()
                .verifyNewPasswordErrorMessage()
                .clickNewPasswordInputField()
                .verifyConfirmNewPasswordErrorMessage()
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }

    @Test
    public void verifyInvalidDataErrorMessages() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton()
                .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                .clickChangePasswordButton(driver)
                .verifyEmailAddressIsDisplayedCorrectly(user.getEmail())
                .fillCurrentPasswordField(password.getCurrentPassword(), user.getPassword())
                .fillNewPasswordField(validation.getUpperCaseLetter())
                .clickConfirmNewPasswordInputField()
                .verifyNewPasswordNotValidErrorMessage()
                .fillNewPasswordField(validation.getLowerCaseLetter() + validation.getNumber() + validation.getSymbol())
                .fillConfirmPasswordField(validation.getUpperCaseLetter())
                .verifyConfirmNewPasswordNotValidErrorMessage()
                .fillConfirmPasswordField(validation.getLowerCaseLetter() + validation.getNumber() + validation.getSymbol())
                .clickSaveButton()
                .clickCancelItem()
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }
}
