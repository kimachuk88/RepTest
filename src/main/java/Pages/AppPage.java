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


    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Action Bar']")
    private WebElement getActionBar;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Activity']")
    private WebElement getActivity;

    @FindBy(xpath = "//*[@package='com.example.android.apis' and @class='android.widget.TextView' and @text='Alarm']")
    private WebElement getAlarm;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[4]")
    //@FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Alert Dialogs'][4]")
    private WebElement getAlertDialogs;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Device Admin']")
    private WebElement getDeviceAdmin;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Fragment']")
    private WebElement getFragment;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Launcher Shortcuts']")
    private WebElement getLauncherShortcuts;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Loader']")
    private WebElement getLoader;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Menu']")
    private WebElement Menu;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Notification']")
    private WebElement getNotification;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Print']")
    private WebElement getPrint;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Search']")
    private WebElement getSearchElement;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Service']")
    private WebElement getService;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Text-To-Speech']")
    private WebElement getTextToSpeech;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Voice Recognition']")
    private WebElement getVoiceRecognition;


    //Actions

    public AlertDialogsPage clickAlertDialogs() {
        getAlertDialogs.click();
        return new AlertDialogsPage(driver);
    }
}