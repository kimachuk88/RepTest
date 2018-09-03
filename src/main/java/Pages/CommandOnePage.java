package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommandOnePage {

    //Map CommonOnePage buttons

    @FindBy(id = "android:id/message" )
    private WebElement selectCommmandOnePageTxt;

    //Actions

    public String getCommmandOnePageTxt() throws Exception {
        return selectCommmandOnePageTxt.getText();
    }

}
