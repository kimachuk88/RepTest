package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DialogWULongMessagePage extends TestRunner {

    public DialogWULongMessagePage(AndroidDriver driver) {
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

    public WebElement getSomething() throws Exception {
        return Search.Id("android:id/button3");
    }

    public AlertDialogsPage clickSomething() throws Exception {
        getSomething().click();
        return new AlertDialogsPage(driver);
    }

    public String getMessageText() throws Exception {
        return Search.Id("android:id/message").getText();
    }

    public String getHeaderText() throws Exception {
        return Search.Id("android:id/alertTitle").getText();
    }
}


