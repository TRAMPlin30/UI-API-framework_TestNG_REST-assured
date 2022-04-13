package secretariesPage;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;
import steps.secretaries.EditSecretaryPageSteps;
import steps.secretaries.SecretariesPageSteps;


public class SecretariesPageTest extends BaseTest {
    @Parameters({"Role"})
    @Test
    public void verifySortOnSecretariesPage() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, SecretariesPageSteps.class)
                .clickSidebarSecretaries()
                .verifyOpenSecretaryPage()
                .clickSortButton()
                .verifySortName()
                .clickSortButton()
                .verifySortSurname()
                .clickSortButton()
                .verifySortEmail()
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }

    @Parameters({"Role"})
    @Test
    public void verifyEditButtonWork() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, SecretariesPageSteps.class)
                .clickSidebarSecretaries()
                .verifyOpenSecretaryPage()
                .clickButtonEditIcon()
                .redirectToPage(driver, EditSecretaryPageSteps.class)
                .verifyEditTabName(driver)
                .clickArrowButton()
                .redirectToPage(driver, SecretariesPageSteps.class)
                .verifyOpenSecretaryPage()
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }
}


