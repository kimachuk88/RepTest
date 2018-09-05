package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SMSMessagingPage {

    public SMSMessagingPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "android.widget.TextView")
    public List<WebElement> getWarning;

    @FindBy(id = "com.example.android.apis:id/sms_enable_receiver")
    public WebElement getEnableSMSBroadcast;

    @FindBy(id = "com.example.android.apis:id/sms_send_message")
    public WebElement getSend;

    @FindBy(id = "com.example.android.apis:id/sms_content")
    public WebElement getMessageBody;

    @FindBy(id = "com.example.android.apis:id/sms_recipient")
    public WebElement getRecipient;

    @FindBy(id = "android:id/contentPanel")
    public List<WebElement> getMessage;

    //Actions

    public String getWarningMessageText(){

        return getWarning.get(1).getText();
    }
    public void clickEnableBrodcast() {

        getEnableSMSBroadcast.click();
    }

    public boolean isBroadcastEnabled() {

        return getEnableSMSBroadcast.getAttribute("checked").equals("true");
    }

    public void fillInRecipientField(String message) {

        getRecipient.sendKeys(message);
    }

    public void fillInMessageBodyField(String message) {

        getMessageBody.sendKeys(message);
    }

    public void clickSend() {
        getSend.click();
    }

    public String getMessageText() {

        return getMessage.get(0).getText();
    }
}