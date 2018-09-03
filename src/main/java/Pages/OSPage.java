package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OSPage extends TestRunner {

    //Initialize OSPage
    public OSPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map OSPage buttons

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘MMS Messaging’)]")
    private WebElement getMMSMessaging;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Morse Code’)]")
    private WebElement getMorseCode;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Rotation Vector’)]")
    private WebElement getRotationVector;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    private WebElement getSMSMessaging;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘TriggerSensors’)]")
    private WebElement getTriggerSensors;

    //Actions

    public SMSMessagingPage clickSMSMessaging(){
        getSMSMessaging.click();
        return new SMSMessagingPage(driver);
    }





}