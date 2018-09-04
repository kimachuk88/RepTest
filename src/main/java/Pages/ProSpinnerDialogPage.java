package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProSpinnerDialogPage extends TestRunner {
   // public ProSpinnerDialogPage(AndroidDriver driver) {
        //PageFactory.initElements(driver, this);
    //}

    //Map ProSpinnerDialogPage
    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    //Actions

    private String getHeaderText() {
        return selectHeaderText.getText();
    }
}
