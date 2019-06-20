package uk.com.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grenson {

    private ChromeDriver chromeDriver;

    public Grenson() {
        chromeDriver = new ChromeDriver();
    }

    @Given("^I am on the Grenson Homepage$")
    public void i_am_on_the_Grenson_Homepage() {
        //System.setProperty("webdriver.chrome.driver", "/Users/Frankie/IdeaProjects/Chrome driver/chromedriver");
        chromeDriver.get("https://www.grenson.com/uk/");
    }


    @When("^I click stockists$")
    public void iClickStockists() {

        chromeDriver.get("https://www.grenson.com/uk/stores");
    }

    @Then("^I can see UK stores$")
    public void iCanSeeUKStores() {
        String URL = chromeDriver.getCurrentUrl();
        Assert.assertEquals(URL,"https://www.grenson.com/uk/stores");
    }

    @And("^I click Shop$")
    public void iClickShop() {
        chromeDriver.get("https://www.grenson.com/uk/#");

    }

    @And("^go back to Grenson Homepage$")
    public void goBackToGrensonHomepage() {
        chromeDriver.get("https://www.grenson.com/uk/");
    }

    @And("^I click Men's Socks$")
    public void iClickMenSSocks() {
        chromeDriver.get("https://www.grenson.com/uk/mens-shoes-collection/mens-socks.html");
    }
}
