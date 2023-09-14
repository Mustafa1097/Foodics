package UI.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends pageBase{

    @FindBy(id = "APjFqb")
    WebElement searchBar;


    public WebElement getSearchBar() {
        return searchBar;
    }
}
