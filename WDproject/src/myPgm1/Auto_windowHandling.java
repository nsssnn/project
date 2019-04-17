package myPgm1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_windowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
	String pn=	driver.getWindowHandle();
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	Set<String> aw=driver.getWindowHandles();
	System.out.println(aw.size());
	for(String w:aw)
	{
	if(!w.equals(pn))
	{
		driver.switchTo().window(w);
		driver.findElement(By.linkText("Download")).click();
		driver.close();
	}
	}
	driver.switchTo().window(pn);
	driver.findElement(By.xpath("//a[@target='_blank']")).click();
	}

}
