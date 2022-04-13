package pages.assignment;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Constants.ELEMENT_WAIT;
import static constants.Locators.PaginationItems.*;
import static constants.Locators.SideBarItems.SIDEBAR_ITEM_UNASSIGNED;
import static constants.Locators.UnassignedUsersPage.SUCCESS_MESSAGE;

@Getter
public class UnassignedUsersPage extends BasePage {

    @FindBy(xpath = SIDEBAR_ITEM_UNASSIGNED)
    public WebElement sideBarUnassigned;

    @FindBy(xpath = DROPDOWN_ROWS)
    public WebElement dropDownList;

    @FindBy(xpath = DROPDOWN_ROWS_ITEM_99)
    public WebElement dropDownItem99;

    @FindBy(xpath = SUCCESS_MESSAGE)
    @CacheLookup
    public WebElement messageSuccessfully;

    String chooseRoleStudent;
    String chooseRoleMentor;
    String chooseRoleSecretary;
    String rowButtonLocation;

    public UnassignedUsersPage(WebDriver driver) {
        super(driver);
        this.chooseRoleStudent = "//tr[td//text()[contains(., '%s')]]//select/option[contains(text(), 'student')]";
        this.chooseRoleMentor = "//tr[td//text()[contains(., '%s')]]//select/option[contains(text(), 'mentor')]";
        this.chooseRoleSecretary = "//tr[td//text()[contains(., '%s')]]//select/option[contains(text(), 'secretary')]";
        this.rowButtonLocation = "//tr[td//text()[contains(., '%s')]]//button";
    }

    public void sideBarUnassignedClick() {
        super.waitWebElementVisible(sideBarUnassigned, ELEMENT_WAIT);
        super.clickButton(sideBarUnassigned);
    }

    public void clickForAllElements() {
        super.waitWebElementVisible(dropDownList, ELEMENT_WAIT);
        dropDownList.click();
        dropDownItem99.click();
    }

    public void chooseRoleStudent(WebDriver driver, String email) {
        String xpathTo = String.format(chooseRoleStudent, email);
        WebElement student = driver.findElement(By.xpath(xpathTo));
        clickButton(student);
    }

    public void chooseRoleMentor(WebDriver driver, String email) {
        String xpathTo = String.format(chooseRoleMentor, email);
        WebElement mentor = driver.findElement(By.xpath(xpathTo));
        clickButton(mentor);
    }

    public void chooseRoleSecretary(WebDriver driver, String email) {
        String xpathTo = String.format(chooseRoleSecretary, email);
        WebElement secretary = driver.findElement(By.xpath(xpathTo));
        clickButton(secretary);
    }

    public void buttonAddRole(WebDriver driver, String email) {
        String xpathTo = String.format(rowButtonLocation, email);
        WebElement addRoleButton = driver.findElement(By.xpath(xpathTo));
        clickButton(addRoleButton);
    }
}
