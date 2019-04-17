package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		
		WebElement  we1 = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement cam = driver.findElement(By.xpath("//ol[@id='amt8']/li"));
		
		
		WebElement sa = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement cac=driver.findElement(By.xpath("//ol[@id='loan']/li"));
		
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(we1, cam).build().perform();		
		ac.dragAndDrop(sa, cac).build().perform();
		
		
				
		
		
		
		
		
	  
	}

}
