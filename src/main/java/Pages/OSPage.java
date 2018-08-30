package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OSPage extends TestRunner {
    public OSPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getMMSMessaging() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘MMS Messaging’)]");
    }

    public WebElement getMorseCode() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Morse Code’)]");
    }

    public WebElement getRotationVector() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Rotation Vector’)]");
    }
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    private WebElement getSMSMessaging;

    public WebElement getTriggerSensors() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘TriggerSensors’)]");
    }

    //Actions
    public SMSMessagingPage clickSMSMessaging(){
        getSMSMessaging.click();
        return new SMSMessagingPage();
    }





}