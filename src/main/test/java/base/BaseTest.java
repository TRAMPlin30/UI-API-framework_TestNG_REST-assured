package base;

import entities.User;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import properties.Drivers;
import steps.auth.AuthPageSteps;

public class BaseTest {
    protected WebDriver driver;
    protected AuthPageSteps authPageSteps;
    protected User user;

    @Parameters({"Role"})
    @BeforeSuite
    public void setUp(String role) {
        driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER);
        user = User.createUser(role);
        authPageSteps = new AuthPageSteps(driver);
    }

    @AfterClass
    protected void quitBrowser() {
        if (!(driver == null)) {driver.quit();}
    }
}
