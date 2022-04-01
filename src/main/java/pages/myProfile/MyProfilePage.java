package pages.myProfile;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

import static constants.Locators.MyProfileItems.*;
import static constants.Locators.MyProfilePage.*;

@Getter
public class MyProfilePage extends BasePage {
    @FindBy(xpath = MY_PROFILE_HEADER)
    private WebElement myProfileHeader;

    @FindBy(xpath = FIRST_NAME_FIELD)
    private WebElement firstNameField;

    @FindBy(xpath = LAST_NAME_FIELD)
    private WebElement lastNameField;

    @FindBy(xpath = EMAIL_FIELD)
    private WebElement emailField;

    @FindBy(xpath = USER_DATA)
    private List<WebElement> listOfUserData;

    @FindBy(xpath = CHANGE_PASSWORD_BUTTON)
    private WebElement changePasswordButton;

    @FindBy(xpath = EMAIL_ADDRESS)
    private WebElement emailAddress;
    @FindBy(xpath = MY_PROFILE_DROPDOWN_ITEM)
    private WebElement myProfileDropDown;
    @FindBy(xpath = MY_PROFILE_DROPDOWN_LOG_OUT)
    private WebElement logOut;



    public MyProfilePage(WebDriver driver) {
        super(driver);
    }

    public void clickChangePasswordButton() {
        changePasswordButton.click();
    }

    public String getLabel() {
        return myProfileHeader.getText();
    }

    public boolean verifyFirstNameField() {
        return firstNameField.isDisplayed();
    }

    public boolean verifyLastNameField() {
        return lastNameField.isDisplayed();
    }

    public boolean verifyEmailAddressField() {
        return emailField.isDisplayed();
    }

    public String verifyFirstNameFieldIsDisplayed() {
        return listOfUserData.get(0).getText();
    }

    public String verifyLastNameFieldIsDisplayed() {
        return listOfUserData.get(1).getText();
    }

    public String verifyEmailAddressFieldIsDisplayed() {
        return listOfUserData.get(2).getText();
    }

    public boolean verifyFirstNameFieldIsDisplayedCorrectly(String firstName) {
        return listOfUserData.get(0).getText().equals(firstName);
    }

    public boolean verifyLastNameFieldIsDisplayedCorrectly(String lastName) {
        return listOfUserData.get(1).getText().equals(lastName);
    }

    public boolean verifyEmailAddressFieldIsDisplayedCorrectly(String emailAddress) {
        return listOfUserData.get(2).getText().equals(emailAddress);
    }

    public boolean changePasswordButtonIsEnabled() {
        return changePasswordButton.isEnabled();
    }

    public ChangePasswordPage verifyChangePasswordButton() {
        changePasswordButton.click();
        return new ChangePasswordPage(driver);
    }

    public void clickDropdownProfile() {
        super.clickButton(myProfileDropDown);
    }

    public void clickLogOut() {
        super.clickButton(logOut);
    }

}
