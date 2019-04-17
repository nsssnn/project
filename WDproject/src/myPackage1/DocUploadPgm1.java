package myPackage1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DocUploadPgm1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("imagesrc")).click();
		
		//driver.findElement(By.xpath("//input[@onchange='uploadimg()']")).click();
		
		StringSelection fn = new StringSelection("C:\\Users\\Sundar\\Desktop\\SampleFolder\\SampleDoc.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fn, null);
		
		Thread.sleep(1000);
		Robot fu = new Robot();
		fu.keyPress(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_V);		
		
		fu.keyRelease(KeyEvent.VK_V);
		fu.keyRelease(KeyEvent.VK_CONTROL);
		fu.keyPress(KeyEvent.VK_ENTER);
		
		
	}

}
