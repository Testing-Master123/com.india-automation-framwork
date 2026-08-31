package BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class BaseTest {

public WebDriver driver;

public static WebDriver getinit(WebDriver driver) 

{
	driver = new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	return driver;
}

//public void tearDown() 
//  {
	

//    if (driver != null) {
//        driver.quit();
//    }
	
//    }

}




