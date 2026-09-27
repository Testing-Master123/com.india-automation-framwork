package Tests;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import BaseClass.BaseTest;
import Pages.homepage;


@Listeners(utils.TestListener.class)
public class HomeTest  extends BaseTest{
	
	homepage page;
	
	
	@Test
	public void LoginTest()
	{
		
		page=new homepage(getDriver());
		page.clickonloginbutton();
		
	}
	
	@Test
	public void VerifyRadio_button_isclicable()
	{
		
	
	
		page=new homepage(getDriver());
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
	
		page=new homepage(getDriver());
		page.Clickon_first_checkbox();
	}
	
	
	@Test
	public void selectsuggestionboxx()
	{
	
		page=new homepage(getDriver());
		page.EnterVluein_SuggestionBox();
	}
	
	
	@Test
	public void Email()
	{
	
		page=new homepage(getDriver());
		page.enterSearchValue();
	}
}



