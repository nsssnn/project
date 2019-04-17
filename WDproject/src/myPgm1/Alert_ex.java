package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_ex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Sundar\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/index.php");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		Thread.sleep(3000);
		String msg=	driver.switchTo().alert().getText();
		System.out.println(msg);
		driver.switchTo().alert().dismiss();
		

	}

}
