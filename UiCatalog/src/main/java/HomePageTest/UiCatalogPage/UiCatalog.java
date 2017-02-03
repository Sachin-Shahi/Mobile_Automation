package HomePageTest.UiCatalogPage;

import common.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import HomePageTest.AlertsPage.Alerts;
import HomePageTest.ButtonsPage.Buttons;
import HomePageTest.ControlsPage.Controls;
import HomePageTest.ImgesPage.Images;
import HomePageTest.PickersPage.Picker;
import HomePageTest.SearchBarPage.SearchBar;
import HomePageTest.SegmentsPage.Segments;
import HomePageTest.TextFieldsPage.TextFields;
import HomePageTest.TextViewPage.TextView;
import HomePageTest.ToolbarPage.Toolbar;
import HomePageTest.TransitionsPage.Transitions;
import HomePageTest.WebPage.Web;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.By.xpath;

/**
 * Created by mrahman on 1/15/17.
 */
public class UiCatalog extends Base {

@FindBy(xpath=("//UIAApplication[1]/UIAWindow[2]/UIATableView[1]/UIATableCell"))
    List<WebElement> elements= new ArrayList<>();


    public Buttons getButtonPage(){

        elements.get(0).click();
        return new Buttons();
    }
    public Controls getControls(){

        elements.get(1).click();
        return new Controls();
    }
    public TextFields getTextFields(){

        elements.get(2).click();
        return new TextFields();
    }
    public SearchBar getSearchBar(){

        elements.get(3).click();
        return new SearchBar();
    }
    public TextView getTextView(){

        elements.get(4).click();
        return new TextView();
    }
    public Picker getPickers(){

        elements.get(5).click();
        return new Picker();
    }
    public Images getImages(){

        elements.get(6).click();
        return new Images();
    }
    public Web getWeb(){

        elements.get(7).click();
        return new Web();
    }
    public Segments getSegments(){

        elements.get(8).click();
        return new Segments();
    }
    public Toolbar getToolbar(){

        elements.get(9).click();
        return new Toolbar();
    }
    public Alerts getAlerts(){

        elements.get(10).click();
        return new Alerts();
    }
    public Transitions getTransitions(){

        elements.get(11).click();
        return new Transitions();
    }


}
