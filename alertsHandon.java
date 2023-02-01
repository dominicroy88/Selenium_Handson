package seleniumHandson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertsHandon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		
		WebElement SimpleAlert= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
		SimpleAlert.click();
		Alert alert= driver.switchTo().alert();
		Thread.sleep(500);
		alert.accept();
			
					
		WebElement confirmAlert= driver.findElement(By.xpath(" //*[@id=\"j_idt88:j_idt93\"]/span[2]"));  
		confirmAlert.click();
		Thread.sleep(500);
		alert.dismiss();
		
		WebElement SweetAlert= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]/span[2]"));
		SweetAlert.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]/span[2]")).click();
		
		WebElement prompdialogAlert= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt104\"]/span[2]"));
		prompdialogAlert.click();
		Alert promptAlert= driver.switchTo().alert();
		Thread.sleep(500);
		promptAlert.sendKeys("dominic");
		Thread.sleep(1500);
		promptAlert.accept();
			
	}

}
