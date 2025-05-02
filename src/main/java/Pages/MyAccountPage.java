package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(linkText = "Change password")
    WebElement changePasswordTxt;
    @FindBy(id = "OldPassword")
    WebElement oldPasswordTxt;
    @FindBy(id = "NewPassword")
    WebElement newPasswordTxt;
    @FindBy(id = "ConfirmNewPassword")
    WebElement confirmPasswordTxt;
    @FindBy(css = "button.button-1.change-password-button")
    WebElement changePasswordBtn;
    public void openChangePasswordPage(){
        BtnClick(changePasswordTxt);
    }
    public void changePassword(String OldPassword,String newPassword,String ConfimPassword){
      setTextWebElementText(oldPasswordTxt,OldPassword);
      setTextWebElementText(newPasswordTxt,newPassword);
      setTextWebElementText(confirmPasswordTxt,ConfimPassword);
      BtnClick(changePasswordBtn);
    }
}
