package Testing.stepDefs;

import Testing.Pages.resultsPage;
import io.cucumber.java.en.And;
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

        result.scrollToBottom(result.getMoreResults());//scrolling till we find load more results button
    }

    @And("user verifies that people also search for is displayed")
    public void userVerifiesThatPeopleAlsoSearchForIsDisplayed() {
        Assert.assertTrue(result.getPeopleSearchFor().isDisplayed());
    }

    @And("user verifies that the results of people also search for are different from the searched word {string}")
    public void userVerifiesThatTheResultsOfPeopleAlsoSearchForAreDifferentFromTheSearchedWord(String data) {
        Assert.assertNotEquals(result.getPeopleSearchForResult1(),data);
        Assert.assertNotEquals(result.getPeopleSearchForResult2(),data);
        Assert.assertNotEquals(result.getPeopleSearchForResult3(),data);
        Assert.assertNotEquals(result.getPeopleSearchForResult4(),data);
    }

    @And("user verifies that more results button is displayed and clickable")
    public void userVerifiesThatMoreResultsButtonIsDisplayedAndClickable() {
        result.getMoreResultsBttomOfPage().click();
    }
}
