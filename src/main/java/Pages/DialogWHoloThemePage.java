package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogWHoloThemePage extends TestRunner {

    //Initialize DialogWHoloThemePage
    public DialogWHoloThemePage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }


    //Map DialogWHoloThemePage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    public WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    //Actions

    public AlertDialogsPage clickOk() {
        getOk.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickCancel()  {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }

    private String getHeaderText() {
        return selectHeaderText.getText();
    }
}
