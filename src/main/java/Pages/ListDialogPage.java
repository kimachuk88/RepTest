package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

public class ListDialogPage {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public WebElement getCommandOne() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]");
    }

    public CommandOnePage clickCommandOne() throws Exception {
        getCommandOne().click();
        return new CommandOnePage();
    }

    public WebElement getCommandTwo() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]");
    }

    public CommandTwoPage clickCommandTwo() throws Exception {
        getCommandTwo().click();
        return new CommandTwoPage();
    }

    public WebElement getCommandThree() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[3]");
    }

    public CommandThreePage clickCommandThree() throws Exception {
        getCommandThree().click();
        return new CommandThreePage();
    }

    public WebElement getCommandFour() throws Exception {
        return Search.XPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[4]");
    }

    public CommandFourPage clickCommandFour() throws Exception {
        getCommandFour().click();
        return new CommandFourPage();
    }
}
