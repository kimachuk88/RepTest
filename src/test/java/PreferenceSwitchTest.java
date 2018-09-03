import Tools.TestRunner;
import org.junit.Assert;
import org.junit.Test;

public class PreferenceSwitchTest extends TestRunner {

    @Test
    public void PreferenceSwitchAll(){

        mainMenuPage.clickPreference().clickSwitch();
        boolean checkboxState = switchPage.isCheckBoxSelected();
        switchPage.clickCheckboxPreference();

        boolean switchPreferenceFirstState = switchPage.isSwitchPreferenceFirstSelected();
        switchPage.selectSwitchPreferenceFirst();

        boolean switchPreferenceSecondState = switchPage.isSwitchPreferenceSecondSelected();
        switchPage.selectSwitchPreferenceSecond();

        if(!checkboxState && !switchPreferenceFirstState && !switchPreferenceSecondState) {
            return;
        }
    }
}
