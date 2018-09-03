import Pages.DialogWDefLightThemePage;
import Pages.MainMenuPage;
import Tools.ISearch;
import Tools.SearchElement;
import Tools.TestRunner;
import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Instant;


public class OsUnitTests extends TestRunner {

    @Test
    public void sendSMSwithValidFields() throws Exception{
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.fillInRecipientField("recipient field");
        smsMessagingPage.fillInMessageBodyField("message body field");
        smsMessagingPage.clickSend();

        //WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait.until(ExpectedConditions.alertIsPresent());
        //Thread.sleep(3000);
        //Alert alert = driver.switchTo().alert();
        //alert.accept();
        String mm = smsMessagingPage.getMessageText();

    }
    @Test
    public void sendSMSwithInvalidRecipient() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.fillInRecipientField("");
        smsMessagingPage.fillInMessageBodyField("message body field");
        smsMessagingPage.clickSend();
    }
    @Test
    public void sendSMSwithInvalidMessage() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.fillInRecipientField("recipient field");
        smsMessagingPage.fillInMessageBodyField("");
        smsMessagingPage.clickSend();
    }

    @Test
    public void sendSMSwithBroadcastEnabled() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.clickEnableBrodcast();
        smsMessagingPage.fillInRecipientField("recipient field");
        smsMessagingPage.fillInMessageBodyField("message body field");
        smsMessagingPage.clickSend();
    }
}
