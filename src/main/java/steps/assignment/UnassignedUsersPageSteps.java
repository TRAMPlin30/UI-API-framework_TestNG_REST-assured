package steps.assignment;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.assignment.UnassignedUsersPage;
import steps.BasePageSteps;

import java.time.Duration;

import static constants.Constants.IMPLICITLY_WAIT;
import static constants.Messages.DoneMessages.*;

@Getter
public class UnassignedUsersPageSteps extends BasePageSteps {

    UnassignedUsersPage unassignedUsersPage;

    public UnassignedUsersPageSteps(WebDriver driver) {
        super(driver);
        unassignedUsersPage = new UnassignedUsersPage(driver);
    }

    public UnassignedUsersPageSteps clickUnassignedUsersSidebar(){
        unassignedUsersPage.sideBarUnassignedClick();
        return this;
    }

    public UnassignedUsersPageSteps clickForAllUserInTable(WebDriver driver){
        unassignedUsersPage.clickForAllElements();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICITLY_WAIT));
        return this;
    }

    public UnassignedUsersPageSteps chooseUserRoleStudent(WebDriver driver, String email) {
       unassignedUsersPage.chooseRoleStudent(driver, email);
        return this;
    }

    public UnassignedUsersPageSteps chooseUserRoleMentor(WebDriver driver, String email) {
        unassignedUsersPage.chooseRoleMentor(driver, email);
        return this;
    }

    public UnassignedUsersPageSteps chooseUserRoleSecretary(WebDriver driver, String email) {
        unassignedUsersPage.chooseRoleSecretary(driver, email);
        return this;
    }

    public UnassignedUsersPageSteps clickButtonAddRole(WebDriver driver, String email) {
        unassignedUsersPage.buttonAddRole(driver, email);
        return this;
    }

    public UnassignedUsersPageSteps checkUserAssignedAsSecretary() {
        Assert.assertEquals(unassignedUsersPage.messageSuccessfully.getText(), MESSAGE_DONE_ASSIGNED_SECRETARY);
        return this;
    }
}
