package students;

import base.BaseTest;
import org.testng.annotations.Test;
import steps.auth.AuthPageSteps;
import steps.myProfile.MyProfilePageSteps;
import steps.students.StudentsPageSteps;

public class StudentsPageTest extends BaseTest {

    String searchCriteria = "s";

    @Test
    public void Test3() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton()
                .redirectToPage(driver, StudentsPageSteps.class)
                .fillFieldStudentsName(searchCriteria)
                .verifyFieldStudentsNameContent(searchCriteria)
                .verifyStudentsList(searchCriteria)
                .redirectToPage(driver, MyProfilePageSteps.class)
                .clickDropdownMenu()
                .clickLogOut(driver, AuthPageSteps.class);
    }
}
