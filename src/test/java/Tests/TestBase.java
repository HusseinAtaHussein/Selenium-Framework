package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;

public class TestBase extends AbstractTestNGCucumberTests {
    public static WebDriver driver;
    @BeforeSuite
    @Parameters({"Browser"})
    public void OpenDriver(@Optional("Chrome") String BrowserName){
        if(BrowserName.equals("Chrome")) {
            driver = new ChromeDriver();
        }
        else if(BrowserName.equals("FireFox")){
            driver = new FirefoxDriver();
        }
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterSuite
    public void CloseDriver(){

        //driver.quit();
    }
}
