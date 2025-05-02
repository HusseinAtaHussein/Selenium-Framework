package Tests;

import Pages.ProductDetailsPage;
import Pages.WishListPage;
import org.testng.annotations.Test;

public class AddToWishListTest extends TestBase{
    public ProductDetailsPage productDetailsPageObject;
    public WishListPage wishListPageObject;
    /*@Test
    public void AddToWishList() throws InterruptedException {
        productDetailsPageObject = new ProductDetailsPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/apple-macbook-pro");
        Thread.sleep(3000);
        productDetailsPageObject.addToWithList();
    }*/
    @Test
    public void DeleteFromWishList(){
        wishListPageObject = new WishListPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/wishlist");
        //wishListPageObject.removeProductFromWishList();
    }
}
