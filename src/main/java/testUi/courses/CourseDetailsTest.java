package testUi.courses;

import testUi.base.BaseTest;
import org.testng.annotations.Test;
import steps.courses.CourseDetailsPageSteps;

public class CourseDetailsTest extends BaseTest {

    @Test
    public void verifyCourseDetailsFunctions() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, CourseDetailsPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect (driver)
                .verifyCourseTextPageElement()
                .clickCardIconButton()
                .verifyCardText()
                .clickCardDetailsButton()
                .verifyCourseNameTextDetails()
                .compareCardTextEqualsCourseNameTextDetails()
                .verifyCourseDetailsUrlIsCorrect(driver)
                .verifyCourseDetailsTabText()
                .verifyCourseDetailsTabIsEnabled()
                .clickArrowLeftButton()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCourseTextPageElement()
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }
}
