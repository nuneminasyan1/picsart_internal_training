
import com.google.gson.JsonObject;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import static setup.DriverSetup.getDriver;


public class TestBase {

    @BeforeMethod
    public void setup() throws IOException {
        JsonObject user = ApiHelper.createUser();
        String key = user.get("response").getAsJsonObject().get("key").toString();



    }

   @AfterMethod
   public void tearDown() {
        getDriver().quit();
    }


}
