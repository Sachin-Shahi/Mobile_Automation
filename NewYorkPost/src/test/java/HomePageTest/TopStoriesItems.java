package HomePageTest;

import HomePageTest.TopStories.TopStories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * Created by DAGR8DON on 2/2/17.
 */
public class TopStoriesItems extends UiMainPage{
    public UiMainPage uiMainPage(){
        return PageFactory.initElements(ad, UiMainPage.class);
    }

    @Test
    public void TestTopStoriesList() throws InterruptedException {
       uiMainPage().getTopStories().Iteration();
    }

}
