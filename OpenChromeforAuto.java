package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeforAuto {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://google.co.in");

		driver.findElement(By.name("q")).sendKeys("dominic"+Keys.ENTER);
		
		driver.findElement(By.xpath("//h3[text()='Dominic - Wikipedia']")).click();
		 
	
	}
	
	

}
