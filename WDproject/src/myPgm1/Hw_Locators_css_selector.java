package myPgm1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw_Locators_css_selector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\\\Sundar\\\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	// in Create an account page: Field labels present are First name, Surname, Mobile number or email address, New password:
	
	// css selector with attribute as 'id' in F12:
	
	// id => " #idvalue "
	//driver.findElement(By.cssSelector("#u_0_j")).sendKeys("Sundara subramanian");  //in F12:id="u_0_j"
	//driver.findElement(By.cssSelector("#u_0_l")).sendKeys("Nellainayagam");  //in F12:id="u_0_l"
	
	// css selector with attribute as 'Class' in F12:	
	
	// class => " .classvalue "  in F12 we have to search by ctrl+f  to check only one node ie answer you are getting
	//driver.findElement(By.cssSelector(".inputtext _58mg _5dba _2ph-")).sendKeys("sundara@gmail.com");   // in F12: class="inputtext _58mg _5dba _2ph-"
	
	// css selector with single attribute in F12:
	//input[name ='firstname']
	driver.findElement(By.cssSelector("input[name ='firstname']")).sendKeys("Sundara subramanian");

	}

}
