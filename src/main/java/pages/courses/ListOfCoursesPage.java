package pages.courses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.ListOfCourses.*;

public class ListOfCoursesPage extends BasePage {

    @FindBy(xpath = COURSE_SIDEBAR)
    private WebElement courseSidebar;
    @FindBy(xpath = ADD_COURSE_BUTTON)
    private WebElement addCourseButton;
    @FindBy(xpath = DISABLED_COURSE_SWITCH)
    private WebElement disabledCourseSwitch;
    @FindBy(xpath = COURSES_SEARCH_FIELD)
    private WebElement coursesSearchField;
    @FindBy(xpath = ROW_ICON_BUTTON)
    private WebElement rowIconButton;
    @FindBy(xpath = CARD_ICON_BUTTON)
    private WebElement cardIconButton;
    @FindBy(xpath = COURSE_NAME_TITLE)
    private WebElement courseNameTitle;
    @FindBy(xpath = COURSES_TEXT_PAGE)
    private WebElement courseTextPage;
    @FindBy(xpath = NUMBER_OF_COURSES)
    private WebElement numberOfCourses;
    @FindBy(xpath = PAGINATION_LIST_BUTTON)
    private WebElement paginationListButton;
    @FindBy(xpath = TITLE_SORT)
    private WebElement titleSort;
    @FindAll(value = {@FindBy(xpath = COURSE_ROW_NAME)})
    private List<WebElement> courseRowName;
    @FindAll(value = {@FindBy(xpath = PAGINATION_LIST)})
    private List<WebElement> paginationList;

    public ListOfCoursesPage(WebDriver driver) {
        super(driver);
    }

    public void waitCoursePage() {
        waitWebElementVisible(courseNameTitle, ELEMENT_WAIT);
    }

    public void clickCourseSidebar() {
        super.clickButton(courseSidebar);
    }

    public void clickDisabledCourseSwitch() {
        super.clickButton(disabledCourseSwitch);
    }

    public void clickPaginationListButton() {
        super.clickButton(paginationListButton);
    }

    public void clickTitleSort() {
        super.clickButton(titleSort);
    }

    public void clickAddCourseButton() {
        super.clickButton(addCourseButton);
    }

    public void clickRowIconButton() {
        super.clickButton(rowIconButton);
    }

    public void clickCardIconButton() {
        super.clickButton(cardIconButton);
    }

    public void clearCourseSearchField() {
        coursesSearchField.clear();
    }

    public void fillCoursesSearchField(String value) {
        super.fillField(coursesSearchField, value);
    }

    public boolean getDisabledCourseSwitchElement() {
        return disabledCourseSwitch.isDisplayed();
    }

    public boolean getRowIconButtonElement() {
        return rowIconButton.isDisplayed();
    }

    public boolean getCardIconButton() {
        return cardIconButton.isDisplayed();
    }

    public boolean getCoursesSearchFieldElement() {
        return coursesSearchField.isDisplayed();
    }

    public boolean getAddCourseButtonElement() {
        return addCourseButton.isDisplayed();
    }

    public boolean getStatusRowIconButton() {
        return rowIconButton.isEnabled();
    }

    public boolean getStatusCardIconButton() {
        return cardIconButton.isEnabled();
    }

    public boolean getStatusCourseSearchField() {
        return coursesSearchField.isEnabled();
    }

    public boolean getStatusDisabledCourseSwitch() {
        return coursesSearchField.isEnabled();
    }

    public String getNumberOfCoursesText(String numberOfCoursesText) {
        return numberOfCourses.getText();
    }

    public String getCourseTextPageElement() {
        return courseTextPage.getText();
    }

    public String getTextNumberOfCoursesElement() {
        return numberOfCourses.getText();
    }

    public int getNumberOfRows() {
        return getCourseRowNameList().size();
    }

    public WebElement getCoursesSearchField() {
        return coursesSearchField;
    }

    public List<String> getCourseRowNameList() {
        List<String> CourseRowNameList = new ArrayList<>();
        courseRowName.forEach(t -> CourseRowNameList.add(t.getText()));
        return CourseRowNameList;
    }

    public List<String> sortCourseRowNameListByAlphabet() {
        List<String> CourseRowNameListSorted = new ArrayList<>();
        Collections.sort(CourseRowNameListSorted);
        return CourseRowNameListSorted;
    }

    public List<String> sortCourseRowNameListByAlphabetReverse() {
        List<String> CourseRowNameListSortedReverse = new ArrayList<>();
        Collections.sort(CourseRowNameListSortedReverse, Collections.reverseOrder());
        return CourseRowNameListSortedReverse;
    }

    public List<Integer> getPaginationList() {
        List<Integer> paginationNumbersList = new ArrayList<>();
        paginationList.forEach(t -> paginationNumbersList.add(Integer.parseInt(t.getText())));
        return paginationNumbersList;
    }
}
