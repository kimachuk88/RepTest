import Pages.*;
import Tools.TestRunner;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends TestRunner {


    @Test
    public void MessageTest() throws Exception {
        MainMenuPage mainMenuPage =  new MainMenuPage(driver);
        AppPage appPage = new AppPage(driver);
        AlertDialogsPage alertDialogsPage = new AlertDialogsPage(driver);
        String expected = "Lorem ipsum dolor sit aie consectetur adipiscing";

        //Go from Main Menu to App by clicking App

        mainMenuPage.clickApp();
        appPage.clickAlertDialogs();
        alertDialogsPage.clickDialogMessage();

        DialogWMessagePage dialogWMessagePage = new DialogWMessagePage(driver);
        String actual = dialogWMessagePage.getMessageText();

        dialogWMessagePage.clickOk();
        Assert.assertTrue(actual.contains(expected));
    }

    @Test
    public void LongMessageTest() throws Exception {

        MainMenuPage mainMenuPage =  new MainMenuPage(driver);
        mainMenuPage.clickApp();

        AppPage appPage = new AppPage(driver);
        appPage.clickAlertDialogs();

        AlertDialogsPage alertDialogsPage = new AlertDialogsPage(driver);
        alertDialogsPage.clickDialogWLongMessage();

        DialogWLongMessagePage dialogWLongMessagePage = new DialogWLongMessagePage(driver);
        int expected = 30;
        int actual = dialogWLongMessagePage.getMessageText().length();

        Assert.assertTrue(actual > expected);
    }

    @Test
    public void UltraLongMessageTest() throws Exception {

        MainMenuPage mainMenuPage =  new MainMenuPage(driver);
        mainMenuPage.clickApp();

        AppPage appPage = new AppPage(driver);
        appPage.clickAlertDialogs();

        AlertDialogsPage alertDialogsPage = new AlertDialogsPage(driver);
        alertDialogsPage.clickDialogWLongMessage();

        DialogWLongMessagePage dialogWLongMessagePage = new DialogWLongMessagePage(driver);
        int expected = 30;
        int actual = dialogWLongMessagePage.getMessageText().length();

        Assert.assertTrue(actual > expected);
    }

    @Test
    public void ListDialogTest() throws Exception {

        MainMenuPage mainMenuPage =  new MainMenuPage(driver);
        mainMenuPage.clickApp();

        AppPage appPage = new AppPage(driver);
        appPage.clickAlertDialogs();

        AlertDialogsPage alertDialogsPage = new AlertDialogsPage(driver);
        alertDialogsPage.clickDialogWLongMessage();

        ListDialogPage listDialogPage = new ListDialogPage(driver);

        listDialogPage.clickCommandOne();

        String expected = "You selected:";
        CommandOnePage commandOnePage = new CommandOnePage();
        String actual = commandOnePage.getCommmandOnePageTxt();

        Assert.assertTrue(actual.contains(expected));
    }
}