import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");

        WebDriver driver = new ChromeDriver();
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://picsart.com/");

        WebElement logInButton = driver.findElement(By.cssSelector("[data-test='headerAuth-signInBtn pa-uiLib-headerAuth-authBtn']"));
        logInButton.click();
        new WebDriverWait(driver, 2).until((ExpectedConditions.visibilityOfAllElementsLocatedBy((By.name("username")))));
        // Thread.sleep(1000);
        driver.findElement(By.name("username")).sendKeys("napo111");
        driver.findElement(By.name("password")).sendKeys("aa12345");
        WebElement signInButton = driver.findElement(By.cssSelector(".pa-uiLib-authentication-signIn"));
        signInButton.click();

        driver.quit();

    }
}
