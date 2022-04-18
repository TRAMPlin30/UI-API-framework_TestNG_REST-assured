package testUi.courses;

import testUi.base.BaseTest;
import org.testng.annotations.Test;
import steps.courses.CourseDetailsPageSteps;
import steps.courses.ListOfCoursesPageSteps;

public class ListOfCoursesTest extends BaseTest {

    @Test
    public void verifySwitchButton() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, ListOfCoursesPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .waitCourseNameIsRendered()
                .verifyCourseTextPageElement()
                .compareNumberOfEnabledCoursesRows()
                .verifyDisabledCourseSwitchElement()
                .verifyDisabledCourseSwitch()
                .clickDisabledCourseSwitch()
                .compareNumberOfDisabledCoursesRows()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }

    @Test
    public void verifyPagination() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, ListOfCoursesPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .waitCourseNameIsRendered()
                .verifyCourseTextPageElement()
                .clickPaginationListButton()
                .comparePaginationLists()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }

    @Test
    public void verifySortList() {
        authPageSteps
                .openWhatProjectApp()
                .fillEmailFieldWithData(user.getEmail())
                .fillPasswordFieldWithData(user.getPassword())
                .clickSignInButton(driver, ListOfCoursesPageSteps.class)
                .clickCourseSidebar()
                .verifyListOfCoursesUrlIsCorrect(driver)
                .waitCourseNameIsRendered()
                .verifyCourseTextPageElement()
                .getTitleList()
                .clickTitleSort()
                .compareSortedByAlphabetList()
                .compareSortedByAlphabetListReverse()
                .redirectToPage(driver, CourseDetailsPageSteps.class)
                .clickArrowDownIconExit()
                .clickLogOutButton();
    }
}
