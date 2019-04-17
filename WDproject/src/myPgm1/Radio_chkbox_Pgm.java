package myPgm1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_chkbox_Pgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sundar\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		//For radio button and check box we can directly click on the element . 
		//But for frame work and easy way of doing we need to follow the following steps
		//driver.findElements  we have to use .note Elements. not Element.search result will give more than one Nodes. (not to use driver.findElement)
		//type=radio   -- for radio button in f12
		//type=checkbox  - for checkbox in f12 as common name
		
		List <WebElement> raios = driver. findElements(By.xpath("//input[@type = 'radio']"));
		for(WebElement r : raios)
		{
			String v = r.getAttribute("value");
			
				if(v.equalsIgnoreCase("female"))
			
			{
				System.out.println(v);
					r.click();
			}
		}
		
		
		/*List <WebElement>  cbox = driver.findElements(By.xpath("//input[@type = 'checkbox']"));
		for (WebElement chk :cbox)
		{
			String b = chk.getAttribute("value");
			if (b.equalsIgnoreCase("cricket") || b.equalsIgnoreCase("hockey") )
			{
				chk.click();				
			}
		}		
*/
	}

}
