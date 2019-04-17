package myPgm1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/datepicker/");
		
		driver.findElement(By.id("datepicker")).click();
		
		
		for (int j = 1; j<=200; j++)
		{
		
		
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		
		if (year.equals("2020"))
		{
			

			for (int i=1; i<=12;i++)
			{
				
			String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();		
					
					if(month.equalsIgnoreCase("june"))
					{
						List <WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
						
						for (WebElement date : dates)
						{
							String Val =date.getText();
							if(Val.equals("5"))	
							{
								date.click();
								break;
							}
						}
						break;
					}
					
					else
						
					{
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
					}	
					
					
					
			}
			
			
		break;	
		}
		else
		{
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		}		
		

	}

}
