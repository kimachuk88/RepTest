package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleChoiceListPage extends TestRunner {

    // Initialize SingleChoiceListPage
    public SingleChoiceListPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Map SingleChoiceListPage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]")
    private WebElement getMap;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]")
    private WebElement getSatellite;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
    private WebElement getTraffic;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
    public WebElement getStreetView;


    // Actions

    public AlertDialogsPage clickOk() {
        getOk.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickCancel() {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }

    public String getHeaderText() {
        return selectHeaderText.getText();
    }

    public SingleChoiceListPage chooseMap() {
        getMap.click();
        return new SingleChoiceListPage(driver);
    }

    public SingleChoiceListPage chooseSatellite() {
        getSatellite.click();
        return new SingleChoiceListPage(driver);
    }

    public SingleChoiceListPage chooseTraffic() {
        getTraffic.click();
        return new SingleChoiceListPage(driver);
    }

    public SingleChoiceListPage chooseStreetView() {
        getStreetView.click();
        return new SingleChoiceListPage(driver);
    }
}
