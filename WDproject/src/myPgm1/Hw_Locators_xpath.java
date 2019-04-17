package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw_Locators_xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Sundar\\\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		
		
		//driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("SundarN");		
		//driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Nellai");		
		//driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8432092342");
		//driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("sundara1234@email.com");		
		//driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("sdojwejdfsdf, chennai");
		
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//input[contains(@name, 'firstn')][@id='u_0_j']")).sendKeys("SundarN");
		//driver.findElement(By.xpath("//input[contains(@name, 'firstn')]")).sendKeys("hhSundarN");
		
		
		
		
				
		
		
		
		

	}

}
