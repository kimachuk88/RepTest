package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class OSPage {

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
    public WebElement getSMSMessaging() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘SMS Messaging’)]");
    }

    public WebElement getTriggerSensors() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘TriggerSensors’)]");
    }

    //Actions
    public SMSMessagingPage clickSMSMessaging(){
        getSMSMessaging().click();
        return new SMSMessagingPage();
    }





}