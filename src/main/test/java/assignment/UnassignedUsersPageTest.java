package assignment;

import base.BaseTest;
import entities.UnassignedUser;
import org.testng.annotations.Test;
import steps.assignment.UnassignedUsersPageSteps;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;

public class UnassignedUsersPageTest extends BaseTest {
    UnassignedUser unassignedUser = UnassignedUser.createUser("Unassigned");

    @Test
    public void verifyThatAdminCanAttachRole() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(users.getEmail())
                .fillPasswordFieldWithData(users.getPassword())
                .clickSignInButton(driver, UnassignedUsersPageSteps.class)
                .clickUnassignedUsersSidebar()
                .clickForAllUserInTable(driver)
                .chooseUserRoleSecretary(driver, unassignedUser.getEmail())
                .clickButtonAddRole(driver, unassignedUser.getEmail())
                .checkUserAssignedAsSecretary()
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class)
                .checkAuthUrlIslCorrectly(driver);
    }
}

