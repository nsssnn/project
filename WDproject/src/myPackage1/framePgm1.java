package myPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class framePgm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Sundar/Desktop/frame.html");
		/*driver.switchTo().frame("tour");
		driver.findElement(By.name("userName")).sendKeys("Sundar");
		driver.findElement(By.name("password")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("demo");
		driver.findElement(By.id("email")).sendKeys("aaa");
		driver.switchTo().defaultContent();*/
	
		
		WebElement we = driver.findElement(By.xpath("//iframe[@title='global']"));
	
		driver.switchTo().frame(we);
		//driver.findElement(By.id("custom_field_text_field_1016375")).sendKeys("sundara@email.com");
		driver.switchTo().defaultContent();
		
		

	}

}
