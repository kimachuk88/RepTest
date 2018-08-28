package Pages;

import Tools.ISearch;

public class CommandThreePage {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getCommmandThreePageTxt() throws Exception {
        return Search.Id("android:id/message").getText();
    }
}

