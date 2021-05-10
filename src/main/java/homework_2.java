import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class homework_2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.udemy.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement loginUdemy = driver.findElement(By.cssSelector("[data-purpose='header-login']"));
        loginUdemy.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement userName = driver.findElement(By.name("email"));
        WebElement password = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.id("submit-id-submit"));
        userName.sendKeys("nunemin@gmail.com");
        password.sendKeys("123456");
        if (loginButton.isDisplayed()){
            loginButton.click();
        }
            else {
            new WebDriverWait(driver, 2).until((ExpectedConditions.visibilityOfAllElementsLocatedBy((By.id("submit-id-submit")))));
        }
            loginButton.click();

            driver.quit();

    }
}
