package Tests;

import Data.JsonReader;
import Data.UserDataClass;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import com.github.javafaker.Faker;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class UserRegisterationTestUsingFakeLibrary extends TestBase{
    public HomePage homePageObject;
    public UserRegisterationPage UserRegisterationPageObject;
    public LoginPage LoginPageObject;
    Faker fakeData = new Faker();
    String fName = fakeData.name().firstName();
    String lName = fakeData.name().lastName();
    String email = fakeData.internet().emailAddress();
    String password = fakeData.internet().password();
    @Test(priority = 1)
    public void UserRegisterationSucessfully(){
     /*   homePageObject = new HomePage(driver);
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
        driver.navigate().to("https://demo.nopcommerce.com/");*/
        System.out.println(fName + lName + email + password);
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
