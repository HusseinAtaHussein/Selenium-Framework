package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Helper {
    public static void captureScreenShot(WebDriver driver,String ScreenShotName) throws IOException {
           try{
            // Create a folder if not exists
            File folder = new File("./ScreenShots/");
            if (!folder.exists())
            {
                folder.mkdir();
            }
            TakesScreenshot ts = (TakesScreenshot) driver;
            File source = ts.getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(source, new File("./ScreenShots/" + ScreenShotName + ".png"));
        }
        catch(IOException ex)
        {
            System.out.println("Exception While talikng ScreenShot");
        }
    }
}
