package pages.students;

import constants.Locators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.EditStudentDetailsTab.EMAIL_FIELD;
import static constants.Locators.EditStudentDetailsTab.GROUP_FIELD;
import static constants.Locators.RegistrationPage.FIRST_NAME_FIELD;
import static constants.Locators.RegistrationPage.LAST_NAME_FIELD;
import static constants.Locators.StudentsPage.*;

public class StudentsDetails extends BasePage {


    @FindBy(xpath = Locators.EditStudentDetailsTab.FIRST_NAME_FIELD)
    private WebElement editFirstName;
    @FindBy(xpath = LAST_NAME_FIELD)
    private WebElement editFirstNam;
    @FindBy(xpath = EMAIL_FIELD)
    private WebElement editEmailName;
    @FindBy(xpath = GROUP_FIELD)
    private WebElement editGROUP;

    public StudentsDetails(WebDriver driver) {
        super(driver);
    }

}

