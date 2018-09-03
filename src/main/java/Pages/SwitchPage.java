package Pages;

import Tools.ISearch;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;
import java.util.List;

public class SwitchPage {


    //List<WebElement> radioButtons;

    public SwitchPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[9]")
    public WebElement getCheckboxPreference;

    @FindBy(id = "android.widget.Switch")
    public List<WebElement> getRadioButtons;


    //Actions
    public void clickCheckboxPreference() {

        getCheckboxPreference.click();
    }

    public boolean isCheckBoxSelected() {

        return getCheckboxPreference.isSelected();
    }

    public void selectSwitchPreferenceFirst() {

        getRadioButtons.get(0).click();
    }

    public boolean isSwitchPreferenceFirstSelected() {

        return getCheckboxPreference.isSelected();
    }

    public void selectSwitchPreferenceSecond() {

        getRadioButtons.get(1).click();
    }

    public boolean isSwitchPreferenceSecondSelected() {

        return getCheckboxPreference.isSelected();
    }
}