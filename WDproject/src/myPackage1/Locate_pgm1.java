package myPackage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_pgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	driver.manage().window().maximize();
	
	driver.findElement(By.name("firstName")).sendKeys("Sundara");
	driver.findElement(By.name("lastName")).sendKeys("subramanian");
	driver.findElement(By.name("phone")).sendKeys("23452345");
	driver.findElement(By.id("userName")).sendKeys("sundara@emaill.com");
	driver.findElement(By.name("address1")).sendKeys("First street");
	driver.findElement(By.name("address2")).sendKeys("Second street");
	driver.findElement(By.name("city")).sendKeys("Chennai");
	driver.findElement(By.name("state")).sendKeys("TamilNadu");
	
	driver.findElement(By.name("postalCode")).sendKeys("627097");
	
	driver.findElement(By.id("email")).sendKeys("nss567");	
	
	
	

	}

}
