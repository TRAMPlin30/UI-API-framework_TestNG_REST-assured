package testUi.assignment;

import entities.UnassignedUser;
import org.testng.annotations.Test;
import steps.assignment.UnassignedUsersPageSteps;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;
import testUi.base.BaseTest;

public class UnassignedUsersPageTest extends BaseTest {

    @Test
    public void verifyThatAdminCanAttachRole() {
        UnassignedUser unassignedUser = UnassignedUser.createUser("Unassigned");
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
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

