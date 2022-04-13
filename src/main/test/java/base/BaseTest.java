package base;

import entities.User;
import entities.Users;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import properties.Drivers;
import steps.auth.AuthPageSteps;

public class BaseTest {
    protected WebDriver driver;
    protected AuthPageSteps authPageSteps;
    protected User user;
    protected Users users;

    @Parameters({"Role"})
    @BeforeClass
    public void setUp(String role) {
        driver = Drivers.getDriver(Drivers.Driver.CHROMEDRIVER_MAC);
        user = User.createUser(role);
        users = Users.createUser(role);
        authPageSteps = new AuthPageSteps(driver);
    }

    @AfterClass
    protected void quitBrowser() {
        if (!(driver == null)) {driver.quit();}
    }
}
