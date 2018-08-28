package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

import java.util.Collection;
import java.util.List;

public class SwitchPage {

    ISearch Search;
    List<WebElement> radioButtons;


    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getCheckboxPreference() {
        return Search.Id("android:id/checkbox");
    }

    public Collection getRadioButtons() {
        radioButtons = (List<WebElement>) Search.ClassNames("android.widget.Switch");
        return radioButtons;
    }

    //Actions
    public boolean clickCheckboxPreference() {

        getCheckboxPreference().click();

        return getCheckboxPreference().isSelected();
    }

    public void selectSwithPreferenceFirst() {
        radioButtons.get(0).click();
    }

    public void selectSwithPreferenceSecond() {
        radioButtons.get(1).click();
    }


}