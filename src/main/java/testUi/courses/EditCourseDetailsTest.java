package testUi.courses;

import testUi.base.BaseTest;
import org.testng.annotations.Test;
import steps.courses.CourseDetailsPageSteps;
import steps.courses.EditCourseDetailsPageSteps;

public class EditCourseDetailsTest extends BaseTest {

    @Test
    public void editCourseDetails(){
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, EditCourseDetailsPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCoursePageText()
                .clickEditCourseIcon()
                .verifyEditCourseUrlIsCorrect(driver)
                .verifyEditCourseDetailsTabText()
                .verifyResetButtonIsDisabled()
                .verifySaveButtonIsDisabled()
                .verifyEditCourseDetailsTabIsEnabled()
                .clearCourseNameField()
                .fillCourseNameFieldOne()
                .verifyResetButtonIsEnabled()
                .verifySaveButtonIsEnabled()
                .clickSaveButton()
                .waitCourseTextPageElement()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCoursePageText()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }

    @Test
    public void verifyNewCourseName() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, EditCourseDetailsPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCoursePageText()
                .fillCourseSearchFieldNewName()
                .verifyNewCourseNameRowText()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }

    @Test
    public void renameToPreviousCourseDetails(){
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, EditCourseDetailsPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCoursePageText()
                .clickEditCourseIcon()
                .verifyEditCourseUrlIsCorrect(driver)
                .verifyEditCourseDetailsTabText()
                .verifyResetButtonIsDisabled()
                .verifySaveButtonIsDisabled()
                .verifyEditCourseDetailsTabIsEnabled()
                .clearCourseNameField()
                .fillCourseNameTestCourse()
                .verifyResetButtonIsEnabled()
                .verifyResetButtonIsEnabled()
                .verifySaveButtonIsEnabled()
                .clickSaveButton()
                .waitCourseTextPageElement()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCoursePageText()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }

    @Test
    public void verifyPreviousCourseName() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, EditCourseDetailsPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .verifyCoursePageText()
                .fillCourseSearchField()
                .verifyCourseTestRowText()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }
}
