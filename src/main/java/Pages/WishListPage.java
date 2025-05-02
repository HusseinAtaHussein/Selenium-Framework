package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{
    public WishListPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "td.product")
    WebElement productName;
    @FindBy(tagName = "h1")
    WebElement wishListTitle;
    @FindBy(id = "updatecart")
    WebElement updateWishListBtn;
    @FindBy(css = "button.remove-btn")
    WebElement removeFromCartBtn;
    @FindBy(css = "div.no-data")
    WebElement wishListIsEmpty;
    public void removeProductFromWishList(){
       BtnClick(removeFromCartBtn);
    }

}
