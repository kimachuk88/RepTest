package Pages;

import Tools.TestRunner;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProSpinnerDialogPage extends TestRunner {

    //Map ProSpinnerDialogPage
    @FindBy(id = "android:id/alertTitle")
    private WebElement selectHeaderText;

    //Actions

    private String getHeaderText() {
        return selectHeaderText.getText();
    }
}
