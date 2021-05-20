
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class Lesson3 {
    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/nuneminasyan/IdeaProjects/picsart_internal_training/src/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://picsart.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void firstTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.clickLoginButton();
        loginPage.typeUsername("smart_offer");
        loginPage.typePassword("Lusin86");
        loginPage.clickSignInButton();

        assertTrue(loginPage.isUserLoggedIn(), "user was not logged in");
    }
}