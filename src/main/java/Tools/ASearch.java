package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collection;

public abstract class ASearch implements ISearch {
    private final String NO_SUCH_ELEMENT = "Unable to locate element(s):";

    // Abstract Methods

    public abstract WebElement GetWebElement(By by);

    //public abstract WebElement GetWebElement(By by, WebElement fromIWebElement);

    public abstract Collection<WebElement> GetWebElements(By by);

    //public abstract Collection<WebElement> GetWebElements(By by, WebElement fromIWebElement);

    public abstract boolean StalenessOf(WebElement WebElement);

    public abstract void RemoveWaits();

    // Search WebElements

    private WebElement SearchWebElement(By by) throws Exception {
        try
        {
            return GetWebElement(by);
        }
        catch (Exception e)
        {
            throw new Exception(NO_SUCH_ELEMENT);
        }
    }

       private Collection<WebElement> SearchWebElements(By by) throws Exception {
        try
        {
            return GetWebElements(by);
        }
        catch (Exception e)
        {
            throw new Exception(NO_SUCH_ELEMENT);
        }
    }

    // Implemented Interface Tools.ISearch

    // Search Element

    public WebElement Id(String id) throws Exception
    {
        return SearchWebElement(By.id(id));
    }

    public WebElement XPath(String xpath) throws Exception
    {
        return SearchWebElement(By.xpath(xpath));
    }

    public WebElement CssSelector(String cssSelector) throws Exception
    {
        return SearchWebElement(By.cssSelector(cssSelector));
    }

    public WebElement ClassName(String className) throws Exception
    {
        return SearchWebElement(By.className(className));
    }
    // Get List


    public Collection<WebElement> XPaths(String xpath) throws Exception
    {
        return SearchWebElements(By.xpath(xpath));
    }

    public Collection<WebElement> ClassNames(String className) throws Exception
    {
        return SearchWebElements(By.className(className));
    }

}


