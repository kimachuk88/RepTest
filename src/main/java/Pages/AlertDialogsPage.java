package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertDialogsPage extends TestRunner {

    //Initialize AlertDialogsPage

    public AlertDialogsPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //Map AlertDialogsPage buttons

    @FindBy(id = "com.example.android.apis:id/two_buttons")
    private WebElement getDialogWMessage;

    @FindBy(id = "com.example.android.apis:id/two_buttons2")
    private WebElement getDialogWLongMessage;

    @FindBy(id = "com.example.android.apis:id/two_buttons2ultra")
    private WebElement getDialogWULongMessage;

    @FindBy(id = "com.example.android.apis:id/select_button")
    private WebElement getListDialog;

    @FindBy(id = "com.example.android.apis:id/progress_button")
    private WebElement getProgressBarDialog;

    @FindBy(id = "com.example.android.apis:id/progress_spinner_button")
    private WebElement getProSpinnerDialog;

    @FindBy(id = "com.example.android.apis:id/radio_button")
    private WebElement getSingleChoiceList;

    @FindBy(id = "com.example.android.apis:id/checkbox_button")
    private WebElement getRepeatAlarm;

    @FindBy(id = "com.example.android.apis:id/checkbox_button2")
    private WebElement getCallToVoicemail;

    @FindBy(id = "com.example.android.apis:id/text_entry_button")
    private WebElement getTxtEntryDialog;

    @FindBy(id = "com.example.android.apis:id/two_buttons_old_school")
    private WebElement getDialogWTraditTheme;

    @FindBy(id = "com.example.android.apis:id/two_buttons_holo_light")
    private WebElement getDialogWHoloTheme;

    @FindBy(id = "com.example.android.apis:id/two_buttons_default_light")
    private WebElement getDialogWDefLightTheme;

    //OK CANCEL DIALOG WITH DEVICEDEFAULT THEME
    @FindBy(id = "com.example.android.apis:id/two_buttons_default_dark")
    private WebElement getDialogWDefTheme;

    //Actions

    public DialogWMessagePage clickDialogMessage() {
        getDialogWMessage.click();
        return new DialogWMessagePage(driver);
    }

    public DialogWLongMessagePage clickDialogWLongMessage() {
        getDialogWLongMessage.click();
        return new DialogWLongMessagePage(driver);
    }

    public DialogWULongMessagePage clickDialogWULongMessage() {
        getDialogWULongMessage.click();
        return new DialogWULongMessagePage(driver);
    }

    public ListDialogPage clickListDialog() {
        getListDialog.click();
        return new ListDialogPage(driver);
    }

    public ProgressBarDialogPage clickProgressBarDialog() {
        getProgressBarDialog.click();
        return new ProgressBarDialogPage(driver);
    }

    public ProSpinnerDialogPage clickProSpinnerDialog() {
        getProSpinnerDialog.click();
        return new ProSpinnerDialogPage();
    }

    public SingleChoiceListPage clickSingleChoiceList() {
        getSingleChoiceList.click();
        return new SingleChoiceListPage(driver);
    }

    public RepeatAlarmPage clickRepeatAlarm() {
        getRepeatAlarm.click();
        return new RepeatAlarmPage(driver);
    }

    public TxtEntryDialogPage clickTxtEntryDialog() {
        getTxtEntryDialog.click();
        return new TxtEntryDialogPage(driver);
    }

    public DialogWTraditThemePage clickDialogWTraditTheme() {
        getDialogWTraditTheme.click();
        return new DialogWTraditThemePage(driver);
    }

    public DialogWHoloThemePage clickDialogWHoloTheme() {
        getDialogWHoloTheme.click();
        return new DialogWHoloThemePage(driver);
    }

    public DialogWDefLightThemePage clickDialogWDefLightTheme() {
        getDialogWDefLightTheme.click();
        return new DialogWDefLightThemePage(driver);
    }

    public DialogWDefThemePage clickDialogWDefTheme() {
        getDialogWDefTheme.click();
        return new DialogWDefThemePage(driver);
    }

}
