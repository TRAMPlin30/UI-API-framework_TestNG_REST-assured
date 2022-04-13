package steps.secretaries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.secretaries.SecretariesDetailsPage;
import steps.BasePageSteps;

public class SecretariesDetailsPageSteps extends BasePageSteps {
    SecretariesDetailsPage secretariesDetailsPage;

    public SecretariesDetailsPageSteps(WebDriver driver) {
        super(driver);
        secretariesDetailsPage = new SecretariesDetailsPage(driver);
    }

    public SecretariesDetailsPageSteps verifyNameTab() {
        Assert.assertEquals(secretariesDetailsPage.getPageTitle().getText(), "Secretary's details");
        return this;
    }

    public SecretariesDetailsPageSteps verifyFirstNameIsDisplayed() {
        Assert.assertTrue(secretariesDetailsPage.getFirstNameField().isDisplayed());
        return this;
    }

    public SecretariesDetailsPageSteps verifyLastNameIsDisplayed() {
        Assert.assertTrue(secretariesDetailsPage.getLastNameField().isDisplayed());
        return this;
    }

    public SecretariesDetailsPageSteps verifyEmailIsDisplayed() {
        Assert.assertTrue(secretariesDetailsPage.getEmailField().isDisplayed());
        return this;
    }

    public SecretariesDetailsPageSteps clickArrowButton() {
        secretariesDetailsPage.clickArrowButton();
        return this;
    }

    public SecretariesDetailsPageSteps clickOnSecretariesTab() {
        secretariesDetailsPage.clickPageTitle();
        return this;
    }
}
