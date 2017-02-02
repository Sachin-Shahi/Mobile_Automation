package HomePageTest.About;

import HomePageTest.UiMainPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

import static common.Base.ad;

/**
 * Created by DAGR8DON on 2/1/17.
 */
public class About {

    public About() {
        PageFactory.initElements(ad, this);
    }

    @FindBy(how = How.XPATH, using = "//android.widget.LinearLayout")
    List<WebElement> elements = new ArrayList<>();

    public void Privacy() {
        System.out.println(elements.get(0).getText());
        elements.get(0).click();
    }
    public void Terms() {
        System.out.println(elements.get(1).getText());
        elements.get(1).click();
    }
    public void Customer() {
        System.out.println(elements.get(2).getText());
        elements.get(2).click();
    }
    public void Share() {
        System.out.println(elements.get(3).getText());
        elements.get(3).click();
    }
    public void Clear() {
        System.out.println(elements.get(4).getText());
        elements.get(4).click();
    }
    public void Version() {
        System.out.println(elements.get(5).getText());
        elements.get(5).click();
    }

}


