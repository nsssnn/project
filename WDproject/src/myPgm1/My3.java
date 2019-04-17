
package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("#u_0_j")).sendKeys("shiva");
	
	
	//driver.findElement(By.cssSelector(".inputtext")).sendKeys("nsssssdf");	
	//driver.findElement(By.cssSelector(".inputtext._58mg._5dba._2ph-")).sendKeys("Ram");
	
	driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Suresh krishna");
	
	driver.findElement(By.cssSelector("input[aria-label*='Mobile number or email address']")).sendKeys("sundaranss1234@gmail.com");
	
		
	driver.findElement(By.cssSelector("input[aria-label^='Re-enter']")).sendKeys("sundaranss1234@gmail.com");
	
	driver.findElement(By.cssSelector("input[aria-label$='word']")).sendKeys("12345");
			
		
	
		
		

	}

}
