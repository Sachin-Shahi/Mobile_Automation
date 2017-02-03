package HomePageTest.ImgesPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Images extends Base {

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIASlider[1]")
    public WebElement slider;


    public void TouchAction() {
        slider.sendKeys(".9");
    }
}


