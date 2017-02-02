package HomePageTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 2/2/17.
 */
public class NewsItemsTest {
    public class AboutMenuItems extends UiMainPage {
        public UiMainPage mainPage() {
            return PageFactory.initElements(ad, UiMainPage.class);
        }

        @Test
        public void TestNewsItems() throws InterruptedException {
            mainPage().getNews().ClickItems();
            sleep(5);
        }
    }
}
