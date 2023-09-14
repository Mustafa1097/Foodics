package UI.stepDefs;

import com.sun.javafx.geom.Edge;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;

    @Before
    public static void setupDriver()  {
        WebDriverManager.chromedriver().setup();
        //ChromeOptions chromeOptions = new ChromeOptions().setHeadless(false);
        EdgeOptions edge = new EdgeOptions();
        driver = new EdgeDriver(edge);
        driver.manage().window().maximize();



    }



    @After
    public static void quitDriver()  {

       //driver.quit();

    }


}
