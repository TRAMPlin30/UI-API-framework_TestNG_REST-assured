package pages.secretaries;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

import static constants.Locators.SecretariesPage.*;
import static constants.Locators.SideBarItems.SIDEBAR_ITEM_SECRETARIES;

@Getter
public class SecretariesPage extends BasePage {

    @FindBy(xpath = HEADER_SECRETARIES)
    protected WebElement headerSecretaries;

    @FindBy(xpath = PROFILE_INFO)
    protected WebElement profileInfo;
    @FindBy(xpath = PROFILE_LOG_OUT)
    protected WebElement profileLogOut;

    @FindBy(xpath = VIEW_SWITCH_LIST_SECRETARY)
    protected WebElement viewListSecretaries;
    @FindBy(xpath = VIEW_SWITCH_CARD_SECRETARY)
    protected WebElement viewCardSecretaries;

    @FindBy(xpath = BODY_CARD_SECRETARY)
    protected WebElement bodyCardSecretaries;
    @FindBy(xpath = SEARCH_FIELD_SECRETARY)
    protected WebElement searchInputField;
    @FindBy(xpath = SWITCH_DISABLED_SECRETARY)
    protected WebElement showDisabledSwitcher;
    @FindBy(xpath = ADD_SECRETARY)
    protected WebElement addSecretary;

    @FindBy(xpath = DROPDOWN_ROW)
    public WebElement dropDownList;
    @FindBy(xpath = DROPDOWN_LIST_ROW)
    public WebElement dropDownItem9;
    @FindBy(xpath = HEAD_NAME_SECRETARY)
    public List<WebElement> nameList;
    @FindBy(xpath = HEAD_SURNAME_SECRETARY)
    public List<WebElement> surnameList;
    @FindBy(xpath = HEAD_EMAIL_SECRETARY)
    public List<WebElement> emailList;
    @FindBy(xpath = SORT_ASCENDING)
    public static WebElement sortButton;
    @FindBy(xpath = EDIT_SECRETARY)
    protected WebElement editIcon;
    @FindBy(xpath = LINE_LIST_SECRETARIES)
    protected WebElement lineListSecretaries;

    @FindBy(xpath = SIDEBAR_ITEM_SECRETARIES)
    public WebElement sideBarSecretaries;

    public SecretariesPage(WebDriver driver) {
        super(driver);
    }

    public void clickViewCardSecretaries() {
        super.clickButton(viewCardSecretaries);
    }

    public void clickViewListSecretaries() {
        super.clickButton(viewListSecretaries);
    }

    public void clickSearchInputField() {
        super.clickButton(searchInputField);
    }

    public void clickShowDisabledSwitcher() {
        super.clickButton(showDisabledSwitcher);
    }

    public void clickAddSecretary() {
        super.clickButton(addSecretary);
    }

    public void clickEditIcon() {
        super.clickButton(editIcon);
    }

    public void clickDropDownList() {
        super.clickButton(dropDownList);
    }

    public void clickSideBarSecretaries() {
        super.clickButton(sideBarSecretaries);
    }

    public void clickLineListSecretaries() {
        super.clickButton(lineListSecretaries);
    }

    public void fillSearchFieldName(String SecretaryName) {
        super.fillField(searchInputField, SecretaryName);
    }

    public void clickSortButton() {
        super.clickButton(sortButton);
    }
}



    


