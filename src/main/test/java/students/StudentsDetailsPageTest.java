package students;

import base.BaseTest;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;
import steps.students.StudentsPageSteps;

public class StudentsDetailsPageTest extends BaseTest {

    @Test
    public void firsTest() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton()
                .redirectToPage(driver, StudentsPageSteps.class)
                .clickButtonCardViewer()
                .verifyDetailsButtonIsEnabled(true)
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class);
    }
}
