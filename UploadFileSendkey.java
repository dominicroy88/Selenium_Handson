package seleniumHandson;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileSendkey {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); 
		
		driver.get("https://blueimp.github.io/jQuery-File-Upload/");
		
		WebElement uploadFiles=driver.findElement(By.xpath("//*[@id=\"fileupload\"]/div/div[1]/span[1]/input"));
		
		uploadFiles.sendKeys("C:\\\\Users\\\\dominicroya\\\\Downloads.\\\\How-to-turn-your-imagination-into-a-reality.jpg");
		
		driver.findElement(By.xpath("//span[.='Start upload']")).click();
		
		Thread.sleep(2000);
		
		boolean displayed=driver.findElement(By.xpath("//*[@id=\"fileupload\"]/table/tbody/tr/td[4]/button")).isDisplayed();
		
		assertTrue(displayed);
		
		System.out.println(displayed);
		
		

	}

}
