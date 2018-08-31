package Pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListDialogPage {

    //Initialize ListDialogPage
    public ListDialogPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map ListDialogPage buttons

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    private WebElement getCommandOne;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    private WebElement getCommandTwo;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]")
    private WebElement getCommandThree;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]")
    private WebElement getCommandFour;

    //Actions

    public CommandOnePage clickCommandOne() {
        getCommandOne.click();
        return new CommandOnePage();
    }

    public CommandTwoPage clickCommandTwo() {
        getCommandTwo.click();
        return new CommandTwoPage();
    }

    public CommandThreePage clickCommandThree() {
        getCommandThree.click();
        return new CommandThreePage();
    }

    public CommandFourPage clickCommandFour() {
        getCommandFour.click();
        return new CommandFourPage();
    }
}
