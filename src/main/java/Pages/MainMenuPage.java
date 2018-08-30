package Pages;

import Tools.ISearch;
import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenuPage {

    ISearch Search;
    TestRunner _test;

    public MainMenuPage(AndroidDriver driver){
        _test.driver = driver;
    }

    public MainMenuPage get(AndroidDriver driver){
        _test.driver = driver;
        return this;
    }

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
        return Search.XPath("//android.widget.TextView[@content-desc=\"OS\"]");
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