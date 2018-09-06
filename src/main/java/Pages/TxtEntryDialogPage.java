package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TxtEntryDialogPage extends TestRunner {

    // Initialize TxtEntryDialogPage
    public TxtEntryDialogPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Map TxtEntryDialogPage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    public List<WebElement> selectHeaderText;

    @FindBy(id = "com.example.android.apis:id/username_edit")
    private WebElement getNameField;

    @FindBy(id = "com.example.android.apis:id/password_edit")
    private WebElement getPasswordField;

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
        return selectHeaderText.get(0).getText();
    }

    public void fillInNameField(String message) {

        getNameField.sendKeys(message);
    }

    public void fillInPasswordField(String message) {

        getPasswordField.sendKeys(message);
    }

    public boolean isNameFieldEmpty() {
        boolean isEmptyField = false;
        String textInsideNameField = getNameField.getAttribute("text");
        if (textInsideNameField.isEmpty()) {
            isEmptyField = true;
        }
        return isEmptyField;
    }

    public boolean isPassWordFieldEmpty() {
        boolean isEmptyField = false;
        String textInsidePasswordField = getNameField.getAttribute("text");
        if (textInsidePasswordField.isEmpty()) {
            isEmptyField = true;
        }
        return isEmptyField;
    }
}
