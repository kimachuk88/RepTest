package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class SMSSentPage {

    ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getPromptMessage() {
        return Search.Id("android:id/message").getText();
    }

    public WebElement getOk(){
        return Search.Id("android:id/button1");
    }

    //Actions

    public SMSMessagingPage clickOk(){
        getOk().click();
        return new SMSMessagingPage();
    }

}