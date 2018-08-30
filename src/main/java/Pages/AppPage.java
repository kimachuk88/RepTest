package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AppPage extends TestRunner {
    public AppPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

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

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    private WebElement getAlertDialogs;


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

    //Actions

    public AlertDialogsPage clickAlertDialogs() {
        getAlertDialogs.click();
        return new AlertDialogsPage(driver);
    }
}