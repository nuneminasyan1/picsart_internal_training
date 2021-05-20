import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class EditorPage extends BasePage {

    private static final By instagramStoryLocation = By.cssSelector("[data-test='insta-story']");
    private static final By fitIconLocation = By.cssSelector("#background-category");


    public EditorPage() {
        open(getUrl());
    }

    @Override
    public String getUrl() {
        return BASE_URL + "/create";
    }

    public void clickInstagramStory() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(instagramStoryLocation);
        Actions actions = new Actions(driver);
        actions.moveToElement(find(instagramStoryLocation)).click().build().perform();
    }
    public void clickFitIcon() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(fitIconLocation);
        click(fitIconLocation);
    }
}