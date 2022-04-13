package myProfile;

import base.BaseTest;
import entities.Users;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import properties.Drivers;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

import java.util.Arrays;
import java.util.List;

public class MyProfilePageTest extends BaseTest {

    @Test
    public void verifyThatUserCanRedirectToChangePasswordPage() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER_MAC);
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);
        List<String> roles = Arrays.asList("Admin", "Mentor", "Secretary", "Student");
        roles.stream().map(Users::createUser).forEach(user1 ->
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
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER_MAC);
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);
        List<String> roles = Arrays.asList("Admin", "Mentor", "Secretary", "Student");
        roles.stream().map(Users::createUser).forEach(user1 ->
                authPageSteps
                        .openWhatProjectApp()
                        .checkEmailFieldIsEmpty()
                        .fillEmailFieldWithData(user1.getEmail())
                        .checkPasswordFieldIsEmpty()
                        .fillPasswordFieldWithData(user1.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .verifyFirstNameFieldIsDisplayedCorrectly(user1.getFirstName())
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver));
    }

    @Test
    public void verifyUserDataLastNameIsDisplayed() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER_MAC);
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);
        List<String> roles = Arrays.asList("Admin", "Mentor", "Secretary", "Student");
        roles.stream().map(Users::createUser).forEach(user1 ->
                authPageSteps
                        .openWhatProjectApp()
                        .checkEmailFieldIsEmpty()
                        .fillEmailFieldWithData(user1.getEmail())
                        .checkPasswordFieldIsEmpty()
                        .fillPasswordFieldWithData(user1.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .verifyLastNameFieldIsDisplayedCorrectly(user1.getLastName())
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver));
    }

    @Test
    public void verifyUserDataEmailIsDisplayed() {
        WebDriver driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER_MAC);
        AuthPageSteps authPageSteps = new AuthPageSteps(driver);
        List<String> roles = Arrays.asList("Admin", "Mentor", "Secretary", "Student");
        roles.stream().map(Users::createUser).forEach(user1 ->
                authPageSteps
                        .openWhatProjectApp()
                        .checkEmailFieldIsEmpty()
                        .fillEmailFieldWithData(user1.getEmail())
                        .checkPasswordFieldIsEmpty()
                        .fillPasswordFieldWithData(user1.getPassword())
                        .clickSignInButton()
                        .clickMyProfileIcon(driver, MyProfilePageSteps.class)
                        .verifyEmailAddressFieldIsDisplayedCorrectly(user1.getEmail())
                        .clickDropdownMenu()
                        .clickLogOut(driver, AuthPageSteps.class)
                        .checkAuthUrlIslCorrectly(driver));
    }
}