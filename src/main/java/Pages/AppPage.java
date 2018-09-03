package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AppPage extends TestRunner {

    //Init AppPage

    public AppPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map AppPage buttons

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Action Bar’)]")
    private WebElement getActionBar;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Activity’)]")
    private WebElement getActivity;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Alarm’)]")
    private WebElement getAlarm;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    private WebElement getAlertDialogs;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Device Admin’)]")
    private WebElement getDeviceAdmin;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Fragment’)]")
    private WebElement getFragment;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Launcher Shortcuts’)]")
    private WebElement getLauncherShortcuts;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Loader’)]")
    private WebElement getLoader;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Menu’)]")
    private WebElement Menu;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Notification’)]")
    private WebElement getNotification;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Print’)]")
    private WebElement getPrint;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Search’)]")
    private WebElement getSearchElement;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Service’)]")
    private WebElement getService;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Text-To-Speech’)]")
    private WebElement getTextToSpeech;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘Voice Recognition’)]")
    private WebElement getVoiceRecognition;


    //Actions

    public AlertDialogsPage clickAlertDialogs() {
        getAlertDialogs.click();
        return new AlertDialogsPage(driver);
    }
}