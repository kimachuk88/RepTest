package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OSPage {

    //Initialize OSPage
    public OSPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map OSPage buttons

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text=‘MMS Messaging’]")
    private WebElement getMMSMessaging;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text=‘Morse Code’]")
    private WebElement getMorseCode;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text=‘Rotation Vector’]")
    private WebElement getRotationVector;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    private WebElement getSMSMessaging;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text=‘TriggerSensors’]")
    private WebElement getTriggerSensors;

    //Actions

    public SMSMessagingPage clickSMSMessaging(){
        getSMSMessaging.click();
        return new SMSMessagingPage();
    }





}