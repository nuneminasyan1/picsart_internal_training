import org.openqa.selenium.By;

public class CreatePage extends BasePage {
    private By uploadButtonLocation = By.cssSelector("[class*='uploadButton'] input");
    private By downloadButtonLocation = By.id("download-button");
    private By finalDownloadLocation = By.cssSelector("[data-test='downloaded-button']");
    private By popupLocation = By.cssSelector("[class*='ReactModal__Content']");


    @Override
    public String getUrl() {
        return BASE_URL + "/create";
    }

    public void open() {
        open(getUrl());
    }

    public void uploadPhoto() {
//        WaitHelper.getInstance().waitForElementToBeDisplayed(uploadButtonLocation);
        type(uploadButtonLocation, "/Users/nuneminasyan/Downloads/Web_Photo_Editor.jpg");
    }

    public void downloadPhoto() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(downloadButtonLocation);
        click(downloadButtonLocation);
    }

    public void finalClick() {
        WaitHelper.getInstance().waitForElementToBeDisplayed(finalDownloadLocation);
        click(finalDownloadLocation);
    }
    public boolean popupDisplayed() {
        isDisplayed(popupLocation);
        return true;
    }
}
