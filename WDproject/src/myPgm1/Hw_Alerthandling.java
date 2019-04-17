					package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw_Alerthandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sundar\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("http://demo.guru99.com/v4/index.php");
		
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
				
		String s2a = driver.switchTo().alert().getText();
		System.out.println(s2a);
		driver.switchTo().alert().accept(); */
		
		
		// MOUSE HOVER AND ALERT HANDLING:
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement moh = driver.findElement(By.linkText("SwitchTo"));
		Actions mh = new Actions(driver);
		mh.moveToElement(moh).build().perform();
		driver.findElement(By.linkText("Alerts")).click();
		
		driver.findElement(By.linkText("Alert with OK")).click();			
		driver.findElement(By.cssSelector(".btn.btn-danger")).click(); // in F12: class="btn btn-danger". here we have to give dot b/w space
		String mk = driver.switchTo().alert().getText();
		System.out.println(mk);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		String gh = driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept(); // Ok to accept. either ok or cancel user need to select
		driver.switchTo().alert().dismiss();  //dismiss is to select Cancel button in th alert
		Thread.sleep(2000);
		String one = driver.findElement(By.id("demo")).getText();
		System.out.println(one);
		
		
	}

}
