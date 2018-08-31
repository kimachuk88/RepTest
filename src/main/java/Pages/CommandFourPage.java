package Pages;

import Tools.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommandFourPage extends TestRunner {

    //Map CommonFourPage buttons

    @FindBy(id = "android:id/message" )
    private WebElement selectCommmandFourPageTxt;

    //Actions

    public String getCommmandFourPageTxt() throws Exception {
        return selectCommmandFourPageTxt.getText();
    }
}
