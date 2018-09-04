import Tools.TestRunner;
import org.junit.*;

public class OsUnitTests extends TestRunner {

    @Test
    public void checkValidWarningMessage() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        String expected = "WARNING: this demo can send actual text messages (one at a time), so be sure to test with the Android emulator or have a text messaging plan with your carrier.";
        String actual = smsMessagingPage.getWarningMessageText();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sendSMSWithValidFields() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.fillInRecipientField("recipient field");
        smsMessagingPage.fillInMessageBodyField("message body field");
        smsMessagingPage.clickSend();

        String realMessage = smsMessagingPage.getMessageText();
        String expectedMessage = "You have successfully sent SMS";
        Assert.assertEquals(realMessage, expectedMessage);
    }

    @Test
    public void sendSMSWithInvalidRecipient() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.fillInRecipientField("");
        smsMessagingPage.fillInMessageBodyField("message body field");
        smsMessagingPage.clickSend();
        int messageSize = smsMessagingPage.getMessage.size();
        Assert.assertEquals(messageSize, 0);
    }

    @Test
    public void sendSMSWithInvalidMessage() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        smsMessagingPage.fillInRecipientField("recipient field");
        smsMessagingPage.fillInMessageBodyField("");
        smsMessagingPage.clickSend();
        int messageSize = smsMessagingPage.getMessage.size();
        Assert.assertEquals(messageSize, 0);
    }

    @Test
    public void sendSMSWithBroadcastEnabled() {
        mainMenuPage.clickOS();
        osPage.clickSMSMessaging();
        if (!smsMessagingPage.isBroadcastEnabled()) {
            smsMessagingPage.clickEnableBrodcast();
        }
        smsMessagingPage.fillInRecipientField("recipient field");
        smsMessagingPage.fillInMessageBodyField("message body field");
        smsMessagingPage.clickSend();

        String realMessage = smsMessagingPage.getMessageText();
        String expectedMessage = "You have successfully sent a SMS";
        Assert.assertEquals(realMessage, expectedMessage);
    }
}
