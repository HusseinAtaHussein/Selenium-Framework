package Steps;

import Pages.HomePage;
import Pages.UserRegisterationPage;
import Tests.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class UserRegisteration extends TestBase {
    public HomePage homePageObject;
    public UserRegisterationPage UserRegisterationPageObject;
    @Given("the user in the home page")
    public void the_user_in_the_home_page() {
        homePageObject = new HomePage(driver);
        homePageObject.OpenRegisterationLink();
    }
    @When("I click on register link")
    public void i_click_on_register_link() {
        Assert.assertTrue(driver.getTitle().contains("register"));
    }
    @When("I entered the user data")
    public void i_entered_the_user_data() throws InterruptedException {
        /*Thread.sleep(3000);
        UserRegisterationPageObject = new UserRegisterationPage(driver);
        UserRegisterationPageObject.userRegisteration(
                "Hossam222",
                "Hussein222",
                "Hossam11122@gmail.com",
                "Password@12345622",
                "Password@12345622"
        );*/
    }
    @Then("The registeration page displayed sucessfully")
    public void the_registeration_page_displayed_sucessfully() {
        System.out.println("Yes");
    }
}
