package UI.stepDefs;

import UI.Pages.resultsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class resultsStepDef {


    resultsPage result = new resultsPage();


    @Then("user verifies that number of results exist on UI")
    public void userVerifiesThatNumberOfResultsExistOnUI() {
        Assert.assertTrue(result.getResultStatus().isDisplayed());
    }

    @When("user scroll to the bottom of the page")
    public void userScrollToTheBottomOfThePage() throws InterruptedException {
       // result.scrollToElement(result.getMoreResults());
        result.scrollToBottom(result.getMoreResults());
    }
}
