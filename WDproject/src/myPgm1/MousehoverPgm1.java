package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MousehoverPgm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();	
		
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	WebElement mh = driver.findElement(By.linkText("More"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(mh).build().perform();		
		driver.findElement(By.linkText("Loader")).click();
		
		
		
		
		
		
		
	}

}
