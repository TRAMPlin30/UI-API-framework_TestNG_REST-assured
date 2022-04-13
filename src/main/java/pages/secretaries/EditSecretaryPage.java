package pages.secretaries;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import static constants.Locators.EditSecretary.*;

@Getter
public class EditSecretaryPage extends BasePage {

    @FindBy(xpath = SECRETARY_DETAILS_ARROW_BUTTON)
    protected WebElement arrowButton;
    @FindBy(xpath = SECRETARY_FIRST_NAME)
    protected WebElement firstNameInput;
    @FindBy(xpath = SECRETARY_LAST_NAME)
    protected WebElement lastNameInput;
    @FindBy(xpath = SECRETARY_EMAIL)
    protected WebElement emailInput;
    @FindBy(xpath = EDIT_SECRETARY_TAB)
    protected WebElement editSecretaryTab;
    @FindBy(xpath = SECRETARY_LAY_OFF_BUTTON)
    protected WebElement layOffButton;
    @FindBy(xpath = RESET_SECRETARY_BUTTON)
    protected WebElement resetButton;
    @FindBy(xpath = SECRETARY_SAVE_BUTTON)
    protected WebElement saveButton;
    @FindBy(xpath = SECRETARY_DETAILS_TITLE)
    protected WebElement secretariesDetailsTitle;
    @FindBy(xpath = MESSAGE_DONE_EDIT_SECRETARIES_TEXT)
    protected WebElement messageSave;
    @FindBy(xpath = CONFIRM_ACTION)
    protected WebElement confirmActionForm;
    @FindBy(xpath = CANCEL_BUTTON)
    protected WebElement cancelButton;
    @FindBy(xpath = LAY_OFF_BUTTON)
    protected WebElement layOffButtonForm;

    public EditSecretaryPage(WebDriver driver) {
        super(driver);
    }

    public void clickArrowButton() {
        super.clickButton(arrowButton);
    }
    public void clickLayOffButtonForm() {
        super.clickButton(layOffButtonForm);
    }

    public void clickCancelButton() {
        super.clickButton(cancelButton);
    }
    public void clickLayOffButton() {
        super.clickButton(layOffButton);
    }
    public void clickResetButton() {
        super.clickButton(resetButton);
    }
    public void fillFieldFirstName(String value) {

        super.fillField(firstNameInput, value);
    }

    public void fillFieldLastName(String value) {
        super.fillField(lastNameInput, value);
    }

    public void openSecretaryDetailsTab() {
        super.clickButton(editSecretaryTab);
    }
    public void clickSaveButton() {
        super.clickButton(saveButton);
    }
    public void clickSecretariesDetailsTitle() {
        super.clickButton(secretariesDetailsTitle);
    }
}
