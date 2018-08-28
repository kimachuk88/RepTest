package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;


public class AppPage {

    protected ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getActionBar() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Action Bar’)]");
    }

    public WebElement getActivity() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Activity’)]");
    }

    public WebElement getAlarm() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Alarm’)]");
    }

    public WebElement getAlertsDialogs() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Alert Dialogs’)]");
    }

    public AlertDialogsPage clickAlertDialogs() {
        getAlertsDialogs().click();
        return new AlertDialogsPage();
    }

    public WebElement getDeviceAdmin() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Device Admin’)]");
    }

    public WebElement getFragment() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Fragment’)]");
    }

    public WebElement getLauncherShortcuts() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Launcher Shortcuts’)]");
    }

    public WebElement getLoader() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Loader’)]");
    }

    public WebElement Menu() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Menu’)]");
    }

    public WebElement getNotification() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Notification’)]");
    }

    public WebElement getPrint() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Print’)]");
    }

    public WebElement getSearchElement() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Search’)]");
    }

    public WebElement getService() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Service’)]");
    }

    public WebElement getTextToSpeech() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Text-To-Speech’)]");
    }

    public WebElement getVoiceRecognition() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Voice Recognition’)]");
    }

}