package secretariesPage;

import base.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;
import steps.secretaries.SecretariesDetailsPageSteps;
import steps.secretaries.SecretariesPageSteps;

public class SecretariesDetailsPageTest extends BaseTest {
    @Parameters({"Role"})
    @Test
    public void verifyUserCanUsedSecretariesDetailsTab() {
        authPageSteps
                .openWhatProjectApp()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, SecretariesPageSteps.class)
                .clickSidebarSecretaries()
                .redirectToPage(driver,SecretariesPageSteps.class)
                .clickLineListSecretaries()
                .redirectToPage(driver, SecretariesDetailsPageSteps.class)
                .verifyNameTab()
                .verifyFirstNameIsDisplayed()
                .verifyLastNameIsDisplayed()
                .verifyEmailIsDisplayed()
                .clickArrowButton()
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class);
    }
}

