package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage extends TestRunner {


    public MainMenuPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]")
    private WebElement getApp;

    @FindBy(how = How.XPATH, using = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]")
    private WebElement getOS;

    @FindBy(how = How.XPATH, using = "//android.widget.TextView[contains(text(),‘Preference’)]")
    private WebElement getPreference;

    //Actions

    public AppPage clickApp() {
        getApp.click();
        return new AppPage(driver);
    }

    public OSPage clickOS() {
        getOS.click();
        return new OSPage(driver);
    }

    public PreferencePage clickPreference() {
        getPreference.click();
        return new PreferencePage(driver);
    }


}