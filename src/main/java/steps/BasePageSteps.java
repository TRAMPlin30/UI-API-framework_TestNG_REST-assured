package steps;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

import java.lang.reflect.InvocationTargetException;


public  class BasePageSteps extends BasePage {

    WebDriver driver;

    public BasePageSteps(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public <T> T redirectToPage(WebDriver driver, Class<T> type) {
        try {
            return type.getConstructor(WebDriver.class).newInstance(driver);
        } catch (InstantiationException |
                NoSuchMethodException |
                InvocationTargetException |
                SecurityException |
                IllegalAccessException |
                IllegalArgumentException e) {
            e.printStackTrace();
        }
        return null;
    }
}
