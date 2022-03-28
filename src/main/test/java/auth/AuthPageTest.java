package auth;

import base.BaseTest;
import org.testng.annotations.Test;
import properties.Roles;
import steps.mentors.MentorsTablePageSteps;

public class AuthPageTest extends BaseTest {

    @Test
    public void verifyThatUserCanAuthenticate() {

        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .checkAuthFormIsRendered()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(Roles.MENTOR)
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(Roles.MENTOR)
                .checkThatButtonSignInIsEnabled()
                .clickSignInButton()
                .checkThatUserLogged(Roles.MENTOR);
    }

    @Test
    public void verifyThatUserCanGetPageMentors() throws InterruptedException {

        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(Roles.ADMIN)
                .fillPasswordFieldWithData(Roles.ADMIN)
                .clickSignInButton(driver, MentorsTablePageSteps.class)
                .clickForAllElements()
                .verifyThatSortIsWorking(driver);

    }
}
