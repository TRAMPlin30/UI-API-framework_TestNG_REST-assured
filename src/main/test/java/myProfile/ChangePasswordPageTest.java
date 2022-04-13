package myProfile;

import base.BaseTest;
import entities.Password;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

public class ChangePasswordPageTest extends BaseTest {
    Password password = Password.createPassword();

    @Test
    public void verifyThatUserCanChangePassword() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(users.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(users.getPassword())
                .clickSignInButton()
                .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                .clickChangePasswordButton(driver)
                .verifyEmailAddressIsDisplayedCorrectly(users.getEmail())
                .verifyCurrentPasswordFieldIsEmpty()
                .fillCurrentPasswordField(password.getCurrentPassword(), users.getPassword())
                .verifyNewPasswordFieldIsEmpty()
                .fillNewPasswordField(password.getNewPassword())
                .verifyConfirmNewPasswordFieldIsEmpty()
                .fillConfirmPasswordField(password.getConfirmPassword())
                .clickSaveButton()
                .clickConfirmButton()
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }

    @Test
    public void verifyThatUserCanRedirectToMyProfilePage() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(users.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(users.getPassword())
                .clickSignInButton()
                .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                .clickChangePasswordButton(driver)
                .verifyEmailAddressIsDisplayedCorrectly(users.getEmail())
                .clickCancelButton(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }
}
