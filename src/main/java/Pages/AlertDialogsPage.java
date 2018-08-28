package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class AlertDialogsPage {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    //OK CANCEL DIALOG WITH A MESSAGE
    public WebElement getDialogWMessage() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons");
    }

    public DialogWMessagePage clickDialogMessage() throws Exception {
        getDialogWMessage().click();
        return new DialogWMessagePage();
    }

    //OK CANCEL DIALOG WITH A LONG MESSAGE
    public WebElement getDialogWLongMessage() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons2");
    }

    public DialogWLongMessagePage clickDialogWLongMessage() throws Exception {
        getDialogWLongMessage().click();
        return new DialogWLongMessagePage();
    }

    //OK CANCEL DIALOG WITH ULTRA LONG MESSAGE
    public WebElement getDialogWULongMessage() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons2ultra");
    }

    public DialogWULongMessagePage clickDialogWULongMessage() throws Exception {
        getDialogWULongMessage().click();
        return new DialogWULongMessagePage();
    }

    //LIST DIALOG
    public WebElement getListDialog() throws Exception {
        return Search.Id("com.example.android.apis:id/select_button");
    }

    public ListDialogPage clickListDialog() throws Exception {
        getListDialog().click();
        return new ListDialogPage();
    }

    //PROGRESS BAR DIALOG
    public WebElement getProgressBarDialog() throws Exception {
        return Search.Id("com.example.android.apis:id/progress_button");
    }

    public ProgressBarDialogPage clickProgressBarDialog() throws Exception {
        getProgressBarDialog().click();
        return new ProgressBarDialogPage();
    }

    //PROGRESS SPINNER DIALOG
    public WebElement getProSpinnerDialog() throws Exception {
        return Search.Id("com.example.android.apis:id/progress_spinner_button");
    }

    public ProSpinnerDialogPage clickProSpinnerDialog() throws Exception {
        getProSpinnerDialog().click();
        return new ProSpinnerDialogPage();
    }

    //SINGLE CHOICE LIST
    public WebElement getSingleChoiceList() throws Exception {
        return Search.Id("com.example.android.apis:id/radio_button");
    }

    public SingleChoiceListPage clickSingleChoiceList() throws Exception {
        getSingleChoiceList().click();
        return new SingleChoiceListPage();
    }

    //REPEAT ALARM
    public WebElement getRepeatAlarm() throws Exception {
        return Search.Id("com.example.android.apis:id/checkbox_button");
    }

    public RepeatAlarmPage clickRepeatAlarm() throws Exception {
        getRepeatAlarm().click();
        return new RepeatAlarmPage();
    }

    //SEND CALL TO VOICEMAIL
    public WebElement getCallToVoicemail() throws Exception {
        return Search.Id("com.example.android.apis:id/checkbox_button2");
    }

    //TEXT ENTRY DIALOG
    public WebElement getTxtEntryDialog() throws Exception {
        return Search.Id("com.example.android.apis:id/text_entry_button");
    }

    public TxtEntryDialogPage clickTxtEntryDialog() throws Exception {
        getTxtEntryDialog().click();
        return new TxtEntryDialogPage();
    }

    //OK CANCEL DIALOG WITH TRADITIONAL THEME
    public WebElement getDialogWTraditTheme() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons_old_school");
    }

    public DialogWTraditThemePage clickDialogWTraditTheme() throws Exception {
        getDialogWTraditTheme().click();
        return new DialogWTraditThemePage();
    }

    //OK CANCEL DIALOG WITH HOLO LIGHT THEME
    public WebElement getDialogWHoloTheme() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons_holo_light");
    }

    public DialogWHoloThemePage clickDialogWHoloTheme() throws Exception {
        getDialogWHoloTheme().click();
        return new DialogWHoloThemePage();
    }

    //OK CANCEL DIALOG WITH DEVICEDEFAULT LIGHT THEME
    public WebElement getDialogWDefLightTheme() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons_default_light");
    }

    public DialogWDefLightThemePage clickDialogWDefLightTheme() throws Exception {
        getDialogWDefLightTheme().click();
        return new DialogWDefLightThemePage();
    }

    //OK CANCEL DIALOG WITH DEVICEDEFAULT THEME
    public WebElement getDialogWDefTheme() throws Exception {
        return Search.Id("com.example.android.apis:id/two_buttons_default_dark");
    }

    public DialogWDefThemePage clickDialogWDefTheme() throws Exception {
        getDialogWDefTheme().click();
        return new DialogWDefThemePage();
    }
}
