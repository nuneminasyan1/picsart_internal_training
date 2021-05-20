package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
    public static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "/Users/nuneminasyan/IdeaProjects/picsart_internal_training/src/chromedriver");
            driver = new ChromeDriver();
        }
        return driver;

    }
}