package StepDefinations;

import PageObjects.SearchPageObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchPageSteps {

     WebDriver driver;

    @Given("^Open chrome browser and enter url$")
    public void setup() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
    }

    @When("^Enter Search Parameter \"([^\"]*)\"$")
    public void googleSearchPage(String Text){
        SearchPageObject page = new SearchPageObject(driver);

        //GoogleSearchPage Page = new GoogleSearchPage(driver);
        page.setSearchbar(Text);
    }

    @Then("^Click on Search button$")
    public void clickSearchButton(){
        SearchPageObject page = new SearchPageObject(driver);

        page.clickSearchButton();
        driver.close();
    }

}
