package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public class DialogWDefLightThemePage extends TestRunner {

    public DialogWDefLightThemePage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
