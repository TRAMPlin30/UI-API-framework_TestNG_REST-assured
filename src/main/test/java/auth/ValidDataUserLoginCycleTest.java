package auth;

import entities.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import properties.Drivers;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

import java.util.Arrays;
import java.util.List;

public class ValidDataUserLoginCycleTest {

    @Test
    public void verifyAllRolesCanLogin() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);
        List<String> roles = Arrays.asList("Admin", "Mentor", "Secretary", "Student");

        roles.stream().map(User::createUser).forEach(user1 -> authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .checkAuthFormIsRendered()
                .checkEmailFieldIsEmpty()
                .fillEmailFieldWithData(user1.getEmail())
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldWithData(user1.getPassword())
                .checkThatButtonSignInIsEnabled()
                .clickSignInButton()
                .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                .checkThatUserLoggedByEmail(user1.getEmail())
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver));
    }
}
