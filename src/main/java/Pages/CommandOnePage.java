package Pages;

import Tools.ISearch;

public class CommandOnePage {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getCommmandOnePageTxt() throws Exception {
        return Search.Id("android:id/message").getText();
    }
}
