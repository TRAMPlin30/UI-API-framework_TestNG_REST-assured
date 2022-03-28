package page.secretaries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

import java.util.List;

import static constants.Locators.SecretariesPage.*;

public class SecretariesPage extends BasePage {

    @FindBy(xpath = HEADER_SECRETARIES)
    protected WebElement headerSecretaries;

    /*@FindBy(xpath = VIEW_SWITCH_LIST_SECRETARY)
    protected WebElement viewListSecretaries;*/
    @FindBy(xpath = VIEW_SWITCH_CARD_SECRETARY)
    protected WebElement viewCardSecretaries;
    @FindBy(xpath = SEARCH_FIELD_SECRETARY)
    protected WebElement searchInputField;
    @FindBy(xpath = SWITCH_DISABLED_SECRETARY)
    protected WebElement showDisabledSwitcher;
    @FindBy(xpath = ADD_SECRETARY)
    protected WebElement addSecretaryButton;

    @FindAll(value = {@FindBy(xpath = SECRETARY_ROW)})
    public List<WebElement> lineSecretary;
    @FindBy(xpath = ROW_TABLE_SECRETARIES)//строка без кнопки EDIT
    public WebElement rowSecretary;
    @FindBy(xpath = HEAD_NAME_SECRETARY)
    public WebElement HeadName;
    @FindBy(xpath = HEAD_SURNAME_SECRETARY)
    protected WebElement HeadSurname;
    @FindBy(xpath = HEAD_EMAIL_SECRETARY)
    protected WebElement HeadEmail;
    @FindBy(xpath = EDIT_SECRETARY)
    protected WebElement editIcon;

    public SecretariesPage(WebDriver driver) {
        super(driver);
    }

    public void clicksearchInputField() {
        super.clickButton(searchInputField);
    }

    public void clickshowDisabledSwitcher() {

        super.clickButton(showDisabledSwitcher);
    }

    public void clickaddSecretaryButton() {
        super.clickButton(addSecretaryButton);
    }

    public void clickEditIcon() {
        super.clickButton(editIcon);
    }

    public void clickviewCardSecretaries() {
        super.clickButton(viewCardSecretaries);
    }

    public void clickheaderSecretaries() {
        super.clickButton(headerSecretaries);
    }

    public void clicklineSecretary() {
        super.clickButton((WebElement) lineSecretary);
    }

    public void clickrowSecretary() {
        super.clickButton(rowSecretary);
    }

    public void clickHeadName() {
        super.clickButton(HeadName);
    }

    public void clickHeadSurname() {
        super.clickButton(HeadSurname);
    }

    public void clickHeadEmail() {
        super.clickButton(HeadEmail);
    }

    public void fillField(WebElement field, String text) {
        if (field.getAttribute("disabled") == null
                && field.getAttribute("readonly") == null) {
            field.click();
            field.clear();
            field.sendKeys(text);
        }
    }
}




    


