package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class my1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Sundara subramanian");
		driver.findElement(By.name("lastName")).sendKeys("Nellai");
		driver.findElement(By.name("phone")).sendKeys("234567897");
		driver.findElement(By.name("userName")).sendKeys("sundar@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("North street");
		driver.findElement(By.name("city")).sendKeys("Chennai");
		driver.findElement(By.name("state")).sendKeys("TamilNadu");
		driver.findElement(By.name("postalCode")).sendKeys("600123");
		
		
		
	}

}
