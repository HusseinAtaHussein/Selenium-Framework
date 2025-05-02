package Tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
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
        else if(BrowserName.equals("HeadlessCromeBrowser")){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless"); // Run in headless mode
            chromeOptions.addArguments("--disable-gpu"); // Disable GPU acceleration (for Windows)
            chromeOptions.addArguments("--window-size=1920,1080"); // Set window size for proper rendering
            chromeOptions.addArguments("--no-sandbox"); // Bypass OS security model (important for CI/CD)
            chromeOptions.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems in Docker
            chromeOptions.addArguments("--remote-allow-origins=*"); // To avoid origin errors (especially with newer Chrome versions)
            chromeOptions.addArguments("--disable-extensions"); // Disable extensions
            chromeOptions.addArguments("--disable-infobars"); // Disable "Chrome is being controlled..." message
            chromeOptions.addArguments("--start-maximized"); // Start maximized (helps rendering in some cases)
            chromeOptions.addArguments("--ignore-certificate-errors"); // Ignore SSL errors

// Optional: for specific environments
            chromeOptions.setExperimentalOption("useAutomationExtension", false);
            driver = new ChromeDriver(chromeOptions);

        }
        driver.get("https://demo.nopcommerce.com/");
    }
    @AfterSuite
    public void CloseDriver(){

        //driver.quit();
    }
}
