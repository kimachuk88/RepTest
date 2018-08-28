package Pages;

import Tools.ISearch;

public class ProSpinnerDialogPage {
    private ISearch Search;

    public ISearch getSearch() {
        return Search;
    }

    public void setSearch(ISearch search) {
        Search = search;
    }

    public String getHeaderText() throws Exception {
        return Search.Id("android:id/alertTitle").getText();
    }
}
