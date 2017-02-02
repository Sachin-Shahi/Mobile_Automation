package HomePageTest.News;

import HomePageTest.UiMainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by DAGR8DON on 2/1/17.
 */
public class News extends UiMainPage {
    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[1]")
    public WebElement item1;

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[2]")
    public WebElement item2;

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[3]")
    public WebElement item3;

    @FindBy(xpath = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout[4]")
    public WebElement item4;


    public void ClickItems() {
    item1.click();
    ad.scrollTo("");
    ad.navigate().back();

    }
}