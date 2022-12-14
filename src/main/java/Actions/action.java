package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class action {

    public static void navegateToUrl(WebDriver myBrowser, String url) {
        myBrowser.navigate().to(url);
    }

    public static void clickElement (WebDriver myBrowser, By target){
        JavascriptExecutor js = (JavascriptExecutor) myBrowser;
        js.executeScript("window.scrollBy(0,1200)", "");
        if (myBrowser.findElements(target).size() > 0) {
            myBrowser.findElement(target).click();
        }
    }
}
