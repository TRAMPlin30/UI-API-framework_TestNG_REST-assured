package steps.students;

import org.openqa.selenium.WebDriver;
import pages.students.StudentsDetailsPage;
import steps.BasePageSteps;

public class StudentsDetailsPageSteps extends BasePageSteps {
    StudentsDetailsPage studentsDetailsPage;

    public StudentsDetailsPageSteps(WebDriver driver) {
        super(driver);
        studentsDetailsPage = new StudentsDetailsPage(driver);
    }
}
