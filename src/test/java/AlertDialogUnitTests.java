import Pages.*;
import Tools.TestRunner;
import org.apache.commons.collections.functors.ExceptionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.TimeUnit;

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

   @Test
   public void SingleChoiceListTest1() throws Exception {
       //Navigate
       mainMenuPage.clickApp();
       appPage.clickAlertDialogs();
       alertDialogsPage.clickRepeatAlarm();

       //Enable all

       if (!repeatAlarmPage.isEveryMondaySelected()) {
           repeatAlarmPage.clickEveryMonday();
       }
       if (!repeatAlarmPage.isEveryTuesdaySelected()) {
           repeatAlarmPage.clickEveryTuesday();
       }
       if (!repeatAlarmPage.isEveryWednesdaySelected()) {
           repeatAlarmPage.clickEveryWednesday();
       }
       if (!repeatAlarmPage.isEveryThursdaySelected()) {
           repeatAlarmPage.clickEveryThursday();
       }
       if (!repeatAlarmPage.isEveryFridaySelected()) {
           repeatAlarmPage.clickEveryFriday();
       }
       if (!repeatAlarmPage.isEverySaturdaySelected()) {
           repeatAlarmPage.clickEverySaturday();
       }
       if (!repeatAlarmPage.isEverySundaySelected()) {
           repeatAlarmPage.clickEverySunday();
       }

       //Click OK
       repeatAlarmPage.clickOk();
       alertDialogsPage.clickRepeatAlarm();

       //Check if all days are selected
       Assert.assertTrue(repeatAlarmPage.isEveryMondaySelected());
       Assert.assertTrue(repeatAlarmPage.isEveryTuesdaySelected());
       Assert.assertTrue(repeatAlarmPage.isEveryWednesdaySelected());
       Assert.assertTrue(repeatAlarmPage.isEveryThursdaySelected());
       Assert.assertTrue(repeatAlarmPage.isEveryFridaySelected());
       Assert.assertTrue(repeatAlarmPage.isEverySaturdaySelected());
       Assert.assertTrue(repeatAlarmPage.isEverySundaySelected());

   }

   @Test
   public void SingleChoiceTest2() throws Exception {

        //Expected result
       Map<Integer, String> expected = new HashMap<Integer, String>();
       expected.put(0, "Every Monday");
       expected.put(1, "Every Tuesday");
       expected.put(2, "Every Wednesday");
       expected.put(3, "Every Thursday");
       expected.put(4, "Every Friday");
       expected.put(5, "Every Saturday");
       expected.put(6, "Every Sunday");

        //Navigate
       mainMenuPage.clickApp();
       appPage.clickAlertDialogs();
       alertDialogsPage.clickRepeatAlarm();




      //Reading actual result
      Assert.assertEquals(expected, repeatAlarmPage.setActualMap());

   }
}