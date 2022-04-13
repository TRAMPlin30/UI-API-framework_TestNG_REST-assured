package pages.secretaries;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.SecretaryDetails.*;

@Getter
public class SecretariesDetailsPage extends BasePage {

    public SecretariesDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = SECRETARY_DETAILS_TITLE)
    protected WebElement pageTitle;
    @FindBy(xpath = SECRETARY_DETAILS_ARROW_BUTTON)
    protected WebElement arrowButton;
    @FindBy(xpath = SECRETARY_DETAILS_FIRST_NAME)
    protected WebElement firstNameField;
    @FindBy(xpath = SECRETARY_DETAILS_LAST_NAME)
    protected WebElement lastNameField;
    @FindBy(xpath = SECRETARY_DETAILS_EMAIL)
    protected WebElement emailField;
    @FindBy(xpath = SECRETARY_NAME_LIST)
    protected WebElement nameLine;
    @FindBy(xpath = SECRETARY_SURNAME)
    protected WebElement surnameLine;
    @FindBy(xpath = SECRETARY_EMAIL)
    protected WebElement emailLine;


    public void clickPageTitle() {
        super.clickButton(pageTitle);
    }

    public void clickArrowButton() {
        super.clickButton(arrowButton);
    }
}