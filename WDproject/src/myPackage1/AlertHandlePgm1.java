package myPackage1;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AlertHandlePgm1 {

	static Logger log = Logger.getLogger(AlertHandlePgm1.class);
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		log.info("*************************TEST STARTD ********************");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement mh = driver.findElement(By.linkText("SwitchTo"));		
		Actions ac = new Actions(driver);
		ac.moveToElement(mh).build().perform();
		log.debug("&&&&&&&&&&&&&&&&&&&&&&&&& ssa &&&&&&&&&&&&&&");
		driver.findElement(By.linkText("Alerts")).click();
		driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		driver.switchTo().alert().accept();		
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.cssSelector(".btn.btn-info")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().sendKeys("Sundara subramanian");
		driver.switchTo().alert().accept();
		
		

	}

}
