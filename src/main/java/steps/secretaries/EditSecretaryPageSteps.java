package steps.secretaries;

import org.openqa.selenium.WebDriver;
import page.secretaries.EditSecretaryPage;

public class EditSecretaryPageSteps {
    EditSecretaryPage editSecretaryPage;

    public EditSecretaryPageSteps(WebDriver driver) {
        editSecretaryPage = new EditSecretaryPage(driver);

    }


}
