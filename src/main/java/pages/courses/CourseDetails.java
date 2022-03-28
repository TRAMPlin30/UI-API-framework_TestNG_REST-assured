package page.courses;

import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import page.BasePage;

import static constants.Locators.CourseDetails.*;

public class CourseDetails extends BasePage {

    @FindBy (xpath = TITTLE_BUTTON_XPATH)
    private WebElement tittleButton;
    @FindBy (xpath = ARROW_LEFT_BUTTON_XPATH)
    private WebElement arrowLeftButton;
    @FindBy (xpath = COURSE_DETAILS_TAB_XPATH)
    private WebElement courseDetailsTab;

    public CourseDetails(WebDriver driver) {
        super(driver);
    }

    public CourseDetails clickTittleButton() {
        tittleButton.click(); //clickButton method
        return this;
    }

    public CourseDetails clickArrowLeftButton() {
        arrowLeftButton.click();
        return this;
    }

    public CourseDetails clickCourseDetailsTab() {
        courseDetailsTab.click();
        return this;
    }

}
