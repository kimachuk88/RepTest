package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class ProgressBarDialogPage {
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
        return new AlertDialogsPage();
    }

    public WebElement getCancel() throws Exception {
        return Search.Id("android:id/button2");
    }

    public AlertDialogsPage clickCancel() throws Exception {
        getCancel().click();
        return new AlertDialogsPage();
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
