package pages.students;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import static constants.Locators.StudentsDetailsTab.*;

@Getter
public class StudentsDetailsPage extends BasePage {
    @FindBy(xpath = STUDENT_DETAILS_HEADER)
    private WebElement studentDetailsHeader;
    @FindBy(xpath = FIRST_NAME_FIELD)
    private WebElement detailsNameFirstName;
    @FindBy(xpath = LAST_NAME_FIELD)
    private WebElement detailsNameLastName;
    @FindBy(xpath = EMAIL_FIELD)
    private WebElement detailsEmailName;
    @FindBy(xpath = LIST_OF_GROUPS)
    private WebElement detailsGROUP;
    @FindBy(xpath = LIST_OF_LESSON)
    private WebElement detailsLesson;
    @FindBy(xpath = STUDENTS_DETAILS_ARROW_BUTTON)
    private WebElement detailsArrowButton;

    public StudentsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getStudentsDetailsHeader() {
        return studentDetailsHeader.getText();
    }

    public void clickArrowButton() {
        super.clickButton(detailsArrowButton);
    }
}

