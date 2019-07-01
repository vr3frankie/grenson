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
        chromeDriver.get("https://www.greatbritishchefs.com/");
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

    @And("^I search for Great British Chefs$")
    public void iSearchForGrenson() {
        //Execute Google Search (Input Text)
        chromeDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("Great British Chefs");
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

    @Then("^I am back on the Home page$")
    public void iAmBackOnTheHomePage() {
        //Verify page
        String URL = chromeDriver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.greatbritishchefs.com/");
    }

    @And("^I close the Web browser$")
    public void webBrowserCloses() {
        chromeDriver.close();
    }

    @When("^I click on Sign in$")
    public void iClickOnSignIn() {
        //Click on Element
        chromeDriver.findElement(By.xpath("//*[@id=\"head-banner-sign-in\"]")).click();

    }

    @And("^I select My Account$")
    public void iSelectMyAccount() {
        chromeDriver.findElement(By.xpath("//*[@id=\"Navigation__Main\"]/div/ul[3]/li[6]/a")).click();
    }

    @And("^I select Log out$")
    public void IselectLogOut() {

        chromeDriver.findElement(By.xpath("//*[@id=\"Topusername\"]/div/div/a")).click();
    }

    @And("^I select sign in$")
    public void iSelectSignIn() {
        chromeDriver.findElement(By.xpath("//*[@id=\"head-banner-sign-in\"]")).click();
    }

    @Then("^I am logged in$")
    public void iAmLoggedIn() {
        String URL = chromeDriver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.greatbritishchefs.com/signin-or-register?referer=https://www.greatbritishchefs.com/#sign-in");
    }

    @And("^I select Great British Chefs from Search Results$")
    public void iSelectGreatBritishChefsFromSearchResults() {
        chromeDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div[1]/a/h3")).click();

    }

    @And("^I select Seafood Lasagna$")
    public void iSelectSeafoodLasagna() {
        chromeDriver.findElement(By.xpath("//*[@id=\"search-container\"]/div[5]/div[1]/div[2]/div[2]/a[2]/div/h3")).click();
    }

    @Then("^I can read the Seafood Lasagna recipe$")
    public void iCanReadTheSeafoodLasagnaRecipe() {
        String URL = chromeDriver.getCurrentUrl();
        Assert.assertEquals(URL, "https://www.greatitalianchefs.com/recipes/seafood-lasagna-recipe?_ga=2.169084195.362761789.1561768486-1029556824.1513431210");
    }

    @And("^I select the email option to sign in$")
    public void iSelectTheEmailOptionToSignIn() {
        chromeDriver.findElement(By.xpath("//*[@id=\"SignInAndRegister__Container-acdc3cf3-491a-47f9-b9bb-c6b8efcdbae5\"]/div[1]/div[1]/a")).click();
    }

    @And("^I input my username & Password$")
    public void iInputMyUsernamePassword() {
        chromeDriver.findElement(By.xpath("//*[@id=\"usernameOrEmaila06351ed-3cca-4b08-994d-9c5a28e13612\"]")).sendKeys("vr3@live.co.uk");
        chromeDriver.findElement(By.xpath("//*[@id=\"password0d77f921-25c4-4e3d-ad7d-dfc278152f26\"]")).sendKeys("Frankie3");
        chromeDriver.findElement(By.xpath("//*[@id=\"password0d77f921-25c4-4e3d-ad7d-dfc278152f26\"]")).sendKeys(Keys.RETURN);
    }
}

