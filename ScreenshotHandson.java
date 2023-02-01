package seleniumHandson;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotHandson {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://letcode.in/buttons");
		
		File file =((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	
		//File dest= new File("./snapshot/img.png");
		
		File dest= new File("C:\\\\Users\\\\dominicroya\\\\Downloads\\\\dominic.png");
		
		FileHandler.copy(file, dest);
		
		WebElement part= driver.findElement(By.xpath("/html/body/app-root/app-buttons/section[1]/div/div/div[2]/app-learning-point/div"));
		
		File partsrc =((TakesScreenshot)(part)).getScreenshotAs(OutputType.FILE);
		
		File partdest= new File("./snapshot/img.png");
		
		FileHandler.copy(partsrc, partdest);
		
		driver.quit();

	}

}
