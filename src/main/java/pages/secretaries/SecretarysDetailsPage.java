package pages.secretaries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.SecretaryDetails.*;


public class SecretarysDetailsPage extends BasePage {

    public SecretarysDetailsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = SECRETARY_DETAILS_TITLE)
    protected WebElement pageTitle;
    @FindBy(tagName = SECRETARY_DETAILS_ARROW_BUTTON)
    protected WebElement arrowButton;
    @FindBy(xpath = SECRETARY_DETAILS_FIRST_NAME)
    protected WebElement firstName;
    @FindBy(xpath = SECRETARY_DETAILS_LAST_NAME)
    protected WebElement lastName;
    @FindBy(xpath = SECRETARY_DETAILS_EMAIL)
    protected WebElement email;

    public void  clickpageTitle(){

        super.clickButton(pageTitle);
    }
    public void clickarrowButton() {
        super.clickButton(arrowButton);
    }





    /*public void clickfirstName() {
        super.clickButton(firstName);
    }
    public void clicklastName() {
        super.clickButton(lastName);
    }
    public void clickemail() {
        super.clickButton(email);
    }*/
}
