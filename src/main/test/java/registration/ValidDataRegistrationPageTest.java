package registration;

import base.BaseTest;
import entities.UnassignedUser;
import org.testng.annotations.Test;
import pages.registration.data_for_registration.StaticProvider;
import steps.assignment.UnassignedUsersPageStep;

public class ValidDataRegistrationPageTest extends BaseTest {

    @Test (dataProviderClass = StaticProvider.class, dataProvider = "create")
    public void verifyUserCanRegisterAsMentor(String name, String sureName, String email, String password, String confPassword) {

        UnassignedUser registeredUser;

        authPageSteps
                .openWhatProjectApp()
                .checkAuthUrlIslCorrectly(driver)
                .clickRegistrationLink(driver)
                .waitRegistrationFormIsRendered()
                .verifyRegistrationUrlIslCorrectly(driver)
                .checkFirstNameFieldIsEmpty()
                .fillFirstNameField(name)
                .checkLastNameFieldIsEmpty()
                .fillLastNameField(sureName)
                .checkEmailAddressFieldIsEmpty()
                .fillEmailAddressFieldWithData(email)
                .checkPasswordFieldIsEmpty()
                .fillPasswordFieldFieldWithData(password)
                .checkConfirmPasswordFieldIsEmpty()
                .fillConfirmPasswordFieldFieldWithData(confPassword)
                .checkThatButtonSignUpIsEnabled()
                .clickButtonSignUp()
                .checkThatUserRegistered()
                .clickButtonBackToReturnAuthPage(driver);

        registeredUser = UnassignedUser.createUser("Unassigned");

        authPageSteps
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, UnassignedUsersPageStep.class)
                .clickUnassignedUsersSidebar()
                .clickForAllUserInTable()
                .chooseUserRoleMentor(driver, registeredUser.getEmail())
                .clickButtonAdRole(driver, registeredUser.getEmail())
                .checkUserAssigned(); // Message {The user has been successfully assigned as a mentor}
    }
}
