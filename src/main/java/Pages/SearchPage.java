package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "small-searchterms")
    WebElement searchTxt;
    @FindBy(css = "button.button-1.search-box-button")
    WebElement searchBtn;
    @FindBy(id = "ui-id-1")
    List<WebElement> productList;
    public void Search(String searchText){
        setTextWebElementText(searchTxt,searchText);
        BtnClick(searchBtn);
    }
    public void autoSuggestSearch(String searchProduct) throws InterruptedException {
        setTextWebElementText(searchTxt,searchProduct);
        try
        {
            Thread.sleep(6000);
        }catch (Exception ex)
        {
        System.out.println("Can't Find First Element");
        }
        BtnClick(productList.get(0));
        }
}
