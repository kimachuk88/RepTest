import Tools.TestRunner;
import org.junit.Assert;
import org.junit.Test;


public class PreferenceSwitchTest extends TestRunner {

    @Test
    public void PreferenceSwitchAll() {

        mainMenuPage.clickPreference();
        preferencePage.clickSwitch();
        boolean checkboxState = switchPage.isCheckBoxSelected();
        switchPage.clickCheckboxPreference();

        boolean switchPreferenceFirstState = switchPage.isSwitchPreferenceFirstSelected();
        switchPage.selectSwitchPreferenceFirst();

        boolean switchPreferenceSecondState = switchPage.isSwitchPreferenceSecondSelected();
        switchPage.selectSwitchPreferenceSecond();

        if (!checkboxState && !switchPreferenceFirstState && !switchPreferenceSecondState) {
            return;
        }
    }

    @Test
    public void DeselectAllIfSelected() {
        mainMenuPage.clickPreference();
        preferencePage.clickSwitch();

        if (switchPage.isCheckBoxSelected()) {
            switchPage.clickCheckboxPreference();

        } else {
            System.out.println("CheckBox has been already deselected");
        }

        if (switchPage.isSwitchPreferenceFirstSelected()) {
            switchPage.selectSwitchPreferenceFirst();
        } else {
            System.out.println("First switch preference has been already deselected");
        }

        if (switchPage.isSwitchPreferenceSecondSelected()) {
            switchPage.selectSwitchPreferenceSecond();

        } else {
            System.out.println("Second switch preference has been already deselected");
        }

        boolean checkboxState = switchPage.isCheckBoxSelected();
        boolean switchPreferenceFirstState = switchPage.isSwitchPreferenceFirstSelected();
        boolean switchPreferenceSecondState = switchPage.isSwitchPreferenceSecondSelected();

        Assert.assertFalse(checkboxState);
        Assert.assertFalse(switchPreferenceFirstState);
        Assert.assertFalse(switchPreferenceSecondState);
    }

    @Test
    public void SelectAllIfDeselected() {
        mainMenuPage.clickPreference();
        preferencePage.clickSwitch();

        if (!switchPage.isCheckBoxSelected()) {
            switchPage.clickCheckboxPreference();

        } else {
            System.out.println("CheckBox has been already selected");
        }

        if (!switchPage.isSwitchPreferenceFirstSelected()) {
            switchPage.selectSwitchPreferenceFirst();
        } else {
            System.out.println("First switch preference has been already selected");
        }

        if (!switchPage.isSwitchPreferenceSecondSelected()) {
            switchPage.selectSwitchPreferenceSecond();

        } else {
            System.out.println("Second switch preference has been already selected");
        }

        boolean checkboxState = switchPage.isCheckBoxSelected();
        boolean switchPreferenceFirstState = switchPage.isSwitchPreferenceFirstSelected();
        boolean switchPreferenceSecondState = switchPage.isSwitchPreferenceSecondSelected();

        Assert.assertTrue(checkboxState);
        Assert.assertTrue(switchPreferenceFirstState);
        Assert.assertTrue(switchPreferenceSecondState);
    }
}
