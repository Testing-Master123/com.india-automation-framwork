package Tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.BaseTest;
import Pages.homepage;
public class HomeTest  extends BaseTest{
	
	homepage page;
	
	
	@BeforeMethod()
	public void initdriver()
	{
		BaseTest.getinit(driver);
	}
	
	@Test
	public void LoginTest()
	{
		//BaseTest.getinit(driver);
		page=new homepage(driver);
		page.clickonloginbutton();
		
	}
	
	@Test
	public void VerifyRadio_button_isclicable()
	{
		
	
		page=new homepage(driver);
		String actual_radiotitle ="Radio Button Example";
		String radiotitle = page.radiobuttontext();
		System.out.println(radiotitle);
		SoftAssert softassert = new SoftAssert();
		
		softassert.assertEquals(actual_radiotitle,radiotitle);
		softassert.assertAll();
	}
	
	@Test
	public void VerifyRadio_button_is_enable_for_click()
	{
		//driver =BaseTest.getinit(driver);
		page=new homepage(driver);
		page.Clickon_first_checkbox();
	}
	
	
	@Test
	public void selectsuggestionboxx()
	{
		page=new homepage(driver);
		page.EnterVluein_SuggestionBox();
	}
}
