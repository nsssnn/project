package myPgm1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobtn_pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		driver.findElement(By.name("userName")).sendKeys("123");
		driver.findElement(By.name("password")).sendKeys("123");
		
		driver.findElement(By.name("login")).click();
		
	/*	List<WebElement> raios = driver.findElements(By.xpath("//input[@type = 'radio']"));
		for (WebElement chk : raios)
		{
			String b = chk.getAttribute("value");
			
			if (b.equalsIgnoreCase("oneway"))
					{
						chk.click();
					}
		}*/
		
				
			List<WebElement> raios = driver.findElements(By.xpath("//input[@type = 'radio']"));
			for (WebElement chk : raios)
			{
				if(!chk.isSelected())
				{
				String b = chk.getAttribute("value");
				
				if (b.equalsIgnoreCase("oneway"))
						{
							chk.click();
						}
				}		
		
		}		 
			
	}

	}


