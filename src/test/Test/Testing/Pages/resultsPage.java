package Testing.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class resultsPage extends pageBase{

    @FindBy(id = "result-stats")
    WebElement resultStatus;

    @FindBy(css = "GNJvt ipz2Oe")
    WebElement moreResults;


    @FindBy(css = "#bres > div.ULSxyf > div > div > div > div.kfsfbe.adDDi > div > div > span")
    WebElement peopleSearchFor;
    @FindBy(css = "#tsuid_60 > div.M7lz2c.XC18Gb.diAzE > a:nth-child(2) > div.r2fjmd.VCOFK.WyGS9c > div")
    WebElement peopleSearchForResult1;

    @FindBy(css = "#tsuid_60 > div.M7lz2c.XC18Gb.diAzE > a:nth-child(4) > div.r2fjmd.VCOFK.WyGS9c > div")
    WebElement peopleSearchForResult2;

    @FindBy(css = "#tsuid_60 > div.M7lz2c.XC18Gb.diAzE > a:nth-child(6) > div.r2fjmd.VCOFK.WyGS9c > div")
    WebElement peopleSearchForResult3;

    @FindBy(css = "#tsuid_60 > div.M7lz2c.XC18Gb.diAzE > a:nth-child(8) > div.r2fjmd.VCOFK.WyGS9c > div")
    WebElement peopleSearchForResult4;

    @FindBy(css = "#botstuff > div > div.sdjuGf > div.WZH4jc.w7LJsc > a.T7sFge.sW9g3e.VknLRd > h3 > div")
    WebElement moreResultsBttomOfPage;
    public WebElement getResultStatus() {
        return resultStatus;
    }

    public WebElement getMoreResults() {
        return moreResults;
    }

    public WebElement getPeopleSearchFor() {
        return peopleSearchFor;
    }

    public WebElement getPeopleSearchForResult1() {
        return peopleSearchForResult1;
    }
    public WebElement getPeopleSearchForResult2() {
        return peopleSearchForResult2;
    }public WebElement getPeopleSearchForResult3() {
        return peopleSearchForResult3;
    }
    public WebElement getPeopleSearchForResult4() {
        return peopleSearchForResult4;
    }

    public WebElement getMoreResultsBttomOfPage() {
        return moreResultsBttomOfPage;
    }
}
