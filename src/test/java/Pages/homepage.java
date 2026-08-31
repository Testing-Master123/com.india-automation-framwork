package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseClass.BaseTest;

public class homepage {
	
	public WebDriver driver;

	public homepage(WebDriver driver)

	{
		
	this.driver = driver;
	
	}
	
	
	//WebElement radiotitle = driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
	
	  private By radiotitle = By.xpath("//legend[text()='Radio Button Example']");
	  private By firstcheckbox = By.xpath("//input[@value=\"radio1\"]");
	  private By EnterCountryinsuggesionbox = By.id("autocomplete");
	  private By Clickonenteredvalue =By.xpath("//li//div[text()='Japan']");

	
	public void clickonloginbutton()
	{
		//loginfield.click();
	}
	
    public String radiobuttontext()
    {
		
		 String title = driver
	                .findElement(radiotitle)
	                .getText();

	        System.out.println("Title: " + title);

	        return title;
	}
    
    public void Clickon_first_checkbox()
    {
    	     
    	   WebElement checkbox = driver.findElement(firstcheckbox);

    	    if (checkbox.isEnabled()) {

    	        checkbox.click();

    	        System.out.println("Checkbox is enabled and clicked");

    	    } else {

    	        System.out.println("Checkbox is disabled");
    	    }
    }
    
    public void EnterVluein_SuggestionBox()
    {
    	driver.findElement(EnterCountryinsuggesionbox).sendKeys("japan");
    	Actions act = new Actions(driver);
    	
    	// WebElement acb = driver.findElement(Clickonenteredvalue);
    	
    	act.moveToElement(driver.findElement(Clickonenteredvalue)).build().perform();
    }
    


}
