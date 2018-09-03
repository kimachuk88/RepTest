package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommandThreePage {

    //Map CommonThreePage buttons

    @FindBy(id = "android:id/message" )
    private WebElement selectCommmandThreePageTxt;

    //Actions

    public String getCommmandThreePageTxt() throws Exception {
        return selectCommmandThreePageTxt.getText();
    }
}

