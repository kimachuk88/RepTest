package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class ProgressBarDialogPage extends TestRunner {

    //Initialize ProgressBarDialogPage
    public ProgressBarDialogPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map ProgressBarDialogPage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getHide;

    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[1]")
    //@FindBy(id = "android:id/progress_percent")
    private WebElement selectPercentageDoneText;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView[2]")
    //@FindBy(id = "android:id/progress_number")
    private WebElement selectProgressOutOfHundreadDoneText;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout")
    public WebElement frame;
    //Actions

    public AlertDialogsPage clickHide() {
        getHide.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickCancel() {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }

    public String getHeaderText() {
        return selectHeaderText.getText();
    }

    public String getPercentageDoneText() {
        return selectPercentageDoneText.getText();
    }

    public String getProgressOutOfHundreadDoneText() {
        return selectProgressOutOfHundreadDoneText.getText();
    }

}
