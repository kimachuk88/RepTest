package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.aspectj.weaver.ast.And;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommandOnePage {

    public CommandOnePage(AndroidDriver driver)  {
        PageFactory.initElements(driver, this);
    }
    //Map CommonOnePage buttons

    @FindBy(id = "android:id/message" )
    private WebElement selectCommmandOnePageTxt;

    //Actions

    public String getCommmandOnePageTxt() throws Exception {
        return selectCommmandOnePageTxt.getText();
    }

}
