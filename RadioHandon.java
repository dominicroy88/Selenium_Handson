package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioHandon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/radio.xhtml;jsessionid=node01ujq5331az3ttp6hzwe2a3rtc36658.node0");
		Thread.sleep(3000);
		
		WebElement radioBrowser = driver.findElement(By.xpath("//*[@id=\"j_idt87:console1\"]/tbody/tr/td[1]/div/div[2]/span"));   
		radioBrowser.click();
		
		WebElement check1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:0\"]"));
		boolean checkC=check1.isSelected();
		WebElement check2 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:1\"]"));
		boolean checkF=check2.isSelected();
		WebElement check3 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:2\"]"));
		boolean checkS=check3.isSelected();
		WebElement check4 = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2:3\"]"));
		boolean checkE=check4.isSelected();
			
		if (checkC == true)
			System.out.println("Default Selected browser is Chrome");
		else if (checkF == true)
			System.out.println("Default Selected browser is Firefox");
		else if (checkS == true)
			System.out.println("Default Selected browser is Safari");
		else if (checkE == true)
			System.out.println("Default Selected browser is EDGE");
		else
			System.out.println("no Browser is selected");
		

	}

}
