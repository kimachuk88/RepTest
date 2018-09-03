package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommandTwoPage {

    //Map CommonTwoPage buttons

    @FindBy(id = "android:id/message" )
    private WebElement selectCommmandTwoPageTxt;

    //Actions

    public String getCommmandTwoPageTxt() throws Exception {
        return selectCommmandTwoPageTxt.getText();
    }

}
