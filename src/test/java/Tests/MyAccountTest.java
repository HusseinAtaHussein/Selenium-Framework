package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MyAccountPage;
import Pages.UserRegisterationPage;
import Utilities.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class MyAccountTest extends TestBase{
    MyAccountPage myAccountPage;
    public HomePage homePageObject;
    public UserRegisterationPage UserRegisterationPageObject;
    @Test(priority = 1)
    public void UserRegisterationSucessfully()
    {
        homePageObject = new HomePage(driver);
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
        );
    }
    @Test(priority = 2,dependsOnMethods = "UserRegisterationSucessfully")
    public void changePasswordFun()
    {
        myAccountPage = new MyAccountPage(driver);
        homePageObject.OpenRegisterationLink();
        myAccountPage.openChangePasswordPage();
        myAccountPage.changePassword("Password@123456","Password@123457","Password@123457");
    }
    @AfterMethod
    public void takeScreenShot(ITestResult It) throws IOException {
        if(It.getStatus() == ITestResult.FAILURE){
            System.out.println("Failed");
            Helper.captureScreenShot(driver,"MyAccount");
        }
    }
}
