package Tests;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import Pages.Checkboxespage;
import Pages.homepage;
import BaseClass.BaseTest;

public class CheckboxTest extends BaseTest{
	
	Checkboxespage checkboxspage;
	WebDriver driver;
	
//	@BeforeMethod()
//	public void initdriver()
//	{
//		driver=BaseTest.getinit(driver);
//	}
//	
	@Test()
	public void ClickOnCheckbox()
	{
		checkboxspage=new Checkboxespage(getDriver());
       
		checkboxspage.ClickOnCheckbox();
			
	}

}
