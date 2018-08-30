package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class SMSMessagingPage {

    ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getWarning() {
        return Search.Id("WARNING: this demo can send actual text messages (one at a time), so be sure to test with the Android emulator or have a text messaging plan with your carrier.").getText();
    }

    public WebElement getEnableSMSBroadcast() {
        return Search.Id("com.example.android.apis:id/sms_enable_receiver");
    }

    public WebElement getSend() {
        return Search.Id("io.appium.android.apis:id/sms_send_message");
    }

    public WebElement getMessageBody() {
        return Search.Id("io.appium.android.apis:id/sms_content");
    }

    public WebElement getRecipient() {
        return Search.Id("io.appium.android.apis:id/sms_recipient");
    }

    //Actions

    public void fillInRecipientField(String message) {
        getRecipient().sendKeys(message);
        fillInMessageBodyField(message);
    }

    public void fillInMessageBodyField(String message) {
        getMessageBody().sendKeys(message);
    }

    public SMSSentPage clickSend() {
        getSend().click();
        return new SMSSentPage();
    }

}