import org.openqa.selenium.By;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {

    private final By usernameFieldLocation = By.name("username");
    private final By passwordFieldLocation = By.name("password");
    private final By loginButtonLocation = By.cssSelector("[data-test='headerAuth-signInBtn pa-uiLib-headerAuth-authBtn']");
    private final By signInButtonLocation = By.cssSelector("[class*='pa-uiLib-authentication-btn primary']");
    private final By avatarLocation = By.cssSelector(".pa-uiLib-headerProfileInfo-avatarBlock");

    public LoginPage() {
        open("https://picsart.com/");
    }

    @Override
    public String getUrl() {
        return BASE_URL;
    }

    public void clickLoginButton() {
        WebElement loginButton = find(loginButtonLocation);
        loginButton.click();
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(usernameFieldLocation));
        // click(loginButtonLocation);
    }

    public void typeUsername(String username) {
      /*
       WebElement usernameField = find(usernameFieldLocation);
        usernameField.sendKeys(username);
      */
        type(usernameFieldLocation, username);
    }

    public void typePassword(String password) {
        //  WebElement usernameField = find(passwordFieldLocation);
        //  usernameField.sendKeys(password);
        type(passwordFieldLocation, password);
    }

    public void clickSignInButton() {
        click(signInButtonLocation);

    }

    public boolean isAvatarDisplayed() {
        return find(avatarLocation).isDisplayed();
    }

    public boolean isUserLoggedIn() {
        WebElement avatarIcon = new WebDriverWait(driver, 20).until(ExpectedConditions.visibilityOfElementLocated(avatarLocation));
        return avatarIcon.isDisplayed();
    }

//    LoginPage loginPage = new LoginPage();
//    Cookie cookie = new Cookie("user_key", "0726cbd7-ab76-4160-93d7-94cfd924c184");
//    getDriver().manage().addCookie(cookie);
//    getDriver().navigate().refresh();
//    assertTrue(loginPage.isUserLoggedIn(), "user was not logged in");
}


