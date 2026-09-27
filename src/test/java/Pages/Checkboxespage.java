package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkboxespage {
	WebDriver driver;
	
	public Checkboxespage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	private By checkboxheadingg = By.xpath("//fieldset//legend[text()='Checkbox Example']");
	
	private By Clickonopton2 = By.xpath("//input[@value='option2']");
	
	public void ClickOnCheckbox()
	{
	    String checkboxheading = driver.findElement(checkboxheadingg).getText();
	    System.out.print(checkboxheading);
		
		
		if(driver.findElement(Clickonopton2).isEnabled())
		{
			driver.findElement(Clickonopton2).click();
		}
		
		else
		{
			System.out.println("it is not enable for click");
		}
	}

}
