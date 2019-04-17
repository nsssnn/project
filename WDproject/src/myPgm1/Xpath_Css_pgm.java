package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Css_pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/* driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();  */
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		//input[@ng-model='FirstName']   -- is the F12 value ; resulting 1 matching nodes;
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Sundara");
		 // double  square bracket => AND here below
		driver.findElement(By.xpath("//input[@ng-model='LastName'] [@type='text']")).sendKeys("nellainayagam ");
		
		// within a single square bracket we can use multiple using and:
		//driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']   ")).sendKeys("sundara@");
		//driver.findElement(By.xpath(" //input[@type='email' and @ng-model='EmailAdress'] ")).sendKeys("gmail.com");
		
		//driver.findElement(By.xpath("//input[starts-with(@ng-model,'Phon')]")).sendKeys("38738678");
		
		//driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("thirukumarapuram 1st street");
		
		//driver.findElement(By.xpath("//input[starts-with(@id,'firstpassword' )and starts-with( @ng-model,'Pass')]")).sendKeys("abc1234");
		
		//driver.findElement(By.xpath("//input[contains(@ng-model, 'CPas')]")).sendKeys("abc12346");
		
		//driver.findElement(By.xpath("//input[contains(@ng-model, 'CPas')]//following::button[1]")).click();
		
		//driver.findElement(By.xpath("//input[@ng-model='EmailAdress']//following::input[1]")).sendKeys("23242526");
		
		//driver.findElement(By.xpath("//input[contains(@ng-model,'astNa')]")).sendKeys("jack");
		
	
		driver.findElement(By.xpath("//input[@type='email']//preceding::textarea[1]")).sendKeys("first cut road, chennai - arumbakkam");
		
		
	}

}
