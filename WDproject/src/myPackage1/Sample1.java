package myPackage1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		//option.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(option);

		//driver.get("https://www.irctc.co.in");
		driver.manage().window().maximize();	
				
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
			
		/*driver.get("https://www.irctc.co.in");
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");	
	((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	*/
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		Select sk = new Select(driver.findElement(By.id("Skills"))); //Skills is the dropdown field
		  sk.selectByVisibleText("AutoCAD");
	
	}
}
