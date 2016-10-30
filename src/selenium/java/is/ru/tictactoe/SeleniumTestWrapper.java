package is.ru.tictactoe;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;


public abstract class SeleniumTestWrapper {
   // static ChromeDriver driver;
    public static WebDriver driver;
    public static String baseUrl = "https://tictactoe-staging.herokuapp.com";
    public static String port;

    @BeforeClass
    public static void openBrowser(){
        
        System.setProperty("webdriver.firefox.profile", "default");
        driver = new FirefoxDriver();
        //driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        /*port = System.getenv("PORT");
        if (port == null) {
            port = "4567";
        }
        baseUrl = "http://localhost:" + port;*/

        driver.get(baseUrl);
    }

    @AfterClass
    public static void closeBrowser(){

        driver.quit();
    }
}
