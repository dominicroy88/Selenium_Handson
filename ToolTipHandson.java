package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTipHandson {

	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/tool-tips");
		
		Actions action =new Actions(driver);
		
		 
		//WebElement textToolTip = driver.findElement(By.xpath("//*[@id=\"toolTipTextField\"]"));
		//WebElement refToolTip = driver.findElement(By.xpath("//*[@id=\"texToolTopContainer\"]/a[1]"));
		
		
		action.moveToElement(driver.findElement(By.xpath("//button[@id='toolTipButton']"))).perform();
		String buttonTooltipText = driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();	 	
		System.out.println(buttonTooltipText);
		
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Contrary']"))).perform();
		String linktooltext= driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();  
		System.out.println(linktooltext);
		
		action.moveToElement(driver.findElement(By.xpath("//*[@id=\"toolTipTextField\"]"))).perform();
		String textTipText= driver.findElement(By.xpath("//div[@class='tooltip-inner']")).getText();  
		System.out.println(textTipText);
		
		
		
		//import.org.testng.Assert;//for testng framework to be imported
		//Assert.assertTrue(buttonTooltipText.contains("You hovered over the Button"));// this will give the result: Passed:
	}

}

