package UI.Pages;

import UI.stepDefs.Hooks;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class pageBase {
    public  pageBase()
    {
        PageFactory.initElements(Hooks.driver, this);

    }
    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30) );
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void scrollToBottom(WebElement element) {


       boolean stoppingCondition = true;
       int counter = 0;

        while (stoppingCondition) {
            try {
                Thread.sleep(1000);
                if (counter==10||element.isDisplayed()) {
                    stoppingCondition = false;
                    break;
                }

            } catch (org.openqa.selenium.NoSuchElementException e) {
                counter++;
                JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                continue;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
