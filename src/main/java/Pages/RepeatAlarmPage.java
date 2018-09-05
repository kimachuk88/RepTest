package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView")
    private List<WebElement>getDaysOfTheWeek;

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

    public void clickEveryMonday() {
        getEveryMonday.click();
        //return getEveryMonday.isEnabled();
    }
    public void clickEveryTuesday() {
        getEveryTuesday.click();
        //return getEveryTuesday.isEnabled();
    }
    public void clickEveryWednesday() {
        getEveryWednesday.click();
        //return getEveryWednesday.isSelected();
    }
    public void clickEveryThursday() {
        getEveryThursday.click();
        //return getEveryThursday.isSelected();
    }
    public void clickEveryFriday() {
        getEveryFriday.click();
        //return getEveryFriday.isSelected();
    }
    public void clickEverySaturday() {
        getEverySaturday.click();
        //return getEverySaturday.isSelected();
    }
    public void clickEverySunday() {
        getEverySunday.click();
        //return getEverySunday.isSelected();
    }

    //Get name and index of the buttons & create Map
    public List<String> getText(){
        List<String> daysOfTheWeek = new ArrayList<String>();
        for (WebElement element : getDaysOfTheWeek){
            daysOfTheWeek.add(element.getText());
        }
        return  daysOfTheWeek;
    }

    public Map<Integer, String> setActualMap() {
        Map<Integer, String> actual = new HashMap<>();
        for (int i = 0; i < getText().size(); i++) {
            actual.put(i, getText().get(i));
        }
        return actual;
    }

    //Check if selected checkbox
    public boolean isEveryMondaySelected() {
        return getEveryMonday.getAttribute("checked").equals("true");
    }

    public boolean isEveryTuesdaySelected() {
        return getEveryTuesday.getAttribute("checked").equals("true");
    }

    public boolean isEveryWednesdaySelected() {
        return getEveryWednesday.getAttribute("checked").equals("true");
    }

    public boolean isEveryThursdaySelected() {
        return getEveryThursday.getAttribute("checked").equals("true");
    }

    public boolean isEveryFridaySelected() {
        return getEveryFriday.getAttribute("checked").equals("true");
    }

    public boolean isEverySaturdaySelected() {
        return getEverySaturday.getAttribute("checked").equals("true");
    }

    public boolean isEverySundaySelected() {
        return getEverySunday.getAttribute("checked").equals("true");
    }
}