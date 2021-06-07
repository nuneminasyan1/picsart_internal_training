
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

public class ChallengeTest {

    @Test
    public void qrTest(){
        ChallengePage challengePage = new ChallengePage("ircbadmintonbirdie");
        challengePage.clickParticipate();
        GetFreeAppDialog getFreeAppDialog = new GetFreeAppDialog();
        assertTrue(getFreeAppDialog.isQrVisible(), "QR was not displayed!");
    }

}