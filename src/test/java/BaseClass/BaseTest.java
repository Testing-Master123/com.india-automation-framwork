
package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.ConfigReader;

public class BaseTest {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setUp() {
    	 String baseurl = ConfigReader.getProperty("url");
    	 
        WebDriver driverinstance = new ChromeDriver();
        driverinstance.manage().window().maximize();
        driver.set(driverinstance);
     
        getDriver().get(baseurl);
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    @AfterMethod
    public void tearDown() {
        if (getDriver() != null) {
            getDriver().quit();
            driver.remove();
        }
    }
}



