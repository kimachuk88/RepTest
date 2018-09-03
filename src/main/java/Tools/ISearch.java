package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collection;

public interface ISearch {

    WebElement GetWebElement(By by);

    boolean StalenessOf(WebElement WebElement);

    Collection<WebElement> GetWebElements(By by);

    WebElement Id(String id);

    WebElement XPath(String xpath);

    WebElement ClassName(String className);

    // Get List

    Collection<WebElement> XPaths(String xpath);

    Collection<WebElement> ClassNames(String className);


    //WebElement GetWebElement(By by, WebElement fromWebElement);

    //Collection<WebElement> GetWebElements(By by, WebElement fromWebElement);

    //WebElement Name(String name);

    //WebElement CssSelector(String cssSelector);

    //WebElement PartialLinkText(String partialLinkText);

    //WebElement LinkText(String linkText);

    WebElement TagName(String tagName);

    //// Search From Element

    //WebElement Id(String id, WebElement fromWebElement);

    //WebElement Name(String name, WebElement fromWebElement);

    //WebElement XPath(String xpath, WebElement fromWebElement);

    //WebElement CssSelector(String cssSelector, WebElement fromWebElement);

    //WebElement ClassName(String className, WebElement fromWebElement);

    //WebElement PartialLinkText(String partialLinkText, WebElement fromWebElement);

    //WebElement LinkText(String linkText, WebElement fromWebElement);

    //WebElement TagName(String tagName, WebElement fromWebElement);

    //// Get List

    //Collection<WebElement> Names(String name);

    //Collection<WebElement> XPaths(String xpath, WebElement fromWebElement);

    //Collection<WebElement> CssSelectors(String cssSelector);

    //Collection<WebElement> PartialLinkTexts(String partialLinkText);

    //Collection<WebElement> LinkTexts(String linkText);

    //Collection<WebElement> TagNames(String tagName);

}