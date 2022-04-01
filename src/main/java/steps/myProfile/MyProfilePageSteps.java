package steps.myProfile;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.myProfile.MyProfilePage;
import steps.BasePageSteps;

public class MyProfilePageSteps extends BasePageSteps {

    MyProfilePage myProfilePage;

    public MyProfilePageSteps(WebDriver driver) {
        super(driver);
        myProfilePage = new MyProfilePage(driver);
    }

    public MyProfilePageSteps checkThatUserLogged(String email) {
        Assert.assertEquals(myProfilePage.getEmailAddress().getAttribute("textContent"), email);
        return this;
    } // Added by Trubachov

    public MyProfilePageSteps clickDropdownProfile() {
        myProfilePage.clickDropdownProfile();
        return this;
    } // Added by Trubachov

    public <T> T clickLogOut(WebDriver driver, Class<T> type) {
        myProfilePage.clickLogOut();
        return super.redirectToPage(driver, type);
    } // Added by Trubachov


}
