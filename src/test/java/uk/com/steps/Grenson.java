package uk.com.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Grenson {

    private ChromeDriver chromeDriver;
    private Object rso;
    private Object actions;

    public Grenson() {
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().fullscreen();
    }

    @Given("^I am on the Great British Chefs Homepage$")
    public void i_am_on_the_GreatBritishChefs_Homepage() {
        //Go to Page
        chromeDriver.get("https://www.greatbritishchefs.com");
    }


    @Then("^I can see UK Grenson stores$")
    public void iCanSeeUKStores() {
        //Verify page
        String URL = chromeDriver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.grenson.com/uk/stores");
    }


    @Given("^I am on the Google Homepage$")
    public void i_am_on_the_Google_Homepage() {
        //Go to Google Homepage
        chromeDriver.get("https://www.google.com");

    }

    @And("^I search for Grenson$")
    public void iSearchForGrenson() {
        //Execute Google Search (Input Text)
        chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Grenson");
    }

    @And("^I click Google Search$")
    public void clickGoogleSearch() {
        //Select Return to submit Google Search
        chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.RETURN);

    }

    @When("^I select the Search Bar$")
    public void iSelectTheSearchBar() {
        //Click on Element
        chromeDriver.findElement(By.xpath("//*[@id=\"search__inputfield\"]")).click();

    }

    @And("^I type 'Lasagna' into the Search bar$")
    public void iTypeLasagnaIntoTheSearchBar() {
        //Execute Google Search (Input Text)
        chromeDriver.findElement(By.xpath("//*[@id=\"search__inputfield\"]")).sendKeys("Lasagna");

    }

    @And("^I press Return to submit the search$")
    public void iSelectTheSearchIcon() {
        //Submit Search
        chromeDriver.findElement(By.xpath("//*[@id=\"search__inputfield\"]")).sendKeys(Keys.RETURN);
    }

    @When("^I select the Home icon$")
    public void iSelectTheHomeIcon() {
        //Click on Element
        chromeDriver.findElement(By.xpath("/html/body/div[5]/div/a/picture/img")).click();
    }

    @Then("^I am back on the Home page$")
    public void iAmBackOnTheHomePage() {
        //Verify page
        String URL = chromeDriver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.greatbritishchefs.com/");

    }

    @And("^Web browser closes$")
    public void webBrowserCloses() {
        chromeDriver.close();
    }
}