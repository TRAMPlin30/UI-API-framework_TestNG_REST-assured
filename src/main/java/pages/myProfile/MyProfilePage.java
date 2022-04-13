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

    @FindBy(xpath = USER_DATA)
    private static List<WebElement> listOfUserData;

    @FindBy(xpath = CHANGE_PASSWORD_BUTTON)
    private WebElement changePasswordButton;

    @FindBy(xpath = EMAIL_ADDRESS)
    private WebElement emailAddress;

    @FindBy(xpath = MY_PROFILE_DROPDOWN_ITEM)
    private WebElement myProfileDropdownItem;

    @FindBy(xpath = MY_PROFILE_DROPDOWN_LOG_OUT)
    private WebElement logOut;


    public MyProfilePage(WebDriver driver) {
        super(driver);
    }

    public String getFirstNameFieldContent() {
        return listOfUserData.get(0).getText();
    }

    public String getLastNameFieldContent() {
        return listOfUserData.get(1).getText();
    }

    public String getEmailAddressFieldContent() {
        return listOfUserData.get(2).getText();
    }

    public void clickChangePasswordButton() {
        super.clickButton(changePasswordButton);
    }

    public void clickDropdownProfile() {
        super.clickButton(myProfileDropdownItem);
    }

    public void clickLogOut() {
        super.clickButton(logOut);
    }
}