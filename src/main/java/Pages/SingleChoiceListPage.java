package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleChoiceListPage extends TestRunner {

    // Initialize SingleChoiceListPage
    public SingleChoiceListPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Map SingleChoiceListPage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Map']")
    private WebElement getMap;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Satellite']")
    private WebElement getSatellite;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Traffic']")
    private WebElement getTraffic;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Street view']")
    private WebElement getStreetView;

    @FindBy(className = "android.widget.CheckedTextView")
    public List<WebElement> getAllChoiceButtons;




    //Get name and index of the buttons & create Map
    public List<String> getIsChecked(){
        List<String> allChoiceButtons = new ArrayList<String>();
        for (WebElement element : getAllChoiceButtons){
            allChoiceButtons.add(element.getAttribute("checked"));
        }
        return  allChoiceButtons;
    }

    public Map<Integer, String> setActualMap() {
        Map<Integer, String> actual = new HashMap<>();
        for (int i = 0; i < getIsChecked().size(); i++) {
            actual.put(i, getIsChecked().get(i));
        }
        return actual;
    }
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
        return selectHeaderText.getText();
    }

    public SingleChoiceListPage chooseMap() {
        getMap.click();
        return new SingleChoiceListPage(driver);
    }

    public SingleChoiceListPage chooseSatellite() {
        getSatellite.click();
        return new SingleChoiceListPage(driver);
    }

    public SingleChoiceListPage chooseTraffic() {
        getTraffic.click();
        return new SingleChoiceListPage(driver);
    }

    public SingleChoiceListPage chooseStreetView() {
        getStreetView.click();
        return new SingleChoiceListPage(driver);
    }


}
