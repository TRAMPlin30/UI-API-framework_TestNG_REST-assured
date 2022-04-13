package pages.students;

import constants.Locators;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.StudentsPage.*;

@Getter
public class StudentsPage extends BasePage implements Locators.PaginationItems {

    @FindBy(xpath = STUDENTS_PAGE_HEADER)
    private WebElement studentsPageHeader;
    @FindBy(xpath = STUDENT_NAME_INPUT)
    private WebElement studentNameInput;
    @FindBy(xpath = SWITCH_DISABLED_STUDENT)
    private WebElement switchDisabledStudent;
    @FindBy(xpath = ADD_STUDENT)
    private WebElement addStudent;
    @FindBy(xpath = TABLE_HEADLINES)
    private WebElement tableHeadlines;
    @FindBy(xpath = EDIT_BUTTON)
    private WebElement editButton;
    @FindBy(xpath = DETAILS)
    private WebElement details;
    @FindBy(xpath = ROW_ON_DETAILS_PAGE)
    private WebElement rowOnDetailsPage;
    @FindBy(xpath = NEXT_PAGE)
    private WebElement nextPage;
    @FindBy(xpath = STUDENTS_ROW)
    private WebElement studentsRow;
    @FindBy(xpath = SIDE_BAR_INPUT)
    private WebElement sideBarInput;
    @FindBy(xpath = BUTTON_CURRENT_PAGE)
    private WebElement buttonCurrentPage;
    @FindBy(xpath = BUTTON_NEXT_PAGE)
    private WebElement buttonNextPage;
    @FindBy(xpath = STUDENTS_TABLE_BODY)
    private WebElement studentsTableBody;
    @FindBy(xpath = STUDENTS_TABLE_ROWS)
    private WebElement studentsTableRows;
    @FindBy(xpath = STUDENTS_DETAILS_BUTTON)
    private WebElement buttonDetails;
    @FindBy(xpath = BUTTON_CARD_VIEW)
    private WebElement buttonCard;
    @FindBy(xpath = BUTTON_STUDENTS_TABLE)
    private WebElement buttonStudentsTable;

    public StudentsPage(WebDriver driver) {
        super(driver);
    }
}








