package steps.secretaries;

import org.openqa.selenium.WebDriver;
import page.secretaries.SecretariesPage;


public class SecretariesPageSteps extends SecretariesPage {
    SecretariesPage secretariesPage;

    public SecretariesPageSteps(WebDriver driver) {
        super(driver);
        secretariesPage = new SecretariesPage(driver);
    }


    public EditSecretaryPageSteps clickButtonEditSecretaries(WebDriver driver) {
        secretariesPage.clickEditIcon();
        return new EditSecretaryPageSteps(driver);
    }
    /*public SecretariesPage inputSearchSecretary(String nameSurName) {
        fillField(searchInputField, "r");   //Robert Jones
        fillField(searchInputField, nameSurName);
        return this;
    }*/





    /* public UnassignedUsersPage clickAddSecretaryButton() {
        clickElement(addSecretaryButton);
        return new UnassignedUsersPage(driver);
    }*/
/* public SecretariesPageSteps verifyOpenSecretaryPage() {
        Assert.assertEquals(secretariesPage.getheaderSecretaries().getAttribute("textContent"), "Secretaries");
        return this;
    }*/

}



