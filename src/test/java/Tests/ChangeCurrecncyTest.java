package Tests;

import Pages.HomePage;
import org.testng.annotations.Test;

public class ChangeCurrecncyTest extends TestBase{
    HomePage homePageObject;
    @Test
    public void ChangeCurrencyTest(){
        homePageObject = new HomePage(driver);
        homePageObject.changeCurrency();
    }
}
