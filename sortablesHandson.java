package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortablesHandson {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/sortable/");
		
		driver.switchTo().frame(0);
		
		List<WebElement> firstList = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));	
		
		WebElement from=firstList.get(0);
		WebElement to= firstList.get(3);
		
		Actions action= new Actions(driver);
		
		action.clickAndHold(from);
		action.moveToElement(to);
		action.release(to);
		action.build().perform();
		/*action.clickAndHold(firstList.get(0));
		action.moveToElement(firstList.get((firstList.size())-3));
		action.release(firstList.get((firstList.size())-3));
		action.build().perform();
		
		for (WebElement wb : firstList) {
			if(wb.getText().contentEquals("Item 1")) {
				action.clickAndHold(wb);
				Thread.sleep(1000);
				action.moveToElement(firstList.get((firstList.size())-3));
				action.release(firstList.get((firstList.size())-3));
				action.build().perform();
				//System.out.println(wb.getText());
			}
		}*/
		
		
    }
		
		
}