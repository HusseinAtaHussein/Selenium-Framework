package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "Email")
    WebElement emailTxtBox;
    @FindBy(id = "Password")
    WebElement passwordTxtBox;
    @FindBy(css = "button.button-1.login-button")
    WebElement loginBtn;
    public void userLogin(String Email,String Password){
        setTextWebElementText(emailTxtBox,Email);
        setTextWebElementText(passwordTxtBox,Password);
        BtnClick(loginBtn);
    }
}
