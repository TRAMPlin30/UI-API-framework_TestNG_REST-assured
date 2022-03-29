package pages.courses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.COURSE_NAME;
import static constants.Locators.EditCourseDetails.*;

public class EditCourseDetails extends BasePage {

    @FindBy (xpath = EDIT_COURSE_DETAILS_TAB_XPATH)
    private WebElement editCourseDetailsTab;
    @FindBy (xpath = COURSE_NAME_FIELD_XPATH)
    private WebElement courseNameField;
    @FindBy (xpath = SAVE_BUTTON_XPATH)
    private WebElement saveButton;
    @FindBy (xpath = RESET_BUTTON_XPATH)
    private WebElement resetButton;
    @FindBy (xpath = DISABLE_BUTTON_XPATH)
    private WebElement disableButton;

    public EditCourseDetails (WebDriver driver) {
        super(driver);
    }

    public EditCourseDetails clickEditCourseDetailsTab(){
        editCourseDetailsTab.click();
        return this;
    }

    public void fillCourseNameField(){
        fillField(courseNameField, COURSE_NAME);
    }

    public EditCourseDetails clickSaveButton() {
        saveButton.click();
        return this;
    }

    public EditCourseDetails clickResetButton() {
        resetButton.click();
        return this;
    }

    public EditCourseDetails clickDisableButton() {
        disableButton.click();
        return this;
    }
}
