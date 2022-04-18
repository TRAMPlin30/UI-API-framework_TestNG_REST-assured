package testUi.secretariesPage;

import testUi.base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;
import steps.secretaries.EditSecretaryPageSteps;
import steps.secretaries.SecretariesPageSteps;

public class EditSecretariesPageTest extends BaseTest {

    @Test
    public void verifyResetButton() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, SecretariesPageSteps.class)
                .clickSidebarSecretaries()
                .clickButtonEditIcon()
                .redirectToPage(driver, EditSecretaryPageSteps.class)
                .verifyEditTabName(driver)
                .verifyButtonResetIsDisabled()
                .fillFirstNameFieldWithData()
                .verifyWithChangedName()
                .clickResetButton()
                .verifyBackName()
                .clickArrowButton()
                .redirectToPage(driver, SecretariesPageSteps.class)
                .verifyOpenSecretaryPage()
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class);
    }


    @Test
    public void verifyLayOffButtonWork() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, SecretariesPageSteps.class)
                .clickSidebarSecretaries()
                .clickButtonEditIcon()
                .redirectToPage(driver, EditSecretaryPageSteps.class)
                .verifyEditTabName(driver)
                .clickLayOffButton()
                .clickLayOffButtonForm()
                .redirectToPage(driver, SecretariesPageSteps.class)
                .verifyOpenSecretaryPage()
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class);
    }
}

