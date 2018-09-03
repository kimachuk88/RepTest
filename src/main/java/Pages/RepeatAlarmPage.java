package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepeatAlarmPage extends TestRunner {

    //Initialize RepeatAlarmPage
    public RepeatAlarmPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map RepeatAlarmPage buttons

    @FindBy(id = "android:id/button1")
    private WebElement getOk;

    @FindBy(id = "android:id/button2")
    private WebElement getCancel;

    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Monday']")
    private WebElement getEveryMonday;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Tuesday']")
    private WebElement getEveryTuesday;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Wednesday']")
    private WebElement getEveryWednesday;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Thursday']")
    private WebElement getEveryThursday;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Friday']")
    private WebElement getEveryFriday;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Saturday']")
    private WebElement getEverySaturday;

    @FindBy(xpath = "//*[@class='android.widget.CheckedTextView' and @text='Every Sunday']")
    private WebElement getEverySunday;

    // Actions

    public AlertDialogsPage clickOk() {
        getOk.click();
        return new AlertDialogsPage(driver);
    }

    public AlertDialogsPage clickCancel() {
        getCancel.click();
        return new AlertDialogsPage(driver);
    }

    public String getHeaderText() {
        return selectHeaderText.getText();
    }


    public boolean isEveryMondaySelected() {
        getEveryMonday.click();
        return getEveryMonday.isSelected();
    }

    public boolean isEveryTuesdaySelected() {
        getEveryTuesday.click();
        return getEveryTuesday.isSelected();
    }

    public boolean isEveryWednesdaySelected() {
        getEveryWednesday.click();
        return getEveryWednesday.isSelected();
    }

    public boolean isEveryThursdaySelected() {
        getEveryThursday.click();
        return getEveryThursday.isSelected();
    }

    public boolean chooseEveryFriday() {
        getEveryFriday.click();
        return getEveryFriday.isSelected();
    }

    public boolean isEverySaturdaySelected() {
        getEverySaturday.click();
        return getEverySaturday.isSelected();
    }

    public boolean isEverySundaySelected() {
        getEverySunday.click();
        return getEverySunday.isSelected();
    }
}