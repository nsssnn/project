package myPgm1;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		String pn=driver.getWindowHandle();
		Set<String> aw=driver.getWindowHandles();
		System.out.println(aw.size()); // to get count of how many windows open, from main window
		for(String w:aw)
		{
			if(!w.equals(pn))
			{
				driver.switchTo().window(w);
				driver.close();
			}
		}
		driver.switchTo().defaultContent();

	}

}
