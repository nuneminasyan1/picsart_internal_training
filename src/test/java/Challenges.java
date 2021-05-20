import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static setup.DriverSetup.getDriver;

public class Challenges {

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        LoginPage loginPage = new LoginPage();
        Cookie cookie = new Cookie("user_key", "0726cbd7-ab76-4160-93d7-94cfd924c184");
        getDriver().manage().addCookie(cookie);
        getDriver().navigate().refresh();
        assertTrue(loginPage.isUserLoggedIn(), "user was not logged in");
    }

    @AfterMethod
    public void tearDown() {
        getDriver().quit();
    }

    @Test
    public void testChallenges() {
        ChallengePage challengePage = new ChallengePage();
        challengePage.goToDiscover();
        challengePage.clickChallenge();
        challengePage.enterChallenge();
        challengePage.participateClick();
        assertTrue(challengePage.isQRDisplayed(), "participation is failed");



    }


}
