package steps.secretaries;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.secretaries.SecretariesPage;
import steps.BasePageSteps;
import steps.helper.SecretariesHelper;

public class SecretariesPageSteps extends BasePageSteps {
    SecretariesPage secretariesPage;

    public SecretariesPageSteps(WebDriver driver) {
        super(driver);
        secretariesPage = new SecretariesPage(driver);
    }
    public SecretariesPageSteps clickSidebarSecretaries() {
        secretariesPage.clickSideBarSecretaries();
        return this;
    }
    public SecretariesPageSteps verifyOpenSecretaryPage() {
        Assert.assertEquals(secretariesPage.getHeaderSecretaries().getAttribute("textContent"), "Secretaries");
        return this;
    }
    public SecretariesPageSteps clickSortButton(){
        secretariesPage.clickSortButton();
        return this;
    }
    public SecretariesPageSteps verifySortName()  {
        Assert.assertNotEquals(SecretariesHelper.parseTableRowSorted(secretariesPage.nameList),secretariesPage.nameList);
        return this;
    }
    public SecretariesPageSteps verifySortSurname()  {
        Assert.assertNotEquals(SecretariesHelper.parseTableRowSorted(secretariesPage.surnameList),secretariesPage.surnameList);
        return this;
    }
    public SecretariesPageSteps verifySortEmail()  {
        Assert.assertNotEquals(SecretariesHelper.parseTableRowSorted(secretariesPage.emailList),secretariesPage.emailList);
        return this;
    }
    public SecretariesPageSteps clickLineListSecretaries() {
        secretariesPage.clickLineListSecretaries();
        return this;
    }

    public SecretariesPageSteps clickButtonEditIcon() {
        secretariesPage.clickEditIcon();
        return this;
    }

    public SecretariesPageSteps clickButtonSearchInputField() {
        secretariesPage.clickSearchInputField();
        return this;
    }
    public SecretariesPageSteps verifySearchFieldIsEmpty() {
        Assert.assertEquals(secretariesPage.getSearchInputField().getAttribute("defaultValue"), "");
        return this;
    }

    public SecretariesPageSteps clickButtonViewCardSecretaries() {
        secretariesPage.clickViewCardSecretaries();
        return this;
    }

    public SecretariesPageSteps clickButtonViewListSecretaries() {
        secretariesPage.clickViewListSecretaries();
        return this;
    }

    public SecretariesPageSteps clickButtonShowDisabledSwitcher() {
        secretariesPage.clickShowDisabledSwitcher();
        return this;
    }

    public SecretariesPageSteps clickButtonAddSecretary() {
        secretariesPage.clickAddSecretary();
        return this;
    }

    public SecretariesPageSteps clickButtonDropDownList() {
        secretariesPage.clickDropDownList();
        return this;
    }
}