package page.courses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeClass;
import page.BasePage;

import static constants.Constants.COURSE_TITTLE_NAME;
import static constants.Constants.courseTittleName;
import static constants.Locators.ListOfCourses.*;

public class ListOfCourses extends BasePage {

    @FindBy(xpath = COURSE_SIDEBAR_XPATH)
    private WebElement courseSidebar;
    @FindBy (xpath =ADD_COURSE_BUTTON_XPATH)
    private WebElement addCourseButton;
    @FindBy (xpath = EDIT_COURSE_ICON_XPATH)
    private WebElement editCourseIcon;
    @FindBy (xpath = DISABLED_COURSE_SWITCH_XPATH)
    private WebElement disabledCourseSwitch;
    @FindBy (xpath = COURSES_TITTLE_SEARCH_FIELD_XPATH)
    private WebElement coursesTittleSearchField;
    @FindBy (xpath = ROW_SWITCH_XPATH)
    private WebElement rowSwitch;
    @FindBy (xpath = CARD_SWITCH_XPATH)
    private WebElement cardSwitch;

    public ListOfCourses(WebDriver driver) {
        super(driver);
    }

    public ListOfCourses clickCourseSidebar() {
        courseSidebar.click();
        return this;
    }

    public ListOfCourses clickAddCourseButton() {
        addCourseButton.click();
        return  this;
    }

    public ListOfCourses clickEditCourseIcon() {
        editCourseIcon.click();
        return this;
    }

    public ListOfCourses clickDisabledCourseSwitch() {
        disabledCourseSwitch.click();
        return this;
    }

    public ListOfCourses clearCourseTittleSearchField() {
        coursesTittleSearchField.clear();
        return this;
    }

    public void fillCourseTittleSearchField(){
        fillField(coursesTittleSearchField, COURSE_TITTLE_NAME); //constants
    }

    public ListOfCourses clickRowSwitch() {
        rowSwitch.click();
        return this;
    }

    public ListOfCourses clickCardSwitch() {
        cardSwitch.click();
        return this;
    }
}
