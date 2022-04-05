package steps.assignment;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.assignment.UnassignedUsersPage;
import steps.BasePageSteps;

import static constants.Messages.DoneMessages.MESSAGE_DONE_ASSIGNED;

public class UnassignedUsersPageStep extends BasePageSteps {

    UnassignedUsersPage unassignedUsersPage;

    public UnassignedUsersPageStep(WebDriver driver) {
        super(driver);
        unassignedUsersPage = new UnassignedUsersPage(driver);
    }

    public UnassignedUsersPageStep clickUnassignedUsersSidebar(){
        unassignedUsersPage.sideBarUnassignedClick();
        return this;
    }

    public UnassignedUsersPageStep clickForAllUserInTable(){
        unassignedUsersPage.clickForAllElements();
        return this;
    }

    public UnassignedUsersPageStep chooseUserRoleStudent(WebDriver driver, String email) {
       unassignedUsersPage.chooseRoleStudent(driver, email);
        return this;
    }

    public UnassignedUsersPageStep chooseUserRoleMentor(WebDriver driver, String email) {
        unassignedUsersPage.chooseRoleMentor(driver, email);
        return this;
    }

    public UnassignedUsersPageStep chooseUserRoleSecretary(WebDriver driver, String email) {
        unassignedUsersPage.chooseRoleSecretary(driver, email);
        return this;
    }

    public UnassignedUsersPageStep clickButtonAdRole(WebDriver driver, String email) {
        unassignedUsersPage.buttonAddRole(driver, email);
        return this;
    }

    public UnassignedUsersPageStep checkUserAssigned() {
        Assert.assertEquals(unassignedUsersPage.messageSuccessfully.getText(), MESSAGE_DONE_ASSIGNED);
        return this;
    }
}
