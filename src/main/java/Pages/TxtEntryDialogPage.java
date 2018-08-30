package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class TxtEntryDialogPage extends TestRunner {

    public TxtEntryDialogPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getOk() throws Exception {
        return Search.Id("android:id/button1");
    }

    public AlertDialogsPage clickOk() throws Exception {
        getOk().click();
        return new AlertDialogsPage(driver);
    }

    public WebElement getCancel() throws Exception {
        return Search.Id("android:id/button2");
    }

    public AlertDialogsPage clickCancel() throws Exception {
        getCancel().click();
        return new AlertDialogsPage(driver);
    }

    public String getHeaderText() throws Exception {
        return Search.Id("android:id/alertTitle").getText();
    }

    public WebElement getNameField() throws Exception {
        return Search.Id("com.example.android.apis:id/username_edit");
    }

    public void fillInNameField(String message) throws Exception {
        getNameField().sendKeys(message);
    }

    public WebElement getPasswordField() throws Exception {
        return Search.Id("com.example.android.apis:id/password_edit");
    }

    public void fillInPasswordField(String message) throws Exception {
        getPasswordField().sendKeys(message);
    }
}
