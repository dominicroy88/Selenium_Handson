package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandson {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement sf=driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		Select sl = new Select(sf);
		sl.selectByValue("GUY");
		Thread.sleep(500);
		sl.selectByVisibleText("Australia");
		Thread.sleep(500);
		sl.selectByIndex(55);
		
		List<WebElement> ddlist= sl.getOptions();
		int listSize= ddlist.size();
		System.out.println("number of elements:"+listSize);
		
		sf.sendKeys("India");
		
		
		
	}

}
