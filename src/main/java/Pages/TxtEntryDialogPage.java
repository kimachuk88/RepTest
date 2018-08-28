package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class TxtEntryDialogPage {
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
