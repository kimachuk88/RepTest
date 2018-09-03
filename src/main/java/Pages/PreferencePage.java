package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreferencePage extends TestRunner {

    //Initialize PreferencePage
    public PreferencePage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map PreferencePage buttons

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘1. Preferences from XML’)]")
    private WebElement getPreferencesFromXML;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘2. Launching preferences’)]")
    private WebElement getLaunchingPreferences;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘3. Preference dependencies’)]")
    private WebElement getPreferenceDependencies;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘4. Default values’)]")
    private WebElement getDefaultValues;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘5. Preferences from code’)]")
    private WebElement getPreferencesFromCode;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘6. Advanced preferences’)]")
    private WebElement getAdvancedPreferences;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘7. Fragment’)]")
    private WebElement getFragment;

    @FindBy(xpath = "//android.widget.TextView[contains(text(),‘8. Headers’)]")
    private WebElement getHeaders;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]")
    private WebElement getSwitch;


    //Actions

    public SwitchPage clickSwitch() {
        getSwitch.click();
        return new SwitchPage(driver);
    }
}