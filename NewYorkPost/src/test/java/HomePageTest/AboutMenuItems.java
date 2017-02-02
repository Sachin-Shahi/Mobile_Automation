package HomePageTest;

import HomePageTest.About.About;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static common.Base.ad;

/**
 * Created by DAGR8DON on 2/1/17.
 */
public class AboutMenuItems extends UiMainPage {
    public UiMainPage mainPage() {
        return PageFactory.initElements(ad, UiMainPage.class);
    }

    @Test
    public void TestAbout() throws InterruptedException {
        mainPage().getAbout().Clear();
        sleep(5);
    }

    @Test
    public void testCustomer() throws InterruptedException {
        mainPage().getAbout();
        About about = new About();
        about.Customer();
        sleep(5);
    }
    @Test
    public void testPrivacy() throws InterruptedException{
        mainPage().getAbout();
        About about = new About();
        about.Privacy();
        sleep(5);
    }
    @Test
    public void testShare() throws InterruptedException{
        mainPage().getAbout();
        About about = new About();
        about.Share();
        sleep(5);
    }
    @Test
    public void testVersion() throws InterruptedException {
        mainPage().getAbout();
        About about = new About();
        about.Version();
        sleep(5);
    }
   @Test
    public void testTerms() throws InterruptedException {
        mainPage().getAbout();
        About about = new About();
        about.Terms();
        sleep(5);
    }
}
