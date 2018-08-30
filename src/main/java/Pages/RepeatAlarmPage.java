package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RepeatAlarmPage extends TestRunner {

    public RepeatAlarmPage(AndroidDriver driver) {
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

    public String getHeaderText() throws Exception {
        return Search.Id("android:id/alertTitle").getText();
    }

    public AlertDialogsPage clickCancel() throws Exception {
        getCancel().click();
        return new AlertDialogsPage(driver);
    }

    public WebElement getEveryMonday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Monday')]");
    }

    public boolean chooseEveryMonday() throws Exception {
        getEveryMonday().click();
        return getEveryMonday().isSelected();
    }

    public WebElement getEveryTuesday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Tuesday')]");
    }

    public boolean chooseEveryTuesday() throws Exception {
        getEveryTuesday().click();
        return getEveryTuesday().isSelected();
    }

    public WebElement getEveryWednesday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Wednesday')]");
    }

    public boolean chooseEveryWednesday() throws Exception {
        getEveryWednesday().click();
        return getEveryWednesday().isSelected();
    }

    public WebElement getEveryThursday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Thursday')]");
    }

    public boolean chooseEveryThursday() throws Exception {
        getEveryThursday().click();
        return getEveryThursday().isSelected();
    }

    public WebElement getEveryFriday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Friday')]");
    }

    public boolean chooseEveryFriday() throws Exception {
        getEveryFriday().click();
        return getEveryFriday().isSelected();
    }

    public WebElement getEverySaturday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Saturday')]");
    }

    public boolean chooseEverySaturday() throws Exception {
        getEverySaturday().click();
        return getEverySaturday().isSelected();
    }

    public WebElement getEverySunday() throws Exception {
        return Search.XPath("//android.widget.CheckedTextView[contains(text(),'Every Sunday')]");
    }

    public boolean chooseEverySunday() throws Exception {
        getEverySunday().click();
        return getEverySunday().isSelected();
    }
}