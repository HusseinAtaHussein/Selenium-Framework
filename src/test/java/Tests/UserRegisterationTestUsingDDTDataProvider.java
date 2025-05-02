package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class UserRegisterationTestUsingDDTDataProvider extends TestBase{
    public HomePage homePageObject;
    public UserRegisterationPage UserRegisterationPageObject;
    public LoginPage LoginPageObject;
    @DataProvider(name = "TestData")
    public static Object[][] userData() {
        return new Object[][] {
                {"Hossam", "Hussein", "Hossam111@gmail.com", "Password@123456", "Password@123456"},
                {"Hossam2", "Hussein2", "Hossam1112@gmail.com", "Password@1234567", "Password@1234567"}
        };
    }
    @Test(priority = 1,dataProvider = "TestData")
    public void UserRegisterationSucessfully(String fName,String lName,String email,String password,String cPassword){
        homePageObject = new HomePage(driver);
        homePageObject.OpenRegisterationLink();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));


     UserRegisterationPageObject = new UserRegisterationPage(driver);
        UserRegisterationPageObject.userRegisteration(
                fName,
                lName,
                email,
                password,
                cPassword
        );
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    /*@Test(priority = 2,dependsOnMethods = "UserRegisterationSucessfully")
    public void RegisterUserCanLogout(){
        UserRegisterationPageObject.logout();
    }
    @Test(priority = 3,dependsOnMethods = "RegisterUserCanLogout")
    public void login(){
        homePageObject.OpenLoginPage();
        LoginPageObject = new LoginPage(driver);
        LoginPageObject.userLogin("Email@gmail.com","register?returnUrl=%2F");
    }
    @AfterMethod
    public void takeScreenShot(ITestResult It) throws IOException {
        if(It.getStatus() == ITestResult.FAILURE){
            System.out.println("Failed");
            Helper.captureScreenShot(driver,"UserRegisteration");
        }
    }*/
}
