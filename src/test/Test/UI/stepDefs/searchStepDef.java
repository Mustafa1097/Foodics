package UI.stepDefs;

import UI.Pages.pageBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import UI.Pages.GooglePage;
import org.testng.Assert;


public class searchStepDef extends pageBase {

    GooglePage google = new GooglePage();

    @Given("user navigate to google")
    public void userNavigateToGoogle() throws InterruptedException {
        Hooks.driver.get("https://www.google.com/en");
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.google.com/?hl=en");
    }


    @When("user types in google search bar")
    public void userTypesInGoogleSearchBar() throws InterruptedException {
        google.getSearchBar().sendKeys("foodics");
    }

    @And("user removes the typed word")
    public void userRemovesTheTypedWord() throws InterruptedException {
        google.getSearchBar().clear();
    }

    @And("user types a new word")
    public void userTypesANewWord() throws InterruptedException {
        google.getSearchBar().sendKeys("league of legends");
    }

    @And("user clicks submit")
    public void userClicksSubmit() throws InterruptedException {
        google.getSearchBar().submit();
    }


}
