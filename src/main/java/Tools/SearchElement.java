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

    public WebElement Id(String id) {
        return Search.Id(id);
    }

    public WebElement XPath(String xpath) {
        return Search.XPath(xpath);
    }

    public WebElement ClassName(String className) {
        return Search.ClassName(className);
    }

    public WebElement TagName(String tagName) {
        return Search.TagName(tagName);
    }

    public Collection<WebElement> XPaths(String xpath) {
        return Search.XPaths(xpath);
    }

    public Collection<WebElement> ClassNames(String className) {
        return Search.ClassNames(className);
    }

}





    /*public SearchElement()
    {
        this.applicationSource = Application.Get().ApplicationSource;
        InitSearch();
    }
    public SearchElement(ApplicationSource applicationSource)
    {
        this.applicationSource = applicationSource;
        InitSearch();
    }
    private void InitSearch()
    {
        // TODO Use Factory Method
        Search = new SearchImplicit(applicationSource);
        //Search = new SearchExplicit(applicationSource);
    }
    public void SetStrategy(ASearch search)
    {
        Search.RemoveWaits();
        Search = search;
    }
    public void SetImplicitStrategy()
    {
        SetStrategy(new SearchImplicit(applicationSource));
    }
    public void SetExplicitStrategy()
    {
        SetStrategy(new SearchExplicit(applicationSource));
    }*/

// Implemented Interface ISearch



    /*public WebElement GetWebElement(By by, WebElement fromWebElement)
    {
        return Search.GetWebElement(by, fromWebElement);
    }*/



    /*public Collection<WebElement> GetWebElements(By by, WebElement fromWebElement)
    {
        return Search.GetWebElements(by, fromWebElement);
    }*/


// Search Element



    /*public WebElement Name(String name)
    {
        return Search.name(name);
    }*/



    /*public WebElement CssSelector(String cssSelector)
    {
        return Search.CssSelector(cssSelector);
    }*/



    /*public WebElement PartialLinkText(String partialLinkText)
    {
        return Search.PartialLinkText(partialLinkText);
    }
    public WebElement LinkText(String linkText)
    {
        return Search.LinkText(linkText);
    }*/


// Search From Element

    /*public WebElement Id(String id, WebElement fromWebElement)
    {
        return Search.Id(id, fromWebElement);
    }
    public WebElement Name(String name, WebElement fromWebElement)
    {
        return Search.Name(name, fromWebElement);
    }
    public WebElement XPath(String xpath, WebElement fromWebElement)
    {
        return Search.XPath(xpath, fromWebElement);
    }
    public WebElement CssSelector(String cssSelector, WebElement fromWebElement)
    {
        return Search.CssSelector(cssSelector, fromWebElement);
    }
    public WebElement ClassName(String className, WebElement fromWebElement)
    {
        return Search.ClassName(className, fromWebElement);
    }
    public WebElement PartialLinkText(String partialLinkText, WebElement fromWebElement)
    {
        return Search.PartialLinkText(partialLinkText, fromWebElement);
    }
    public WebElement LinkText(String linkText, WebElement fromWebElement)
    {
        return Search.LinkText(linkText, fromWebElement);
    }
    public WebElement TagName(String tagName, WebElement fromWebElement)
    {
        return Search.TagName(tagName, fromWebElement);
    }*/

// Get List

    /*public Collection<WebElement> Names(String name)
    {
        return Search.Names(name);
    }*/



    /*public Collection<WebElement> XPaths(String xpath, WebElement fromWebElement)
    {
        return Search.XPaths(xpath, fromWebElement);
    }
    public Collection<WebElement> CssSelectors(String cssSelector)
    {
        return Search.CssSelectors(cssSelector);
    }*/



    /*public Collection<WebElement> PartialLinkTexts(String partialLinkText)
    {
        return Search.PartialLinkTexts(partialLinkText);
    }
    public Collection<WebElement> LinkTexts(String linkText)
    {
        return Search.LinkTexts(linkText);
    }
    public Collection<WebElement> TagNames(String tagName)
    {
        return Search.TagNames(tagName);
    }*/
