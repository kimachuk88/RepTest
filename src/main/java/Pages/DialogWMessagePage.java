package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogWMessagePage extends TestRunner {

    public DialogWMessagePage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    @FindBy(id ="android:id/button1")
    private WebElement getOk;

    public AlertDialogsPage clickOk() throws Exception {
        getOk.click();
        return new AlertDialogsPage(driver);
    }
    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    public AlertDialogsPage clickCancel() throws Exception {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }
    @FindBy(id = "android:id/alertTitle")
    private WebElement selectMessageText;

    public String getMessageText() throws Exception {
        return selectMessageText.getText();

    }
}
