package browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetup {
	

	static WebDriver driver;
	
	public static WebDriver initialization(String bname, String URL)
	{
		if (bname.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		if (bname.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.get(URL);
	return driver;
	
		
	}
	
	

}
