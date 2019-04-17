package myPgm1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoitPgm1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.id("imagesrc")).click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec("D:\\ff_docupload1.exe");

	}

}
