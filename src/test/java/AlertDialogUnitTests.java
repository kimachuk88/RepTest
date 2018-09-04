import Pages.*;
import Tools.TestRunner;
import org.junit.Assert;
import org.junit.Test;

public class AlertDialogUnitTests extends TestRunner {


    @Test
    public void MessageTest() throws Exception {

        //Expected result
        String expected = "Lorem ipsum dolor sit aie consectetur adipiscing";

        //Navigate
        mainMenuPage.clickApp();
        appPage.clickAlertDialogs();
        alertDialogsPage.clickDialogMessage();

        //Read actual result
        String actual = dialogWMessagePage.getMessageText();

        //Compare
        Assert.assertTrue(actual.contains(expected));
    }

    @Test
    public void LongMessageTest() throws Exception {

        //Expected result
        int expected = 30;

        //Navigate
        mainMenuPage.clickApp();
        appPage.clickAlertDialogs();
        alertDialogsPage.clickDialogWLongMessage();

        //Read actual result
        int actual = dialogWLongMessagePage.getMessageText().length();

        //Compare
        Assert.assertTrue(actual > expected);
    }

    @Test
    public void UltraLongMessageTest() throws Exception {

        //Expected result
        int expected = 30;

        //Navigate
        mainMenuPage.clickApp();
        appPage.clickAlertDialogs();
        alertDialogsPage.clickDialogWULongMessage();

        //Read actual result
        int actual = dialogWULongMessagePage.getMessageText().length();

        //Compare
        Assert.assertTrue(actual > expected);
    }

    @Test
    public void ListDialogButtonsTest() throws Exception {

        //Expected result
        String expected = "You selected: 0 , Command one";

        //Navigate
        mainMenuPage.clickApp();
        appPage.clickAlertDialogs();
        alertDialogsPage.clickListDialog();
        listDialogPage.clickCommandOne();

        //Read actual result
        String actual = commandOnePage.getCommmandOnePageTxt();

        //Compare
        Assert.assertTrue(actual.contains(expected));
    }
}