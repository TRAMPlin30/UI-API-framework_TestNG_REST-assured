package steps.courses;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.courses.CourseDetailsPage;
import steps.BasePageSteps;

import static constants.Constants.*;
import static constants.Messages.Courses.*;

public class CourseDetailsPageSteps extends BasePageSteps {

    CourseDetailsPage courseDetailsPage;

    public CourseDetailsPageSteps(WebDriver driver) {
        super(driver);
        courseDetailsPage = new CourseDetailsPage(driver);
    }

    public CourseDetailsPageSteps clickCourseSidebar() {
        courseDetailsPage.clickCourseSidebar();
        return this;
    }

    public CourseDetailsPageSteps verifyListOfCoursesUrlIsCorrect (WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), COURSES_URL, URL_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps verifyCourseTextPageElement() {
        Assert.assertEquals(courseDetailsPage.getCourseTextPageElement(), "Courses", TEXT_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps clickCardIconButton() {
        courseDetailsPage.clickCardIconButton();
        return this;
    }

    public CourseDetailsPageSteps verifyCardText() {
        Assert.assertEquals(courseDetailsPage.getCardText(), "Soft Skills for Lecturers",  TEXT_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps clickCardDetailsButton() {
        courseDetailsPage.clickCardDetailsButton();
        return this;
    }

    public CourseDetailsPageSteps verifyCourseNameTextDetails() {
        Assert.assertEquals(courseDetailsPage.getCourseNameTextDetails(), "Soft Skills for Lecturers", TEXT_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps compareCardTextEqualsCourseNameTextDetails() {
        Assert.assertEquals(verifyCardText(), verifyCourseNameTextDetails(), TEXT_NOT_SAME_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps verifyCourseDetailsUrlIsCorrect(WebDriver driver) {
        Assert.assertEquals(driver.getCurrentUrl(), COURSE_DETAILS_URL, URL_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps verifyCourseDetailsTabText() {
        Assert.assertEquals(courseDetailsPage.getCourseDetailsTabText(), "Course details", TEXT_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps verifyCourseDetailsTabIsEnabled(){
        Assert.assertTrue(courseDetailsPage.getStatusCourseDetailsTabElement(), DISABLED_BUTTON_MESSAGE);
        return this;
    }

    public CourseDetailsPageSteps clickArrowLeftButton() {
        courseDetailsPage.clickArrowLeftButton();
        return this;
    }

    public CourseDetailsPageSteps clickArrowDownIconExit() {
        courseDetailsPage.clickArrowDownIconExit();
        return this;
    }

    public CourseDetailsPageSteps clickLogOutButton() {
        courseDetailsPage.clickLogOutButton();
        return this;
    }
}
