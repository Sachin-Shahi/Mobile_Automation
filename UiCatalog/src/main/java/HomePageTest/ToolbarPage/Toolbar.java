package HomePageTest.ToolbarPage;

import HomePageTest.WebPage.Web;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mrahman on 1/15/17.
 */
public class Toolbar extends Base {
    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIASwitch[1]")
    public WebElement switchImage;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIASwitch[2]")
    public WebElement switchTinted;

    @FindBy(xpath = "//UIAApplication[1]/UIAWindow[2]/UIAScrollView[1]/UIAPicker[1]/UIAPickerWheel[1]")
    public WebElement pickerWheel;


    public void SwitchImageButtons() throws InterruptedException {
        switchImage.getText();
        switchImage.click();
        sleep(3);
        switchImage.getText();
        switchImage.click();
    }

    public void SwitchTintedButtons() throws InterruptedException {
        switchTinted.getText();
        switchTinted.click();
        sleep(3);
        switchTinted.getText();
        switchTinted.click();
    }

    public void PickerWheel() throws InterruptedException {
        String[] picker = {"Done"};
        pickerWheel.sendKeys("Cancel");
        sleep(5);
        scrollKeys(ad, picker, "//UIAPicker[1]");
        sleep(5);
    }

}
