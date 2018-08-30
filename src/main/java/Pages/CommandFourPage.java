package Pages;

import Tools.ISearch;
import Tools.TestRunner;

public class CommandFourPage extends TestRunner {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getCommmandFourPageTxt() throws Exception {
        return Search.Id("android:id/message").getText();
    }
}
