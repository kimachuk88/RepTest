package Tools;

import Pages.*;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.lang.ref.Reference;
import java.net.MalformedURLException;
import java.net.URL;

public class TestRunner {

    final String APP_URL = "D:\\ProjectToTestTwo\\ApiDemos.apk";
    final String APPIUM_URL = "http://127.0.0.1:4723/wd/hub";
    final int TIME_OUT = 15;
    protected MainMenuPage mainMenuPage;
    protected OSPage osPage;
    protected AppPage appPage;
    protected SMSMessagingPage smsMessagingPage;
    protected PreferencePage preferencePage;
    protected SwitchPage switchPage;
    protected AlertDialogsPage alertDialogsPage;
    protected ListDialogPage listDialogPage;
    protected CommandOnePage commandOnePage;
    protected CommandTwoPage commandTwoPage;
    protected CommandThreePage commandThreePage;
    protected CommandFourPage commandFourPage;
    protected DialogWLongMessagePage dialogWLongMessagePage;
    protected DialogWULongMessagePage dialogWULongMessagePage;
    protected DialogWMessagePage dialogWMessagePage;
    protected DialogWTraditThemePage dialogWTraditThemePage;
    protected DialogWDefLightThemePage dialogWDefLightThemePage;
    protected DialogWDefThemePage dialogWDefThemePage;
    protected DialogWHoloThemePage dialogWHoloThemePage;




    DesiredCapabilities caps = new DesiredCapabilities();

    public AndroidDriver driver;


    @Before

    public void setCaps() {
        //this.caps = caps;
        caps.setCapability("app", APP_URL);
        caps.setCapability("deviceName", "emulator-5554");
        caps.setCapability("udid", "emulator-5554");
        caps.setCapability("PlatformVersion", "6.0.0");
        caps.setCapability("platformName", "Android");
        caps.setCapability("fullReset", false);
        {
            try {
                driver = new AndroidDriver(new URL(APPIUM_URL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        alertDialogsPage = new AlertDialogsPage(driver);
        appPage = new AppPage(driver);
        dialogWULongMessagePage = new DialogWULongMessagePage(driver);
        dialogWMessagePage = new DialogWMessagePage(driver);
        dialogWLongMessagePage = new DialogWLongMessagePage(driver);
        dialogWDefLightThemePage = new DialogWDefLightThemePage(driver);
        dialogWHoloThemePage = new DialogWHoloThemePage(driver);
        dialogWTraditThemePage = new DialogWTraditThemePage(driver);
        listDialogPage = new ListDialogPage(driver);
        mainMenuPage = new MainMenuPage(driver);
        osPage = new OSPage(driver);
        preferencePage = new PreferencePage(driver);
        smsMessagingPage = new SMSMessagingPage(driver);
        switchPage = new SwitchPage(driver);
        commandOnePage = new CommandOnePage(driver);
    }

    @After
    public void Teardown() {
        driver.quit();
        System.out.println("I'm doing something to tidy up after the test");
    }
}