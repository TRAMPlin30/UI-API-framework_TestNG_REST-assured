package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import properties.Drivers;
import steps.auth.AuthPageSteps;

public class BaseTest {
    protected WebDriver driver;
    protected AuthPageSteps authPageSteps;

    @BeforeSuite
    public void setUp() {
        driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        authPageSteps = new AuthPageSteps(driver);
    }

    @AfterClass
    protected void quitBrowser() {
        if (!(driver == null)) {driver.quit();}
    }
}
