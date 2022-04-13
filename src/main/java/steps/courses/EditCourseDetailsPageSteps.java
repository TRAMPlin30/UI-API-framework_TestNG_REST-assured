package steps.courses;

import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import pages.courses.EditCourseDetailsPage;
import steps.BasePageSteps;


import static constants.Constants.*;
import static constants.Messages.Courses.*;

public class EditCourseDetailsPageSteps extends BasePageSteps {

    EditCourseDetailsPage editCourseDetailsPage;

    public EditCourseDetailsPageSteps (WebDriver driver){
        super(driver);
        editCourseDetailsPage = new EditCourseDetailsPage(driver);
    }

    public EditCourseDetailsPageSteps verifyListOfCoursesUrlIsCorrect (WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), COURSES_URL, URL_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps clickCourseSidebar() {
        editCourseDetailsPage.clickCourseSidebar();
        return this;
    }

    public EditCourseDetailsPageSteps verifyCoursePageText() {
        Assert.assertEquals(editCourseDetailsPage.getCoursePageText(), "Courses", TEXT_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps clickEditCourseIcon() {
        editCourseDetailsPage.clickEditCourseTestIcon();
        return this;
    }

    public EditCourseDetailsPageSteps verifyEditCourseUrlIsCorrect (WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), EDIT_COURSE_URL, URL_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps verifyEditCourseDetailsTabText() {
        Assert.assertEquals(editCourseDetailsPage.getEditCourseDetailsTabText(), "Edit course details", TEXT_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps verifyResetButtonIsDisabled() {
        Assert.assertFalse(editCourseDetailsPage.getStatusResetButton(), ENABLED_BUTTON_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps verifySaveButtonIsDisabled() {
        Assert.assertFalse(editCourseDetailsPage.getStatusSaveButton(), ENABLED_BUTTON_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps verifyEditCourseDetailsTabIsEnabled() {
        Assert.assertTrue(editCourseDetailsPage.getStatusEditCourseDetailsTab(), DISABLED_BUTTON_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps clearCourseNameField() {
        editCourseDetailsPage.clearCourseSearchField();
        return this;
    }

    public EditCourseDetailsPageSteps fillCourseNameFieldOne() {
        editCourseDetailsPage.fillCourseNameField("Test Course 1");
        return this;
    }

    public EditCourseDetailsPageSteps verifyResetButtonIsEnabled() {
        Assert.assertTrue(editCourseDetailsPage.getStatusResetButton(), DISABLED_BUTTON_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps verifySaveButtonIsEnabled() {
        Assert.assertTrue(editCourseDetailsPage.getStatusSaveButton(), DISABLED_BUTTON_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps clickSaveButton() {
        editCourseDetailsPage.clickSaveButton();
        return this;
    }

    public EditCourseDetailsPageSteps fillCourseSearchFieldNewName() {
        editCourseDetailsPage.fillCoursesSearchField("Test Course 1");
        return this;
    }

    public EditCourseDetailsPageSteps verifyNewCourseNameRowText() {
        Assert.assertEquals(editCourseDetailsPage.getNewCourseNameTitle(), "Test Course 1", TEXT_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps fillCourseNameTestCourse() {
        editCourseDetailsPage.fillCoursesSearchField("Test Course");
        return this;
    }

    public EditCourseDetailsPageSteps fillCourseSearchField() {
        editCourseDetailsPage.fillCoursesSearchField("Test Course");
        return this;
    }

    public EditCourseDetailsPageSteps verifyCourseTestRowText() {
        Assert.assertEquals(editCourseDetailsPage.getCourseTestRowText(), "Test Course", TEXT_MESSAGE);
        return this;
    }

    public EditCourseDetailsPageSteps waitCourseTextPageElement() {
        editCourseDetailsPage.waitCourseTextPageElement();
        return this;
    }
}

