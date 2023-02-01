package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBrokenLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://phptravels.com/demo/");

			 // Store all link elements (anchor tag elements in html) in a list
		List<WebElement> links = driver.findElements(By.tagName("a"));
			 // Print no. of links stored in list
		System.out.println(links.size());

		for (int i = 1; i<=links.size(); i=i+1)
			{

			// Print text of all the links
			System.out.println(links.get(i).getText());

			}

		}
			 
}
