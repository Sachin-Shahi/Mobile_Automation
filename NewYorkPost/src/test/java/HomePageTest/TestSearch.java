package HomePageTest;

import SearchBtnTest.SearchButton;
import org.openqa.selenium.support.PageFactory;

import static common.Base.ad;

/**
 * Created by DAGR8DON on 2/1/17.
 */
public class TestSearch {
    //@Test
    public void search() throws InterruptedException {
        SearchButton searchButton= PageFactory.initElements(ad, SearchButton.class);
        searchButton.Search();
    }

}
