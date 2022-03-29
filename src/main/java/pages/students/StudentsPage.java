package pages.students;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.StudentsPage.*;

public class StudentsPage extends BasePage {


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
    @FindBy (xpath=NEXT_PAGE)
    private WebElement nextPage;

    public StudentsPage (WebDriver driver) {
        super(driver);
    }

    public void findStudents () { super.fillField(studentNameInput, null); }
    public void switchToDisabledStudent () {super.clickButton(switchDisabledStudent); }
    public void addStudent() {super.clickButton(addStudent); }
    public void editStudent () {super.clickButton(editButton); }
    public void openDetailsTab() {super.clickButton(details);}
    public void nextPage()  {super.clickButton(nextPage);}
    public void openRow () {super.clickButton(rowOnDetailsPage);}
}




