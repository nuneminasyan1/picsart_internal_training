
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.DriverSetup;

import static setup.DriverSetup.getDriver;


public class ImageBrowserPage extends BasePage {

    @FindBy(css = ".actions-section .notifier-hover-toggle .like")
    private WebElement likeIcon;

    public void open(){

    }

    public ImageBrowserPage (String imageID) {
        open(BASE_URL + "/i/" + imageID);
        PageFactory.initElements(DriverSetup.getDriver(), this);
    }
    public void clickOnLikeIcon() {
        WaitHelper.getInstance().waitForElementToBeDisplayed((By) likeIcon);
        click(likeIcon);
    }
    public void clickLike() {
        click(likeIcon);
    }

    @Override
    public String getUrl() {
        return null;
    }




}