package Tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.Collection;

public interface ISearch {


    WebElement GetWebElement(By by);


    Collection<WebElement> GetWebElements(By by);

    boolean StalenessOf(WebElement IWebElement);

    // Search Element


    WebElement Id(String id) throws Exception;

    WebElement XPath(String xpath) throws Exception;

    WebElement ClassName(String className) throws Exception;

    // Get List

    Collection<WebElement> XPaths(String xpath) throws Exception;

    Collection<WebElement> ClassNames(String className) throws Exception;



}

