package Tests;

import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase{
    SearchPage searchPage;
    String ProductName = "mac";
    @Test
    public void SearchProduct(){
        searchPage = new SearchPage(driver);
        searchPage.Search(ProductName);
    }
}
