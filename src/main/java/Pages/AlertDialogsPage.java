package Pages;

import Tools.TestRunner;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AlertDialogsPage extends TestRunner {

    public AlertDialogsPage(AndroidDriver driver) {
        PageFactory.initElements(driver, this);
    }

    //OK CANCEL DIALOG WITH A MESSAGE
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons")
    private WebElement getDialogWMessage;


    public DialogWMessagePage clickDialogMessage() throws Exception {
        getDialogWMessage.click();
        return new DialogWMessagePage(driver);
    }

    //OK CANCEL DIALOG WITH A LONG MESSAGE
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons2")
    private WebElement getDialogWLongMessage;

    public DialogWLongMessagePage clickDialogWLongMessage() throws Exception {
        getDialogWLongMessage.click();
        return new DialogWLongMessagePage(driver);
    }

    //OK CANCEL DIALOG WITH ULTRA LONG MESSAGE
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons2ultra")
    private WebElement getDialogWULongMessage;

    public DialogWULongMessagePage clickDialogWULongMessage() throws Exception {
        getDialogWULongMessage.click();
        return new DialogWULongMessagePage(driver);
    }

    //LIST DIALOG
    @FindBy(how = How.ID, using = "com.example.android.apis:id/select_button")
    private WebElement getListDialog;

    public ListDialogPage clickListDialog() throws Exception {
        getListDialog.click();
        return new ListDialogPage();
    }

    //PROGRESS BAR DIALOG
    @FindBy(how = How.ID, using = "com.example.android.apis:id/progress_button")
    private WebElement getProgressBarDialog;

    public ProgressBarDialogPage clickProgressBarDialog() throws Exception {
        getProgressBarDialog.click();
        return new ProgressBarDialogPage(driver);
    }

    //PROGRESS SPINNER DIALOG
    @FindBy(how = How.ID, using = "com.example.android.apis:id/progress_spinner_button")
    private WebElement getProSpinnerDialog;

    public ProSpinnerDialogPage clickProSpinnerDialog() throws Exception {
        getProSpinnerDialog.click();
        return new ProSpinnerDialogPage();
    }

    //SINGLE CHOICE LIST
    @FindBy(how = How.ID, using = "com.example.android.apis:id/radio_button")
    private WebElement getSingleChoiceList;

    public SingleChoiceListPage clickSingleChoiceList() throws Exception {
        getSingleChoiceList.click();
        return new SingleChoiceListPage(driver);
    }

    //REPEAT ALARM
    @FindBy(how = How.ID, using = "com.example.android.apis:id/checkbox_button")
    private WebElement getRepeatAlarm;

    public RepeatAlarmPage clickRepeatAlarm() throws Exception {
        getRepeatAlarm.click();
        return new RepeatAlarmPage(driver);
    }

    //SEND CALL TO VOICEMAIL
    @FindBy(how = How.ID, using = "com.example.android.apis:id/checkbox_button2")
    private WebElement getCallToVoicemail;

    //TEXT ENTRY DIALOG
    @FindBy(how = How.ID, using = "com.example.android.apis:id/text_entry_button")
    private WebElement getTxtEntryDialog;

    public TxtEntryDialogPage clickTxtEntryDialog() throws Exception {
        getTxtEntryDialog.click();
        return new TxtEntryDialogPage(driver);
    }

    //OK CANCEL DIALOG WITH TRADITIONAL THEME
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons_old_school")
    private WebElement getDialogWTraditTheme;

    public DialogWTraditThemePage clickDialogWTraditTheme() throws Exception {
        getDialogWTraditTheme.click();
        return new DialogWTraditThemePage(driver);
    }

    //OK CANCEL DIALOG WITH HOLO LIGHT THEME
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons_holo_light")
    private WebElement getDialogWHoloTheme;

    public DialogWHoloThemePage clickDialogWHoloTheme() throws Exception {
        getDialogWHoloTheme.click();
        return new DialogWHoloThemePage(driver);
    }

    //OK CANCEL DIALOG WITH DEVICEDEFAULT LIGHT THEME
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons_default_light")
    private WebElement getDialogWDefLightTheme;

    public DialogWDefLightThemePage clickDialogWDefLightTheme() throws Exception {
        getDialogWDefLightTheme.click();
        return new DialogWDefLightThemePage(driver);
    }

    //OK CANCEL DIALOG WITH DEVICEDEFAULT THEME
    @FindBy(how = How.ID, using = "com.example.android.apis:id/two_buttons_default_dark")
    private WebElement getDialogWDefTheme;

    public DialogWDefThemePage clickDialogWDefTheme() throws Exception {
        getDialogWDefTheme.click();
        return new DialogWDefThemePage(driver);
    }
}
