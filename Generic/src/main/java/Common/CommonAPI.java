package Common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

     WebDriver driver = null;

     @Parameters({"url"})

     @BeforeMethod
    public void setUp(String url) {
        System.setProperty("webdriver.chrome.driver", "/Users/soniarahman/Downloads/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to(url);
    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }


















}
