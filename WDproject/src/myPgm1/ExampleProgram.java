package myPgm1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExampleProgram {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("http://demo.automationtesting.in");
		
		driver.findElement(By.id("enterimg")).click();	
		
		StringSelection fn = new StringSelection("C:\\Users\\Sundar\\Desktop\\SampleFolder\\SampleDoc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fn,null);
		
		Robot fu = new Robot();
		fu.keyPress(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_V);
	}

}
