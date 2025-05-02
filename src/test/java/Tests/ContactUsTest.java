package Tests;

import Pages.ContactUsPage;
import Pages.HomePage;
import org.testng.annotations.Test;

public class ContactUsTest extends TestBase{
    HomePage homePageObject;
    ContactUsPage contactUsPageObject;
    String Name = "Ahmed";
    String Email = "Ahmed@gmail.com";
    String Enquery = "This is US";
    @Test
    public void ContactUS(){
        homePageObject = new HomePage(driver);
        contactUsPageObject = new ContactUsPage(driver);
        homePageObject.OpenContactUsLink();
        contactUsPageObject.SubmitEnquery(Name,Email,Enquery);
    }
}
