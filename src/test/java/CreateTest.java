
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class CreateTest extends TestBase {


    @Test
    public void uploadAndDownload(){
        CreatePage createPage = new CreatePage();
        createPage.open();
        createPage.uploadPhoto();
        createPage.downloadPhoto();
        createPage.finalClick();
        assertTrue(createPage.popupDisplayed(), "Download failed!");

    }
}