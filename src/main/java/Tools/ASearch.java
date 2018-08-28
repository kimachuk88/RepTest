package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collection;

public abstract class ASearch implements ISearch {

    private final String NO_SUCH_ELEMENT = "Unable to locate element(s):";

    // Abstract Methods

    public abstract WebElement GetWebElement(By by);

    //public abstract WebElement GetWebElement(By by, WebElement fromWebElement);

    public abstract Collection<WebElement> GetWebElements(By by);

    //public abstract Collection<WebElement> GetWebElements(By by, WebElement fromWebElement);

    public abstract boolean StalenessOf(WebElement WebElement);

    public abstract void RemoveWaits();

    // Search WebElements

    private WebElement SearchWebElement(By by) throws Exception {
        try {
            return GetWebElement(by);
        } catch (Exception e) {
            //throw new ScreenCaptureException(String.format(NO_SUCH_ELEMENT, by.toString()));
            //throw new RuntimeException(String.format(NO_SUCH_ELEMENT, by.toString()));
            // TODO Develop Custom Exception
            throw new Exception(NO_SUCH_ELEMENT);
            //throw new Exception(NO_SUCH_ELEMENT);
        }
    }


    private Collection<WebElement> SearchWebElements(By by) throws Exception {
        try {
            return GetWebElements(by);
        } catch (Exception e) {
            //throw new ScreenCaptureException(String.format(NO_SUCH_ELEMENT, by.toString()));
            //throw new RuntimeException(String.format(NO_SUCH_ELEMENT, by.toString()));
            // TODO
            throw new Exception(NO_SUCH_ELEMENT);
        }
    }

    /*private Collection<WebElement> SearchWebElements(By by, WebElement fromWebElement) throws Exception {
        try {
            return GetWebElements(by, fromWebElement);
        } catch (Exception e) {
            //throw new ScreenCaptureException(String.format(NO_SUCH_ELEMENT, by.toString()));
            //throw new RuntimeException(String.format(NO_SUCH_ELEMENT, by.toString()));
            // TODO
            throw new Exception(NO_SUCH_ELEMENT);
        }
    }*/

    /* private WebElement SearchWebElement(By by, WebElement fromWebElement) throws Exception {
        try {
            return GetWebElement(by, fromWebElement);
        } catch (Exception e) {
            //throw new ScreenCaptureException(String.format(NO_SUCH_ELEMENT, by.toString()));
            //throw new RuntimeException(String.format(NO_SUCH_ELEMENT, by.toString()));
            // TODO
            throw new Exception(NO_SUCH_ELEMENT);
        }
    }*/

// Implemented Interface ISearch

// Search Element

    public WebElement id(String id) throws Exception {

        return SearchWebElement(By.id(id));
    }


    public WebElement xpath(String xpath) throws Exception {

        return SearchWebElement(By.xpath(xpath));
    }

    public WebElement cssSelector(String cssSelector) throws Exception {
        return SearchWebElement(By.cssSelector(cssSelector));
    }

    public WebElement classname(String classname) throws Exception {
        return SearchWebElement(By.className(classname));
    }

    public Collection<WebElement> xpaths(String xpath) throws Exception {
        return SearchWebElements(By.xpath(xpath));
    }

    public Collection<WebElement> classnames(String classname) throws Exception {
        return SearchWebElements(By.className(classname));
    }




    /*public WebElement PartiallinkText(String partiallinkText) {
        return SearchWebElement(By.partialLinkText(partiallinkText));
    }
    /*public WebElement linkText(String linkText) {
        return SearchWebElement(By.linkText(linkText));
    }*/

    public WebElement Tagname(String tagname) throws Exception {
        return SearchWebElement(By.tagName(tagname));
    }
}

// Search From Element

    /*public WebElement id(String id, WebElement fromWebElement) {
        return SearchWebElement(By.id(id), fromWebElement);
    }
    public WebElement name(String name, WebElement fromWebElement) {
        return SearchWebElement(By.name(name), fromWebElement);
    }
    public WebElement xpath(String xpath, WebElement fromWebElement) {
        return SearchWebElement(By.xpath(xpath), fromWebElement);
    }
    public WebElement cssSelector(String cssSelector, WebElement fromWebElement) {
        return SearchWebElement(By.cssSelector(cssSelector), fromWebElement);
    }
    public WebElement classname(String classname, WebElement fromWebElement) {
        return SearchWebElement(By.className(classname), fromWebElement);
    }
    public WebElement PartiallinkText(String partiallinkText, WebElement fromWebElement) {
        return SearchWebElement(By.partialLinkText(partiallinkText), fromWebElement);
    }
    public WebElement linkText(String linkText, WebElement fromWebElement) {
        return SearchWebElement(By.linkText(linkText), fromWebElement);
    }
    public WebElement Tagname(String tagname, WebElement fromWebElement) {
        return SearchWebElement(By.tagName(tagname), fromWebElement);
    }*/

// Get List

    /*public Collection<WebElement> names(String name) {
        return SearchWebElements(By.name(name));*/


    /*public Collection<WebElement> xpaths(String xpath, WebElement fromWebElement) {
        try {
            return SearchWebElements(By.xpath(xpath), fromWebElement);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /*public Collection<WebElement> cssSelectors(String cssSelector) {
        return SearchWebElements(By.cssSelector(cssSelector));
    }*/

    /*public Collection<WebElement> PartiallinkTexts(String partiallinkText) {
        return SearchWebElements(By.partialLinkText(partiallinkText));
    }
    public Collection<WebElement> linkTexts(String linkText) {
        return SearchWebElements(By.linkText(linkText));
    }
    public Collection<WebElement> Tagnames(String tagname) {
        return SearchWebElements(By.tagName(tagname));
        */