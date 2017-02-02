package SearchBtnTest;

import common.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by DAGR8DON on 1/31/17.
 */
public class SearchButton extends Base {
    @FindBy(how = How.XPATH, using = "//android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]")
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = "//android.widget.TextView[1]")
    public WebElement typeSearch;

    public void Search() throws InterruptedException {
        searchButton.click();
        typeSearch.sendKeys("Donald Trump", Keys.ENTER);
        sleep(5);


    }


}
