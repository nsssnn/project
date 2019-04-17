package myPgm1;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/");
		driver.findElement(By.id("enterimg")).click();
		
		
		WebElement yr = driver.findElement(By.id("yearbox"));
		Select ys = new Select(yr);
		ys.selectByValue("1999");
		
		WebElement mh = driver.findElement(By.cssSelector("Select[ng-model='monthbox']"));
		Select mo = new Select (mh);
		mo.selectByIndex(3);
		
		WebElement dy = driver.findElement(By.id("daybox"));
		Select da = new Select (dy);
		da.selectByVisibleText("6");
		
		//PROGRAM FOR RADIO BOX AND CHECK BOX SELECTION:
		
	List<WebElement> radios=	driver.findElements(By.xpath("//input[@type='radio']"));
	
	for(WebElement r:radios)
	{
	String val=	r.getAttribute("value");
	if(val.equalsIgnoreCase("male"))
	{
		r.click();
	}
	}
		
		
		
		List<WebElement> cb = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement g : cb)
		{
			String vl = g.getAttribute("value");
			if (vl.equalsIgnoreCase("cricket")||vl.equalsIgnoreCase("hockey"))
			{
				g.click();
			}
					
		}
		
		driver.findElement(By.id("imagesrc")).click();
		Runtime.getRuntime().exec("C:\\Users\\Sundar\\Desktop\\FileUpload.exe");
		//copying a file
		
		
	}

}
