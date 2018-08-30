import Pages.AlertDialogsPage;
import Pages.AppPage;
import Pages.DialogWMessagePage;
import Pages.MainMenuPage;
import Tools.TestRunner;
import org.junit.Assert;
import org.junit.Test;

public class MainTest extends TestRunner {

    @Test
    public void FirstTest() throws Exception {


        String expected = "Lorem ipsum dolor sit aie consectetur adipiscing";
        //Go from Main Menu to App by clicking App
        MainMenuPage mainMenuPage =  new MainMenuPage(driver);
        mainMenuPage.clickApp();

        AppPage appPage = new AppPage(driver);
        appPage.clickAlertDialogs();
        //Thread.sleep(2000);

        AlertDialogsPage alertDialogsPage = new AlertDialogsPage(driver);
        alertDialogsPage.clickDialogMessage();
        //Thread.sleep(2000);

        DialogWMessagePage dialogWMessagePage = new DialogWMessagePage(driver);
        String actual = dialogWMessagePage.getMessageText();
        //Thread.sleep(2000);

        dialogWMessagePage.clickOk();
        //Thread.sleep(2000);

        Assert.assertTrue(actual.contains(expected));
        //Assert.assertEquals(expected, actual);
        //Thread.sleep(2000);



        /*
        //Working code
        mainMenuPage.clickOS();

        OSPage osPage = new OSPage(driver);
        osPage.clickSMSMessaging();
        Thread.sleep(2000);
        */


    }

}