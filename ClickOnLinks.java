package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnLinks {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://leafground.com");
		
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"menuform:m_link\"]/a")).click();
			
		Thread.sleep(500);
		//using linktest locator
		//driver.findElement(By.linkText("Go to Dashboard")).click();
		//using partial linkTest locator
		//when given text present more than once, Selenium  will select that come first.
		driver.findElement(By.partialLinkText("Dashboard")).click();
		
		//using xpath locator
		//driver.findElement(By.xpath("//a[text()='Go to Dashboard']")).click();

	}

}
