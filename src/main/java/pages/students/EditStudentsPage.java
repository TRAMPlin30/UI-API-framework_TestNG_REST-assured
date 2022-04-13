package pages.students;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import lombok.Getter;

import static constants.Locators.EditStudentDetailsTab.*;

@Getter
public class EditStudentsPage extends BasePage {

    @FindBy(xpath = EDIT_STUDENT_DETAILS_HEADER)
    private WebElement studentDetailsHeader;
    @FindBy(xpath = FIRST_NAME_FIELD)
    private WebElement firstNameFieldEditPage;
    @FindBy(xpath = LAST_NAME_FIELD)
    private WebElement lastNameFieldEditPage;
    @FindBy(xpath = EMAIL_FIELD)
    private WebElement emailFieldEditPage;
    @FindBy(xpath = GROUP_FIELD)
    private WebElement groupFieldEditPage;
    @FindBy(xpath = GROUPS_PLUS_BUTTON)
    private WebElement groupPlusButton;
    @FindBy(xpath = EXCLUDE_BUTTON)
    private WebElement excludeButtonEdit;
    @FindBy(xpath = RESET_BUTTON)
    private WebElement resetButtonEdit;
    @FindBy(xpath = SAVE_BUTTON)
    private WebElement saveButtonEdit;

    public EditStudentsPage(WebDriver driver) {
        super(driver);
    }

    public void fillFirstName(String value) {
        super.fillField(firstNameFieldEditPage, value);
    }

    public void fillLastName(String value) {
        super.fillField(firstNameFieldEditPage, value);
    }

    public void fillEmailName(String value) {
        super.fillField(firstNameFieldEditPage, value);
    }

    public void fillGroupField(String value) {
        super.fillField(firstNameFieldEditPage, value);
    }

    public void clickPlusButton() {
        super.clickButton(groupPlusButton);
    }

    public void clickResetButton() {
        super.clickButton(resetButtonEdit);
    }

    public void clickSaveButton() {
        super.clickButton(saveButtonEdit);
    }
}



