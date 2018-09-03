package Pages;

import Tools.ISearch;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SMSMessagingPage {

    public SMSMessagingPage(AndroidDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "WARNING: this demo can send actual text messages (one at a time), so be sure to test with the Android emulator or have a text messaging plan with your carrier.")
    public WebElement getWarning;

    @FindBy(id = "com.example.android.apis:id/sms_enable_receiver")
    public WebElement getEnableSMSBroadcast;

    @FindBy(id = "com.example.android.apis:id/sms_send_message")
    public WebElement getSend;

    @FindBy(id = "com.example.android.apis:id/sms_content")
    public WebElement getMessageBody;

    @FindBy(id = "com.example.android.apis:id/sms_recipient")
    public WebElement getRecipient;

    @FindBy(id = "android:id/contentPanel")
    public WebElement getMessage;

    //Actions

    public void clickEnableBrodcast(){
        getEnableSMSBroadcast.click();
    }

    public void fillInRecipientField(String message) {
        getRecipient.sendKeys(message);
    }

    public void fillInMessageBodyField(String message) {
        getMessageBody.sendKeys(message);
    }

    public SMSSentPage clickSend() {
        getSend.click();
        return new SMSSentPage();
    }

    public String getMessageText(){
        return getMessage.getText();
    }
}