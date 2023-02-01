package seleniumHandson;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeOn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dominicroya\\eclipse-workspace\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		String title="Swag Labs";
		driver.get("https://www.saucedemo.com/");
		
		String pageTitle= driver.getTitle();
		System.out.println(pageTitle);
		
		if (pageTitle != title)
			System.out.println("Page title matched");
		else System.out.println("page title not matched");
		
		driver.quit();
		

	}

}
