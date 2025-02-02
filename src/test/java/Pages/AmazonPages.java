package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPages {

    static WebDriver driver;
    static ElementHelper elementHelper;
    WebDriverWait wait;

    static By accept = By.id("sp-cc-accept");
    static By search = By.id("twotabsearchtextbox");
    static By searcbutton = By.id("nav-search-submit-button");
    static By filter = By.xpath("//span[contains(text(),'Amazon tarafından gönderilir')]");
    static By applefilter = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Apple']");
    static By firstproduct = By.xpath("//img[@alt='Apple AirPods 4 Kablosuz Kulaklık, Bluetooth Kulaklık, Aktif Gürültü Engelleme, Adaptif Ses, Şeffaf Mod, Kişiselleştirilmi...']");
    static By add = By.xpath("//input[@id='add-to-cart-button']");
    static By go = By.xpath("//a[@href='/cart?ref_=sw_gtc']");
    static By check = By.xpath("//img[@class='sc-product-image']");

    public AmazonPages(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver,10 );
        this.elementHelper = new ElementHelper(driver);
        

    }

    public static void Homepage() {
    }

    public static void acceptCookie() {

        elementHelper.click(accept);


    }

    public static void clickSearch() {

        elementHelper.click(search);
    }

    public static void writeProduct() {

        elementHelper.sendKey(search,"airpods");
    }

    public static void searchButton() {
        elementHelper.click(searcbutton);
    }

    public static void filterAmazon() {
        elementHelper.click(filter);
    }

    public static void filterApple() {
        elementHelper.click(applefilter);
    }

    public static void firstProduct() {
        elementHelper.click(firstproduct);
    }

    public static void addChart() {
        elementHelper.click(add);
        elementHelper.click(go);
    }

    public static void checkChart() {
        elementHelper.checkVisible(check);

    }
}
