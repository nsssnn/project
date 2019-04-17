package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class NamePage {
	WebDriver driver;

	
	public NamePage(WebDriver drv) {
		// TODO Auto-generated constructor stub
		this.driver = drv;
	}

	public void fname(String firstname)
	{
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys(firstname);;
	}
	
	public void lname(String lastname)
	{
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys(lastname);;
	}

	
}
