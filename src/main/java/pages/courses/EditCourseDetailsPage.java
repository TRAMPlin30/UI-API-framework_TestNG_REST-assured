package pages.courses;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

import java.time.Duration;
import java.util.List;

import static constants.Constants.*;
import static constants.Locators.EditCourseDetails.*;
import static constants.Locators.ListOfCourses.*;


public class EditCourseDetailsPage extends BasePage {

    @FindBy(xpath = EDIT_COURSE_DETAILS_TAB)
    private WebElement editCourseDetailsTab;
    @FindBy(xpath = COURSE_NAME_FIELD)
    private WebElement courseNameField;
    @FindBy(xpath = SAVE_BUTTON)
    private WebElement saveButton;
    @FindBy(xpath = RESET_BUTTON)
    private WebElement resetButton;
    @FindBy(xpath = DISABLE_BUTTON)
    private WebElement disableButton;
    @FindBy(xpath = COURSES_SEARCH_FIELD)
    private WebElement coursesSearchField;
    @FindBy(xpath = EDIT_COURSE_TEST_ICON)
    private WebElement editCourseTestIcon;
    @FindBy(xpath = INVALID_MESSAGE)
    private WebElement invalidMessage;
    @FindBy(xpath = SHORT_MESSAGE)
    private WebElement shortMessage;
    @FindBy(xpath = NEW_COURSE_NAME_TITLE)
    private WebElement newCourseNameTitle;
    @FindBy(xpath = ADD_COURSE_BUTTON)
    private WebElement addCourseButton;
    @FindBy(xpath = COURSES_TEXT_PAGE)
    private WebElement courseTextPage;
    @FindBy(xpath = COURSE_TEST_ROW_TEXT)
    private WebElement courseTestRowText;
    @FindBy(xpath = COURSE_SIDEBAR)
    private WebElement courseSidebar;
    @FindAll(value = {@FindBy(xpath = COURSE_ROW_NAME)})
    private List<WebElement> courseRowName;

    public EditCourseDetailsPage(WebDriver driver) {
        super(driver);
    }


    public void clickEditCourseTestIcon() {
        super.clickButton(editCourseTestIcon);
    }

    public void clickCourseSidebar() {
        super.clickButton(courseSidebar);
    }

    public void clickSaveButton() {
        super.clickButton(saveButton);
    }

    public void clickResetButton() {
        super.clickButton(resetButton);
    }

    public void clickDisableButton() {
        super.clickButton(disableButton);
    }

    public void clickEditCourseDetailsTab() {
        super.clickButton(editCourseDetailsTab);
    }

    public void clickAddCourseButton() {
        super.clickButton(addCourseButton);
    }

    public void clearCourseSearchField() {
        coursesSearchField.sendKeys(Keys.CONTROL + "a");
        coursesSearchField.sendKeys(Keys.DELETE);
    }

    public void fillCourseNameField(String value) {
        super.fillField(courseNameField, value);
    }

    public void fillCoursesSearchField(String value) {
        super.fillField(coursesSearchField, value);
    }

    public boolean getStatusResetButton() {
        return resetButton.isEnabled();
    }

    public boolean getStatusSaveButton() {
        return saveButton.isEnabled();
    }

    public boolean getStatusEditCourseDetailsTab() {
        return editCourseDetailsTab.isEnabled();
    }

    public String getNewCourseNameTitle() {
        return newCourseNameTitle.getText();
    }

    public String getCoursePageText() {
        return courseTextPage.getText();
    }

    public String getCourseTestRowText() {
        return courseTestRowText.getText();
    }

    public String getEditCourseDetailsTabText() {
        return editCourseDetailsTab.getText();
    }

    public void waitCourseTextPageElement() {
        super.waitWebElementVisible(courseTextPage, ELEMENT_WAIT);
    }

    public void waitTime() {
        new WebDriverWait(driver, Duration.ofSeconds(4));
    }
}
