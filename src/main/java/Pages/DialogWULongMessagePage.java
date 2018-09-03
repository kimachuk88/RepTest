package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogWULongMessagePage extends TestRunner {

    //Initialize DialogWULongMessagePage
    public DialogWULongMessagePage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map DialogWULongMessagePage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    public WebElement getCancel;

    @FindBy(id = "android:id/button3")
    public WebElement getSomething;

    @FindBy(id = "android:id/message")
    private WebElement selectMessageText;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    //Actions

    public AlertDialogsPage clickOk() {
        getOk.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickCancel() {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickSomething() {
        getSomething.click();
        return new AlertDialogsPage(driver);
    }

    public String getMessageText() {
        return selectMessageText.getText();
    }

    private String getHeaderText() {
        return selectHeaderText.getText();
    }
}
