package UI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class resultsPage extends pageBase{

    @FindBy(id = "result-stats")
    WebElement resultStatus;

    @FindBy(css = "GNJvt ipz2Oe")
    WebElement moreResults;

    public WebElement getResultStatus() {
        return resultStatus;
    }

    public WebElement getMoreResults() {
        return moreResults;
    }
}
