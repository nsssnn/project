
package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class My2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
			
		/*driver.findElement(By.xpath("//input[@id='u_0_j']")).sendKeys("Sundar");
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Boopathy");
		driver.findElement(By.xpath("//input[@name='reg_email__' ]")).sendKeys("sundara@email.com");
		driver.findElement(By.xpath("//input[@id='u_0_v']")).sendKeys("nss4444");	
		*/
		
		//input[starts-with(@type,'ema')]
		
		driver.findElement(By.xpath("//input[starts-with(@type,'ema')]")).sendKeys("sundara@email.com");
		
		driver.findElement(By.xpath("//input[@data-type='text'  and @aria-label='Mobile number or email address']")).sendKeys("sundara");;
		
		//other method : in above we use 'and'.  The same will be declared as below with two square braces. can increase conditions.
		
		driver.findElement(By.xpath("//input[contains(@type, 'text')][@name='reg_email__']")).sendKeys("@gmail.com");
		
		
		
		driver.findElement(By.xpath("//input[contains(@type, 'text')][@name='reg_email__']//following::input[1]")).sendKeys("sundara@gmail.com");
		
		
		
		
		
		/*
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Iniya");
		
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("Sundar");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("26 , B- Block, supraba flats , Arumbakkam");*/
		
		
		
		
		
		
		
		
	}

}
