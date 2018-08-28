package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class PreferencePage {

    ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getPreferencesFromXML() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘1. Preferences from XML’)]");
    }
    public WebElement getLaunchingPreferences() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘2. Launching preferences’)]");
    }
    public WebElement getPreferenceDependencies() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘3. Preference dependencies’)]");
    }
    public WebElement getDefaultValues() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘4. Default values’)]");
    }
    public WebElement getPreferencesFromCode() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘5. Preferences from code’)]");
    }
    public WebElement getAdvancedPreferences() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘6. Advanced preferences’)]");
    }
    public WebElement getFragment() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘7. Fragment’)]");
    }
    public WebElement getHeaders() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘8. Headers’)]");
    }
    public WebElement getSwitch() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘9. Switch’)]");
    }

    //Actions

    public SwitchPage clickSwitch() {
        getSwitch().click();
        return new SwitchPage();
    }
}