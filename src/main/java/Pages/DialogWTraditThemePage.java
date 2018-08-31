package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogWTraditThemePage extends TestRunner {

    //Initialize DialogWTraditThemePage
    public DialogWTraditThemePage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map DialogWDefThemePage buttons

    @FindBy(id ="android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectMessageText;

    //Actions

    public AlertDialogsPage clickOk() {
        getOk.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickCancel() {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }

    public String getMessageText() {
        return selectMessageText.getText();
    }

}
