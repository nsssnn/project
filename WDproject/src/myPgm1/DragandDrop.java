package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		
		Thread.sleep(1000);
		WebElement dd = driver.findElement(By.xpath("//a[text()=' 5000']")); //we should not put @ symbol for text()
		
		WebElement amt = driver.findElement(By.xpath("//ol[@id='amt7']/li"));  // to take the li which is next to amt7
		
		Actions ab = new Actions(driver);
		ab.dragAndDrop(dd, amt).build().perform();
		
		
		
		WebElement dd1 = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		
		WebElement amt1 = driver.findElement(By.xpath("//ol[@id='bank']/li"));
		
		Actions ac = new Actions(driver);
		ac.dragAndDrop(dd1, amt1).build().perform();
		
		

	}

}
