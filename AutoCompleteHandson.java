package seleniumHandson;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteHandson {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://demoqa.com/auto-complete");
		
		driver.get("https://www.google.co.in");
		
		driver.switchTo().frame(0);		
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("bangalore");
		
		
		/*WebElement ACtextBox= driver.findElement(By.xpath("//input[@class='gLFyf']")); 
		ACtextBox.sendKeys("bangalore");*/
				
				
				
				
		/*List<WebElement> optionsToSelect = driver.findElements(By.id("autoCompleteMultipleInput"));
		int ListSize=optionsToSelect.size();   /html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input
		System.out.println(ListSize); */
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*List<WebElement> optionsToSelect = driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));  //*[@id="autoCompleteMultipleContainer"]/div/div[1]/div[2]/div
		int ListSize=optionsToSelect.size();
		System.out.println(ListSize);
		//optionsToSelect.get(4).click();
		for(WebElement option : optionsToSelect){
		    System.out.println(option);
		}
		    if(option.getText().equals(textToSelect)) {
		        System.out.println("Trying to select: "+textToSelect);
		        option.click();
		        break;
		    }
		
		//
		WebElement ACtextBox= driver.findElement(By.className("ui-autocomplete-input"));
		ACtextBox.sendKeys("s");
		
		List<WebElement> listOption= driver.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		for (WebElement x : listOption) {
			
			System.out.println(x);
		*/	
		}
		
		

	}


