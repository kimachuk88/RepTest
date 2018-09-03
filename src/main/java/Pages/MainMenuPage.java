package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage extends TestRunner {

    //Initialize MainMenuPage
    public MainMenuPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map MainMenuPage buttons

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='App']")
    private WebElement getApp;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='OS']")
    private WebElement getOS;


    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Preference']")
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