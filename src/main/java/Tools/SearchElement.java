package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collection;

public class SearchElement implements ISearch {

    //private ApplicationSource applicationSource;

    public ASearch Search;

    public ASearch getSearch() {
        return Search;
    }

    public void setSearch(ASearch Search) {
        this.Search = Search;
    }

    public WebElement GetWebElement(By by) {
        return Search.GetWebElement(by);
    }

    public Collection<WebElement> GetWebElements(By by) {
        return Search.GetWebElements(by);
    }

    public boolean StalenessOf(WebElement webElement) {
        return Search.StalenessOf(webElement);
    }

    public WebElement Id(String id) throws Exception{
        return Search.Id(id);
    }

    public WebElement XPath(String xpath) throws Exception {
        return Search.XPath(xpath);
    }

    public WebElement ClassName(String className) throws Exception{
        return Search.ClassName(className);
    }


    public Collection<WebElement> XPaths(String xpath) throws Exception {
        return Search.XPaths(xpath);
    }

    public Collection<WebElement> ClassNames(String className) throws Exception {
        return Search.ClassNames(className);
    }

}