package steps.secretaries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.secretaries.EditSecretaryPage;
import steps.BasePageSteps;

public class EditSecretaryPageSteps extends BasePageSteps {
    EditSecretaryPage editSecretaryPage;

    public EditSecretaryPageSteps(WebDriver driver) {
        super(driver);
        editSecretaryPage = new EditSecretaryPage(driver);

    }

    public EditSecretaryPageSteps verifyEditTabName(WebDriver driver) {
        Assert.assertEquals(editSecretaryPage.getEditSecretaryTab().getAttribute("textContent"), "Edit secretary");
        return this;
    }

    public EditSecretaryPageSteps clickArrowButton() {
        editSecretaryPage.clickArrowButton();
        return this;
    }

    public EditSecretaryPageSteps fillFirstNameFieldWithData() {
        editSecretaryPage.fillFieldFirstName("RobertTT");
        return this;
    }

    public EditSecretaryPageSteps verifyWithChangedName() {
        Assert.assertNotEquals(editSecretaryPage.getFirstNameInput().getAttribute("value"), "Robert");
        return this;
    }

    public EditSecretaryPageSteps clickResetButton() {
        editSecretaryPage.clickResetButton();
        return this;
    }

    public EditSecretaryPageSteps verifyBackName() {
        Assert.assertEquals(editSecretaryPage.getFirstNameInput().getAttribute("value"), "Robert");
        return this;
    }

    public EditSecretaryPageSteps clickLayOffButton() {
        editSecretaryPage.clickLayOffButton();
        return this;
    }

    public EditSecretaryPageSteps clickLayOffButtonForm() {
        editSecretaryPage.clickLayOffButtonForm();
        return this;
    }

    public EditSecretaryPageSteps verifyButtonResetIsDisabled() {
        editSecretaryPage.getSaveButton().isDisplayed();
        return this;
    }

    public EditSecretaryPageSteps verifyButtonSaveIsDisabled() {
        editSecretaryPage.getSaveButton().isDisplayed();
        return this;
    }

    public EditSecretaryPageSteps clickCancelButton() {
        editSecretaryPage.clickCancelButton();
        return this;
    }
}
