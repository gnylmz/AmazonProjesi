package StepDefinitions;

import Pages.AmazonPages;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class AmazonSteps {

    WebDriver driver = DriverFactory.getDriver();
    AmazonPages amazonPages = new AmazonPages(driver);


    @Given("User is on homepage")
    public void userIsOnHomepage() {

        AmazonPages.Homepage();

    }

    @When("Click accept cookies")
    public void clickAcceptCookies() {

        AmazonPages.acceptCookie();

    }

    @When("Click the search button")
    public void clickTheSearchButton() {
        AmazonPages.clickSearch();

    }

    @When("Write product name")
    public void writeProductName() {
        AmazonPages.writeProduct();

    }

    @When("Click search button")
    public void clickSearchButton() {
        AmazonPages.searchButton();
    }

    @When("Filter for shipped by Amazon")
    public void filterForShippedByAmazon() {
        AmazonPages.filterAmazon();

    }

    @When("Filter for apple")
    public void filterForApple() {
        AmazonPages.filterApple();
    }

    @When("Click the first product")
    public void clickTheFirstProduct() {
        AmazonPages.firstProduct();

    }

    @When("Add to chart")
    public void addToChart() {
        AmazonPages.addChart();
    }

    @When("Check at chart page")
    public void checkAtChartPage() {

        AmazonPages.checkChart();
    }
}
