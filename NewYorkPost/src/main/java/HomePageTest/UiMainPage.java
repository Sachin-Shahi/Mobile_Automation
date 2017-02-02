package HomePageTest;

import HomePageTest.About.About;
import HomePageTest.News.News;
import HomePageTest.TopStories.TopStories;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Sachin on 29-01-2017.
 */
public class UiMainPage extends Base {
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.ImageButton[1]")
    public WebElement menuButton;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.support.v7.widget.LinearLayoutCompat[1]/android.widget.TextView[1]")
    public WebElement btnSearch;
    @FindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtPageHeading;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.LinearLayout[1]/android.widget.ImageView[1]")
    public WebElement imgPageHeading;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.view.View[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtSectionTopHeadline;
    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.support.v4.widget.DrawerLayout[1]/android.widget.RelativeLayout[1]/android.widget.FrameLayout[2]/android.support.v4.view.ViewPager[1]/android.widget.RelativeLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout[1]/android.widget.TextView[1]")
    public WebElement txtNewsItemHeadline;
    @FindBy(xpath = "//android.widget.ListView[1]/android.widget.RelativeLayout")
    List<WebElement> mainMenu = new ArrayList<>();
    @FindBy(xpath = "//android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.Button")
    List<WebElement> alertTendingNews = new ArrayList<>();


    ArrayList <String> list=new ArrayList<String>(Arrays.asList("TOP STORIES","SAVED ARTICLES","NEWS","METRO","PAGE SIX","SPORTS","BUSINESS","OPINION","ENTERTAINMENT","FASHION","LIVING","MEDIA","TECH","REAL ESTATE","PHOTOS","VIDEO","ABOUT"));
    //String mainMenuArr[] = {"TOP STORIES","SAVED ARTICLES","NEWS","METRO","PAGE SIX","SPORTS","BUSINESS","OPINION","ENTERTAINMENT","FASHION","LIVING","MEDIA","TECH","REAL ESTATE","PHOTOS","VIDEO","ABOUT"};


    public void getMenu(){
        menuButton.click();
    }

    public TopStories getTopStories(){
        getMenu();
        System.out.println(list.get(0));
        scrollAndClickByName(list.get(0));
        System.out.println(txtPageHeading.getText());
        Assert.assertTrue(txtPageHeading.getText().contains("TOP STORIES"));
        return PageFactory.initElements(ad, TopStories.class);
    }
    public void getSavedArticles(){
        getMenu();
        scrollAndClickByName(list.get(1));
        Assert.assertTrue(txtPageHeading.getText().contains("SAVED ARTICLES"));
    }
    public News getNews(){
        getMenu();
        scrollAndClickByName(list.get(2));
        Assert.assertTrue(txtPageHeading.getText().contains("NEWS"));
        return PageFactory.initElements(ad, News.class);
    }
    public void getMetro(){
        getMenu();
        scrollAndClickByName(list.get(3));
        Assert.assertTrue(txtPageHeading.getText().contains("METRO"));
    }
    public void getPageSix(){
        getMenu();
        scrollAndClickByName(list.get(4));
        System.out.println(imgPageHeading.getSize().width);
        System.out.println(imgPageHeading.getSize().height);
        Assert.assertTrue(imgPageHeading.getSize().width==229);
        Assert.assertTrue(imgPageHeading.getSize().height==54);
    }
    public void getSports(){
        getMenu();
        scrollAndClickByName(list.get(5));
        Assert.assertTrue(txtPageHeading.getText().contains("SPORTS"));
    }
    public void getBusiness(){
        getMenu();
        scrollAndClickByName(list.get(6));
        Assert.assertTrue(txtPageHeading.getText().contains("BUSINESS"));
    }
    public void getOpinion(){
        getMenu();
        scrollAndClickByName(list.get(7));
        Assert.assertTrue(txtPageHeading.getText().contains("OPINION"));
    }
    public void getEntertainment(){
        getMenu();
        scrollAndClickByName(list.get(8));
        Assert.assertTrue(txtPageHeading.getText().contains("ENTERTAINMENT"));
    }
    public void getFashion(){
        getMenu();
        scrollAndClickByName(list.get(9));
        Assert.assertTrue(txtPageHeading.getText().contains("FASHION"));
    }
    public void getLiving(){
        getMenu();
        scrollAndClickByName(list.get(10));
        Assert.assertTrue(txtPageHeading.getText().contains("LIVING"));
    }
    public void getMedia(){
        getMenu();
        scrollAndClickByName(list.get(11));
        Assert.assertTrue(txtPageHeading.getText().contains("MEDIA"));
    }
    public void getTech(){
        getMenu();
        scrollAndClickByName(list.get(12));
        Assert.assertTrue(txtPageHeading.getText().contains("TECH"));
    }
    public void getRealEstate(){
        getMenu();
        scrollAndClickByName(list.get(13));
        Assert.assertTrue(txtPageHeading.getText().contains("REAL ESTATE"));
    }
    public void getPhotots(){
        getMenu();
        scrollAndClickByName(list.get(14));
        Assert.assertTrue(txtPageHeading.getText().contains("PHOTOS"));
    }
    public void getVideo(){
        getMenu();
        scrollAndClickByName(list.get(15));
        Assert.assertTrue(txtPageHeading.getText().contains("VIDEO"));
    }
    public About getAbout() {
        getMenu();
        scrollAndClickByName(list.get(16));
        Assert.assertTrue(txtPageHeading.getText().contains("ABOUT"));
        return new About();
    }
}
