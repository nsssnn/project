package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Locatepgm1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/");
		
		WebElement img=driver.findElement(By.id("enterimg"));
		img.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("sundarasubramanian");
		driver.findElement(By.xpath("//input[@ng-model=\"LastName\"] [@placeholder=\"Last Name\"]")).sendKeys("nellainayagam");
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("32, Main block, First Main Road, Teynampet, chennai 600106");
		driver.findElement(By.cssSelector("input[ng-model*='mail']")).sendKeys("myemail@gmail.com");
		driver.findElement(By.cssSelector("input[ng-model='Phone']")).sendKeys("234466775");
		
	WebElement skil=	driver.findElement(By.id("Skills"));
	Select ss= new Select(skil);
	//ss.selectByIndex(4);
	//ss.selectByVisibleText("Analytics");
	ss.selectByValue("APIs");
		
		driver.findElement(By.cssSelector("input[id='firstpassword']")).sendKeys("pass123");
		driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys("pass123");
		
			//	driver.close();
				
				
				
				
				

	}

}
