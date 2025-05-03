package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserRegisterationPage;
import Utilities.Helper;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class UserRegisterationTest extends TestBase{
    public HomePage homePageObject;
    public UserRegisterationPage UserRegisterationPageObject;
    public LoginPage LoginPageObject;
    @Test(priority = 1, groups = {"Pregression"})
    public void UserRegisterationSucessfully(){
 /*       homePageObject = new HomePage(driver);
        homePageObject.OpenRegisterationLink();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gender-male")));


     UserRegisterationPageObject = new UserRegisterationPage(driver);
        UserRegisterationPageObject.userRegisteration(
                "Hossam",
                "Hussein",
                "Hossam111@gmail.com",
                "Password@123456",
                "Password@123456"
        );*/
        System.out.println("Yes");
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
