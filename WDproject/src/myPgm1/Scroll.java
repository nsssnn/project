package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-500)");
		
		/*((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");//to scroll from bottom to Top=> minus*/
		
		/*WebElement ec=driver.findElement(By.xpath("//label[text()='E-CATERING']"));
		
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",ec);*/
	}

}
