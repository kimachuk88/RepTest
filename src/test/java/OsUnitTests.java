import Pages.DialogWDefLightThemePage;
import Pages.MainMenuPage;
import Tools.ISearch;
import Tools.SearchElement;
import Tools.TestRunner;
import org.junit.*;


public class OsUnitTests extends TestRunner {

    MainMenuPage mainMenuPage = new MainMenuPage(driver);

    DialogWDefLightThemePage dialogWDefLightThemePage;


    @Test
    public void sendSMS() {
        mainMenuPage.clickOS()
                .clickSMSMessaging()
                .setRecipientName("fasf")
                .setMessageBody("dfadsf")
                .build();
        Assert.fail("hello, we failed");
    }
}
