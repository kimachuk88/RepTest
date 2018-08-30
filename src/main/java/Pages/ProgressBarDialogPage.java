package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProgressBarDialogPage extends TestRunner {

    public ProgressBarDialogPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getHide() throws Exception {
        return Search.Id("android:id/button1");
    }

    public AlertDialogsPage clickHide() throws Exception {
        getHide().click();
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

    public String getPercentageDoneText() throws Exception {
        return Search.Id("android:id/progress_percent").getText();
    }

    public String getProgressOutOfHundreadDoneText() throws Exception {
        return Search.Id("android:id/progress_number").getText();
    }
}
