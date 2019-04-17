package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomeWork{
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();   // to initiate and open the firefox browser
		
		//driver.get("http://www.newtours.demoaut.com");  //browser to open the web address
		
		// finding the elements present in the web page by linkText, id, name:
		
		/*driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sundara subramanian");
		driver.findElement(By.name("lastName")).sendKeys("Nellainayagam");
		driver.findElement(By.name("phone")).sendKeys("23456788");
		driver.findElement(By.id("userName")).sendKeys("sundara@email.com");
		driver.findElement(By.name("address1")).sendKeys("73, first main road, Guindy, Chennai 600034");
		driver.findElement(By.name("city")).sendKeys("Chennai City");*/
		
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("sundarasjfls");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("subramanian");
		
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sundara@email.com");
				
		//driver.findElement(By.xpath("//input[contains(@type, 'text')][@name='reg_email__']")).sendKeys("@gmail.com");
		
	}
}