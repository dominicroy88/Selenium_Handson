package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortablesHandson {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/sortable");
		
		List<WebElement> firstList = driver.findElements(By.xpath("//div[@id=\"cdk-drop-list-0\"]"));
		
		List<WebElement> secondList= driver.findElements(By.xpath("//div[@id=\"cdk-drop-list-1\"]"));  
		
		/*for (WebElement webElement : firstList) {
			
			System.out.println("\n"+webElement.getText());
			
		}
		
		for (WebElement webElement :secondList) {
			
			System.out.println("\n"+webElement.getText());
			
		}*/
		
		Actions action= new Actions(driver);
		
		for (WebElement fList : firstList) {

			if(fList.getText().contentEquals("Go home")) {
				action.clickAndHold(fList);
				action.moveToElement(secondList.get(0));			
				action.release(secondList.get(0));
				action.build().perform();
			}
			
			
		

		}
		
		/*for (WebElement nList : secondList) {
			
			if(nList.getText().contentEquals("Check e-mail"))
				action.clickAndHold(nList);
				action.moveToElement(firstList.get(firstList.size()-1));
				action.release(firstList.get(firstList.size()-1));
				action.build().perform();
				
			
		}*/
		
		/*List<WebElement> newList= driver.findElements(By.xpath("//div[@id=\"cdk-drop-list-1\"]"));  
		for (WebElement webElement :newList) {
			
			System.out.println("\n"+webElement.getText());
			
		}*/

			
		

	}

}
