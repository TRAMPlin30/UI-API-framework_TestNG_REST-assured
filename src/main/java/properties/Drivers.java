package properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class Drivers {

    public enum Driver {
        CHROMEDRIVER("src/main/resources/chromedriver.exe", "webdriver.chrome.driver"),
        FIREFOXDRIVER("src/main/resources/geckodriver.exe", "webdriver.gecko.driver"),
        OPERADRIVER("src/main/resources/operadriver.exe", "webdriver.opera.driver");
        private final String PATHtoDRIVER;
        private final String NAMEofDRIVER;
        Driver(String PATHtoDRIVER, String NAMEofDRIVER) {
            this.PATHtoDRIVER = PATHtoDRIVER;
            this.NAMEofDRIVER = NAMEofDRIVER;
        }
        public String getPATHtoDRIVER() {
            return PATHtoDRIVER;
        }
        public String getNAMEofDRIVER() {
            return NAMEofDRIVER;
        }
    }

    public static WebDriver getDriver(Driver driverKey) {
        String driverName = driverKey.getNAMEofDRIVER();
        String driverPath = driverKey.getPATHtoDRIVER();
        WebDriver driver = null;
        switch (driverKey) {
            case CHROMEDRIVER:
                System.setProperty(driverName, driverPath);
                driver = new ChromeDriver();
                break;
            case FIREFOXDRIVER:
                System.setProperty(driverName, driverPath);
                driver = new FirefoxDriver();
                break;
            case OPERADRIVER:
                System.setProperty(driverName, driverPath);
                driver = new OperaDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;
    }
}
