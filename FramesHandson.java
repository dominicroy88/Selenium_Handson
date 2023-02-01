package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandson {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com");
		
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"menuform:m_frame\"]/a")).click();
		
		driver.switchTo().frame(0);
		WebElement frameButton1=driver.findElement(By.id("Click"));
		frameButton1.click();
		String changedTo=frameButton1.getText();
		System.out.println(changedTo);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement nestedbutton= driver.findElement(By.id("Click"));
		nestedbutton.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> Framespresent= driver.findElements(By.tagName("iframe"));
		int noOfFrames=Framespresent.size();
		System.out.println(noOfFrames);
		
		driver.switchTo().defaultContent();

	}

}
