package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hw_mo_al_r_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement we = driver.findElement(By.linkText("SwitchTo"));
		 
		
		
		Actions ac = new Actions(driver);
		ac.moveToElement(we).build().perform();
		System.out.println("waiting time one is printing");
		System.out.println("waiting time one is printing");
		
		WebElement wee = driver.findElement(By.linkText("Alerts"));
		wee.click();
		
		//driver.findElement(By.linkText("Alerts")).click();
		//driver.findElement(By.cssSelector(".btn.btn-danger")).click();
		
		String mk =driver.switchTo().alert().getText();
		System.out.println(mk);
		driver.switchTo().alert().accept();
		
	}

}



