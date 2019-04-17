package testcase;

import org.openqa.selenium.WebDriver;

import browser.DriverSetup;
import pages.NamePage;


public class TC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=	DriverSetup.initialization("firefox", "http://demo.automationtesting.in/Register.html");
	NamePage obj = new NamePage(driver);
	obj.fname("prem");
	obj.lname("sundar");
	}

}
