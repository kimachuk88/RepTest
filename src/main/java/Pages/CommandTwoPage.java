package Pages;

import Tools.ISearch;

public class CommandTwoPage {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getCommmandTwoPageTxt() throws Exception {
        return Search.Id("android:id/message").getText();
    }
}
