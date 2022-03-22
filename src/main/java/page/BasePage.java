package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constants.IMPLISITLY_WAIT;
import static constants.Locators.PaginationItems.*;

public abstract class BasePage extends Base{

    @FindBy(xpath = BUTTON_PREVIOUS_PAGE )
    public WebElement buttonPreviousPage;
    @FindBy(xpath = BUTTON_NEXT_PAGE )
    public WebElement buttonNextPage;

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void openBaseURL() {
        String url = "http://localhost:8080/auth";
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLISITLY_WAIT));
    }

    public void waitWebElementVisible(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
        } catch (Exception e) {
        }
    }

    public void fillField (WebElement field, String value) {
        if (field.getAttribute("disabled")== null
                || field.getAttribute("readOnly") == null) {
            field.click();
            field.clear();
            field.sendKeys(value);
        } else {
            System.out.println("Field: " + field + " is not active!!!");
        }
    }

    public void clickButton (WebElement button) {
        if (button.isEnabled()) {
            button.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLISITLY_WAIT));
        } else {
            System.out.println("Button: " + button + " is not active!!!");
        }


    }

    public void clickButtonPreviousPage() {
        buttonPreviousPage.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLISITLY_WAIT));
    }

    public void clickButtonNextPage() {
        buttonNextPage.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLISITLY_WAIT));
    }
}