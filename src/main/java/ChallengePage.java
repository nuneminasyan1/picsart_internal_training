import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static setup.DriverSetup.getDriver;

public class ChallengePage extends BasePage {

    WaitHelper waitHelper = new WaitHelper();


    public final By discoverLocation = By.cssSelector("[data-test='headerNavigation-navigationListItem-Discover']");
    public final By challengesLocation = By.cssSelector("[data-test='subNavigation-groupList'] [href='/challenges']");
    public final By activeChallengeLocation = By.cssSelector(".grid-cards .card");
    public final By participateButtonLocation = By.cssSelector("[data-js-get-the-app-popup-source='challenge-landing']");
    public final By qrLocation = By.cssSelector("[class='qrcode'] [alt='Get the app for apple']");



    public void goToDiscover() {
        waitHelper.waitForElementToBeDisplayed(discoverLocation);
        List<WebElement> element = getDriver().findElements(discoverLocation);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element.get(element.size() - 1)).click().build().perform();
    }

    public void clickChallenge() {
        waitHelper.waitForElementToBeDisplayed(challengesLocation);
        click(challengesLocation);
    }

    public void enterChallenge() {
        waitHelper.waitForElementToBeDisplayed(activeChallengeLocation);
        click(findAll(activeChallengeLocation).get(1));
    }

    public void participateClick(){
        waitHelper.waitForElementToBeDisplayed(participateButtonLocation);
        click(participateButtonLocation);
    }

    public boolean isQRDisplayed() {
        return isDisplayed(qrLocation);
    }




    @Override
    public String getUrl() {
        return BASE_URL;
    }

}
