package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SwitchPage {


    //List<WebElement> radioButtons;

    public SwitchPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "android:id/checkbox")
    public WebElement getCheckboxPreference;

    @FindBy(className = "android.widget.Switch")
    public List<WebElement> getRadioButtons;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.Switch")
    public WebElement getRadioButton1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.Switch")
    public WebElement getRadioButton2;



    //Actions
    public void clickCheckboxPreference() {

        getCheckboxPreference.click();
    }

    public boolean isCheckBoxSelected() {

        return getCheckboxPreference.getAttribute("checked").equals("true");
    }

    public void selectSwitchPreferenceFirst() {

        getRadioButton1.click();
    }

    public boolean isSwitchPreferenceFirstSelected() {

        return getRadioButton1.getAttribute("checked").equals("true");
    }

    public void selectSwitchPreferenceSecond() {

        //getRadioButtons.get(1).click();
        getRadioButton2.click();
    }

    public boolean isSwitchPreferenceSecondSelected() {

        // return getRadioButtons.get(1).isSelected();
        return getRadioButton2.getAttribute("checked").equals("true");
    }
}