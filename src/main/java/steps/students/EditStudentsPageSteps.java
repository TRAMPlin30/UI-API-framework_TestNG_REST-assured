package steps.students;

import org.openqa.selenium.WebDriver;
import steps.BasePageSteps;

public class EditStudentsPageSteps extends BasePageSteps {
    EditStudentsPageSteps editStudentsPage;

    public EditStudentsPageSteps(WebDriver driver) {
        super(driver);
        editStudentsPage = new EditStudentsPageSteps(driver);
    }
}