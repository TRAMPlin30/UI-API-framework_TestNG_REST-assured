package testUi.myProfile;

import entities.User;
import testUi.base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import properties.Drivers;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

import java.util.Arrays;
import java.util.List;

public class MyProfilePageTest extends BaseTest {

    protected void quit() {
        if (!(driver == null)) {driver.quit();}
    }

    @Test
    public void verifyThatUserCanRedirectToChangePasswordPage() {

        List<String> roles = Arrays.asList("Admin", "Mentor", "Secretary", "Student");
        roles.stream().map(User::createUser).forEach(user1 ->
                authPageSteps
                        .openWhatProjectApp()
                        .checkEmailFieldIsEmpty()
                        .fillEmailFieldWithData(user1.getEmail())
                        .checkPasswordFieldIsEmpty()
                        .fillPasswordFieldWithData(user1.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .clickChangePasswordButton(driver)
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver));
    }

    @Test
    public void verifyUserDataFirstNameIsDisplayed() {


                authPageSteps
                        .openWhatProjectApp()
                        .fillEmailFieldWithData(user.getEmail())
                        .fillPasswordFieldWithData(user.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .verifyFirstNameFieldIsDisplayedCorrectly(user.getFirstName())
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver);
                quit();
    }

    @Test
    public void verifyUserDataLastNameIsDisplayed() {

        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        User user = User.createUser("Admin");
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);


                authPageSteps
                        .openWhatProjectApp()
                        .fillEmailFieldWithData(user.getEmail())
                        .fillPasswordFieldWithData(user.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .verifyLastNameFieldIsDisplayedCorrectly(user.getLastName())
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver);
        quit();
    }

    @Test
    public void verifyUserDataEmailIsDisplayed() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        User user = User.createUser("Admin");
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);


                authPageSteps
                        .openWhatProjectApp()
                        .fillEmailFieldWithData(user.getEmail())
                        .fillPasswordFieldWithData(user.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .verifyEmailAddressFieldIsDisplayedCorrectly(user.getEmail())
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver);
    }
}