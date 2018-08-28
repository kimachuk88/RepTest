package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class DialogWMessagePage extends CommonElementsPage {
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
        return new AlertDialogsPage();
    }

    public WebElement getCancel() throws Exception {
        return Search.Id("android:id/button2");
    }

    public AlertDialogsPage clickCancel() throws Exception {
        getCancel().click();
        return new AlertDialogsPage();
    }

    public String getMessageText() throws Exception {
        return Search.Id("android:id/alertTitle").getText();
    }
}
