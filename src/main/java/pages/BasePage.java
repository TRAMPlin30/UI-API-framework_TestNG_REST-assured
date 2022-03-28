package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static constants.Constants.IMPLISITLY_WAIT;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openURL(String url) {
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLISITLY_WAIT));
    }

    public void waitWebElementVisible(WebElement element, int time) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            e.printStackTrace();
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

}