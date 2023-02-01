package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderHandson {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		WebElement dateTime=driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
		dateTime.click();
		//dateTime.sendKeys("10/26/1988"+Keys.ENTER);
		WebElement nextButton=driver.findElement(By.xpath("//*[@title='Next']"));   
		nextButton.click();
		WebElement findDate=driver.findElement(By.xpath("//a[contains(text(),'26')]"));
		findDate.click();
		
		
		driver.findElement(By.xpath("//*[@id=\"sample-box1\"]"));
		
		//driver.switchTo().defaultContent();
		//driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/a")).click();
		
		
		
		
		

	}

}
