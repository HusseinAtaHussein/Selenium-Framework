package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver drievr;
    protected Actions action;
    public PageBase(WebDriver driver){
        this.drievr = driver;
        PageFactory.initElements(driver,this);
    }
    protected static void BtnClick(WebElement webElement){
        webElement.click();
    }
    protected static void setTextWebElementText(WebElement element,String value){
        element.sendKeys(value);
    }
    protected static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }
}
