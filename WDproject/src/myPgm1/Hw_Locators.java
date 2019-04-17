package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw_Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		
		// Locators : Finding elements By: id, name, linkText
		
		driver.findElement(By.name("userName")).sendKeys("sundara");
		driver.findElement(By.name("password")).sendKeys("subramanian");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.linkText("SIGN-ON")).click();
		

		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sundara subramanian");	
		driver.findElement(By.name("lastName")).sendKeys("nellainayagam");
		driver.findElement(By.name("phone")).sendKeys("7487933939");
		driver.findElement(By.id("userName")).sendKeys("sundara@email.com");
		
		driver.findElement(By.name("address1")).sendKeys(" first gate, Choolaimedu, chennai 6000094");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("postalCode")).sendKeys("600094");
		
		driver.findElement(By.id("email")).sendKeys("nss");
		driver.findElement(By.name("password")).sendKeys("pass1");
		driver.findElement(By.name("confirmPassword")).sendKeys("pass1");
		
		
	}

}
