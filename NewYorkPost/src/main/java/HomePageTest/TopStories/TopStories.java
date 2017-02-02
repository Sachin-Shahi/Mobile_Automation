package HomePageTest.TopStories;

import HomePageTest.UiMainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DAGR8DON on 2/1/17.
 */
public class TopStories extends UiMainPage {
    @FindBy(how = How.XPATH, using = "//android.support.v7.widget.RecyclerView[1]/android.widget.RelativeLayout")
    List<WebElement> elements = new ArrayList<>();

    public void Iteration() throws InterruptedException {
        System.out.println("Size of the Array is ----->"+elements.size());
        for (int i = 0; i < elements.size(); i++) {

            System.out.println(elements.get(i).getTagName());
            elements.get(i).click();
            sleep(5);
            ad.navigate().back();
        }
    }
}