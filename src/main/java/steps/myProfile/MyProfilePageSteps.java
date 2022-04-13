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

    public MyProfilePageSteps verifyEmailAddressFieldIsDisplayedCorrectly(String email) {
        Assert.assertEquals(myProfilePage.getEmailAddressFieldContent(), email);
        return this;
    }

    public MyProfilePageSteps verifyFirstNameFieldIsDisplayedCorrectly(String firstName) {
        Assert.assertEquals(myProfilePage.getFirstNameFieldContent(), firstName);
        return this;
    }

    public MyProfilePageSteps verifyLastNameFieldIsDisplayedCorrectly(String lastName) {
        Assert.assertEquals(myProfilePage.getLastNameFieldContent(), lastName);
        return this;
    }

    public ChangePasswordPageSteps clickChangePasswordButton(WebDriver driver) {
        myProfilePage.clickChangePasswordButton();
        return new ChangePasswordPageSteps(driver);
    }

    public MyProfilePageSteps clickDropdownMenu() {
        myProfilePage.clickDropdownProfile();
        return this;
    }

    public <T> T clickLogOut(WebDriver driver, Class<T> type) {
        myProfilePage.clickLogOut();
        return super.redirectToPage(driver, type);
    }

    public MyProfilePageSteps checkThatUserLoggedByEmail(String email) {
        Assert.assertEquals(myProfilePage.getEmailAddressFieldContent(), email);
        return this;
    }
}