package auth;

import base.BaseTest;
import org.testng.annotations.Test;
import properties.Roles;

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
}
