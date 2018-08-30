package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SingleChoiceListPage extends TestRunner {

    public SingleChoiceListPage(AndroidDriver driver) {
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

    public WebElement getMap() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[1]");
    }

    public SingleChoiceListPage chooseMap() throws Exception {
        getMap().click();
        return new SingleChoiceListPage(driver);
    }

    public WebElement getSatellite() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
    }

    public SingleChoiceListPage chooseSatellite() throws Exception {
        getSatellite().click();
        return new SingleChoiceListPage(driver);
    }

    public WebElement getTraffic() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]");
    }

    public SingleChoiceListPage chooseTraffic() throws Exception {
        getTraffic().click();
        return new SingleChoiceListPage(driver);
    }

    public WebElement getStreetView() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]");
    }

    public SingleChoiceListPage chooseStreetView() throws Exception {
        getStreetView().click();
        return new SingleChoiceListPage(driver);
    }
}
