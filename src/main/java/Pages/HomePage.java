package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends PageBase{
    public HomePage(WebDriver driver) {
        super(driver);
        action = new Actions(driver);
    }
    @FindBy(linkText = "Register")
    WebElement RegisterLink;
    public void OpenRegisterationLink(){
        BtnClick(RegisterLink);
    }
    @FindBy(linkText = "Log in")
    WebElement LogPtn;
    public void OpenLoginPage(){
        PageBase.BtnClick(LogPtn);
    }
    @FindBy(linkText = "Contact us")
    WebElement contactUsLink;
    public void OpenContactUsLink(){
        PageBase.scrollDown(drievr);
        BtnClick(contactUsLink);
    }
    @FindBy(id="customerCurrency")
    WebElement currencyDropDown;
    public void changeCurrency(){
        Select dropDownValues = new Select(currencyDropDown);
        dropDownValues.selectByIndex(1);

    }
    @FindBy(linkText = "Computers")
    WebElement compterLink;
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;
    public void HoverToElement() throws InterruptedException {
        action.moveToElement(compterLink).perform();
        Thread.sleep(3000);
        action.moveToElement(notebooksLink).perform();
        Thread.sleep(3000);
        action.click(notebooksLink).perform();
    }
}
