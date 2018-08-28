package Pages;

import Tools.ISearch;

public class CommandFourPage extends CommonElementsPage{
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
