package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class ProductHoverMenuTest extends TestBase{
    HomePage homePageObject;
    @Test
    public void HoverToMenu() throws InterruptedException {
        homePageObject = new HomePage(driver);
        homePageObject.HoverToElement();
    }
}
