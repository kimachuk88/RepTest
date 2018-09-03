package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ListDialogPage extends TestRunner {

    //Initialize ListDialogPage
    public ListDialogPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map ListDialogPage buttons

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Command one']")
    private WebElement getCommandOne;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Command two']")
    private WebElement getCommandTwo;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Command three']")
    private WebElement getCommandThree;

    @FindBy(xpath = "//*[@class='android.widget.TextView' and @text='Command four']")
    private WebElement getCommandFour;

    //Actions

    public CommandOnePage clickCommandOne() {
        getCommandOne.click();
        return new CommandOnePage(driver);
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
