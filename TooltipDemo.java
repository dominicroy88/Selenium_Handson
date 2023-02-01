package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TooltipDemo {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2019/09/bootstrap-tooltip-in-selenium.html");
		
		Actions action =new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Hover over me']"))).perform();
		String buttonTooltipText = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();	 	
		System.out.println(buttonTooltipText);
		
		/*driver.switchTo().frame(1);
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div[1]/span/span"))).perform();
		String buttooltip= driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div[1]/span/span")).getText();
		System.out.println(buttooltip);
*/
	}
}