package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Crg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://192.168.10.96:3000/");
		
		driver.findElement(By.id("inputboxe1")).sendKeys("crg_user3");   //*[@id="inputboxe1"]

		driver.findElement(By.id("inputboxe2")).sendKeys("250785743904");
 
		driver.findElement(By.xpath("//*[@id=\"inputboxe1\"]"));    //*[@id="inputboxe1"]

	}

}
