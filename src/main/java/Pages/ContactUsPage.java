package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends PageBase {
    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "FullName")
    WebElement nameTxtBox;
    @FindBy(id = "Email")
    WebElement emailTxtBox;
    @FindBy(id ="Enquiry")
    WebElement enquiryTxtBox;
    @FindBy(css = "button.button-1.contact-us-button")
    WebElement submitBtn;
    public void SubmitEnquery(String Name,String Email,String Enquery){
        setTextWebElementText(nameTxtBox,Name);
        setTextWebElementText(emailTxtBox,Email);
        setTextWebElementText(enquiryTxtBox,Enquery);
        BtnClick(submitBtn);
    }
}
