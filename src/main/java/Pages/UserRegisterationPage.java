package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserRegisterationPage extends PageBase{
    public UserRegisterationPage(WebDriver driver) {
        super(driver);
    }
    //Only Required Fieleds is defined
    @FindBy(id = "gender-male")
    WebElement maleRdBtn;
    @FindBy(id="FirstName")
    WebElement firstNameTxtBox;
    @FindBy(id="LastName")
    WebElement lastNameTxtBox;
    @FindBy(id="Email")
    WebElement emailTxtBox;
    @FindBy(id = "Password")
    WebElement PasswordTxtBox;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxtBox;
    @FindBy(id = "register-button")
    WebElement registerSubmitBtn;
    @FindBy(css = "div.result")
    public WebElement resultMessageForRegisteration;
    @FindBy(linkText = "Log out")
    WebElement logoutLink;
    @FindBy(linkText = "My account")
    WebElement myAccountLink;
    public void userRegisteration(String firstName,String lastName,String email,String password,String confirmPassword){
        BtnClick(maleRdBtn);
        setTextWebElementText(firstNameTxtBox,firstName);
        setTextWebElementText(lastNameTxtBox,lastName);
        setTextWebElementText(emailTxtBox,email);
        setTextWebElementText(PasswordTxtBox,password);
        setTextWebElementText(confirmPasswordTxtBox,confirmPassword);
        BtnClick(registerSubmitBtn);
    }
    public void logout(){
        BtnClick(logoutLink);
    }
    public void myAccountBtn(){
        BtnClick(myAccountLink);
    }
}
