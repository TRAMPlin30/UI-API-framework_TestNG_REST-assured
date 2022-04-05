package steps.myProfile;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.myProfile.MyProfilePage;
import steps.BasePageSteps;

import static constants.Constants.ELEMENT_WAIT;

public class MyProfilePageSteps extends BasePageSteps {

    MyProfilePage myProfilePage;

    public MyProfilePageSteps(WebDriver driver) {
        super(driver);
        myProfilePage = new MyProfilePage(driver);
    }

    public MyProfilePageSteps checkThatUserLoggedByEmail(String email) {
        Assert.assertEquals(myProfilePage.getEmailAddress().getAttribute("textContent"), email);
        return this;
    } // Added by Trubachov

    public MyProfilePageSteps clickDropdownProfile() {
        super.waitWebElementVisible(myProfilePage.getMyProfileDropDown(), ELEMENT_WAIT);
        myProfilePage.clickDropdownProfile();
        return this;
    } // Added by Trubachov

    public <T> T clickLogOut(WebDriver driver, Class<T> type) {
        myProfilePage.clickLogOut();
        return super.redirectToPage(driver, type);
    } // Added by Trubachov


}
