package Pages;

import Tools.ISearch;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MainMenuPage {
    AndroidDriver driver;

    ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getApp() {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.TextView[3]");
    }

    public WebElement getOS() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘OS’)]");
    }

    public WebElement getPreference() {
        return Search.XPath("//android.widget.TextView[contains(text(),‘Preference’)]");
    }
    public MainMenuPage(AndroidDriver driver) {
        //this.driver = driver;

        PageFactory.initElements(driver, this);
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