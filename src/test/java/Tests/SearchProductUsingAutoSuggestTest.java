package Tests;

import Pages.SearchPage;
import org.testng.annotations.Test;

public class SearchProductUsingAutoSuggestTest extends TestBase{
    String SearchText = "mac";
    SearchPage searchPage;
    @Test
    public void Search() throws InterruptedException {
        searchPage = new SearchPage(driver);
        searchPage.autoSuggestSearch(SearchText);
    }
}
