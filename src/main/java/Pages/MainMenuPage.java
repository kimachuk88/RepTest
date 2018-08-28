package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class MainMenuPage {

    ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getApp() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘App’)]");
    }

    public WebElement getOS() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘OS’)]");
    }

    public WebElement getPreference() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Preference’)]");
    }

    //Actions

    public AppPage clickApp(){
        getApp().click();
        return new AppPage();
    }

    public OSPage clickOS(){
        getOS().click();
        return new OSPage();
    }

    public PreferencePage clickPreferenc(){
        getPreference().click();
        return new PreferencePage();
    }






}