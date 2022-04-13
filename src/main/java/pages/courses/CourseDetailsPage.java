package pages.courses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.ListOfCourses.*;
import static constants.Locators.CourseDetails.*;

public class CourseDetailsPage extends BasePage {

    @FindBy(xpath = CARD_ICON_BUTTON)
    private WebElement cardIconButton;
    @FindBy(xpath = CARD_DETAILS_BUTTON)
    private WebElement cardDetailsButton;
    @FindBy(xpath = ARROW_LEFT_BUTTON)
    private WebElement arrowLeftButton;
    @FindBy(xpath = COURSE_DETAILS_TAB)
    private WebElement courseDetailsTab;
    @FindBy(xpath = COURSE_SIDEBAR)
    private WebElement courseSidebar;
    @FindBy(xpath = CARD_TEXT)
    private WebElement cardText;
    @FindBy(xpath = COURSE_NAME_TEXT_DETAILS)
    private WebElement courseNameTextDetails;
    @FindBy(xpath = COURSES_TEXT_PAGE)
    private WebElement courseTextPage;
    @FindBy(xpath = ARROW_DOWN_ICON_EXIT)
    private WebElement arrowDownIconExit;
    @FindBy(xpath = LOGOUT_BUTTON)
    private WebElement logoutButton;

    public CourseDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void clickCardIconButton() {
        super.clickButton(cardIconButton);
    }

    public void clickCardDetailsButton() {
        super.clickButton(cardDetailsButton);
    }

    public void clickArrowLeftButton() {
        super.clickButton(arrowLeftButton);
    }

    public void clickArrowDownIconExit() {
        super.clickButton(arrowDownIconExit);
    }

    public void clickLogOutButton() {
        super.clickButton(logoutButton);
    }

    public void clickCourseSidebar() {
        super.clickButton(courseSidebar);
    }

    public String getCardText() {
        return cardText.getText();
    }

    public String getCourseNameTextDetails() {
        return courseNameTextDetails.getText();
    }

    public String getCourseTextPageElement() {
        return courseTextPage.getText();
    }

    public String getCourseDetailsTabText() {
        return courseDetailsTab.getText();
    }

    public boolean getStatusCourseDetailsTabElement() {
        return courseDetailsTab.isEnabled();
    }
}
