package pages.secretaries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.EditSecretary.*;

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

    public EditSecretaryPage(WebDriver driver) {
        super(driver);
    }

    public void openSecretaryDetailsTab() {
        super.clickButton(editSecretaryTab);
    }
    public void returnToSecretariesPage() {
        super.clickButton(arrowButton);
    }
    public void EditNameSecretary (String name) {

        super.fillField(firstNameInput, name);
    }
    public void EditSurnameSecretary (String surname) {

        super.fillField(lastNameInput, surname);
    }
    public void EditEmailSecretary(String email) {

        super.fillField(emailInput, email);
    }
    public void clicksaveButton() {

        super.clickButton(saveButton);
    }
    public void clicklayOfButton() {

        super.clickButton(layOffButton);
    }
    public void clickresetButton() {

        super.clickButton(resetButton);
    }
    public void clickSecretariesDetailsTitle(){

        super.clickButton(secretariesDetailsTitle);
    }
}
