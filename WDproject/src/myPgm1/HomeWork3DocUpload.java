package myPgm1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork3DocUpload {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in");
		
		driver.findElement(By.id("enterimg")).click();
		
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Sundar");
		
		driver.findElement(By.xpath("//input[starts-with(@ng-model,'LastName')]")).sendKeys("subramanian");
		
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Arumbakkam, Chennai 600106");
		
		driver.findElement(By.xpath("//input[@onchange='uploadimg()']")).click();
		
		// PROGRAM TO UPLOAD DOCUMENT USING ROBOT FUNCTION:
		//C:\Users\Sundar\Desktop\SampleFolder\SampleDoc.txt
		//CTRL+C
		StringSelection fn = new StringSelection("C:\\Users\\Sundar\\Desktop\\SampleFolder\\SampleDoc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fn,null);
		
		
		
		//CTRL+V and ENTER
		Robot fu = new Robot();
		fu.keyPress(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_V);
	
		
		fu.keyRelease(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_ENTER);
		
		
	// Alert handling concepts:	 mouse hover and alert
		
	/*WebElement st=	driver.findElement(By.linkText("SwitchTo"));
	Actions mh = new Actions(driver);
    mh.moveToElement(st).build().perform();
    driver.findElement(By.linkText("Alerts")).click();*/
	}

}
