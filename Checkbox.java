package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/checkbox.xhtml;jsessionid=node01h9xjogmp9pq81qqhd1q3q4goe36768.node0");
		
		WebElement checkfirst= driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]"));
		checkfirst.click();
		boolean status = checkfirst.isSelected();
		System.out.println(status);
		Thread.sleep(3000);
		
		
		WebElement checksecond= driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]"));
		checksecond.click();
		boolean status1 = checksecond.isSelected();
		System.out.println(status1);
		Thread.sleep(1000);
		checksecond.click();
		boolean status2 = checksecond.isSelected();
		System.out.println(status2);
		Thread.sleep(2000);
		checkfirst.click();
		
		/*WebElement checkselected= driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[1]/div/div[2]"));
		boolean status1 = checkselected.isSelected();
		System.out.println(status1);
		
		//boolean status = checkfirst.isSelected();
		
		//System.out.println(status);//*
		
		if (status == true)
			System.out.println("the checkbox is selected");
		else if (status == false)
			System.out.println("the checkbox is unselected");
		*/
	
		
		


	}

}
