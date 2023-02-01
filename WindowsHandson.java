package seleniumHandson;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandson {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/");
		Thread.sleep(1000);

		//Opening the window tab from the menu
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]")).click();  
		driver.findElement(By.xpath("//*[@id=\"menuform:m_window\"]/a")).click();

		//Storing the current window handle 
		String firstwin=driver.getWindowHandle();
		
		//(1)Finding and Clicking the button on the pages to open a new Tab 
		WebElement newWindowbutton=driver.findElement(By.xpath("//*[@id=\"j_idt88:new\"]/span"));
		newWindowbutton.click();
		Thread.sleep(1000);

		//Saving the new tabs in a arrayList to toggle between tabs in same window
		ArrayList<String> winList=  new ArrayList<String>(driver.getWindowHandles());
		//Swithing the control from parent tab to the newly opened tab.
		driver.switchTo().window(winList.get(1));

		//Performing actions in the new tab and closing it.
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt38\"]/a/i[1]")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"menuform:m_auth\"]/a")).click();        
		Thread.sleep(1000);
		driver.close();
		Thread.sleep(1000);

		//Switching the control back to the parent tab of the window.
		driver.switchTo().window(firstwin);
		//driver.switchTo().defaultContent();
		Thread.sleep(1000);

		//(2)Performing: no. of window opened except the parent window
		WebElement noOfWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span"));
		noOfWindow.click();

		//int numberOfWindows=driver.getWindowHandles().size();
		//System.out.println("number of windows open:"+numberOfWindows);
        //OR
		//Storing the newly opened window into a String set which include the parent window
		Set<String> newHandles= driver.getWindowHandles();
		//Removing the parent window from the Set
		newHandles.remove(firstwin);
		//Getting the size of the String set into a integer.
		int numberOfWindows=newHandles.size();
		System.out.println("number of windows newly open:"+numberOfWindows);
		
		//(3)Closing the newly opened window
		WebElement closeWindow = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]/span[2]"));
		closeWindow.click();
		
		//Storing the newly opened window in Set String
/*		Set<String> closeNewhandles= driver.getWindowHandles();
		//Removing the parent window which is first in string Set 
		closeNewhandles.remove(firstwin);
		//Switching the control of the window from one to another using For Each and close it

		for (String closenew : closeNewhandles) {

			driver.switchTo().window(closenew);
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]")).click();
			Thread.sleep(1000);
			driver.close();

		}		
*/
		 	 
		//Saving the new window handles in Set<String> to toggle between windows
		Set<String> closenewwin= driver.getWindowHandles();
		//Switching the control of the window from one to another using For Each and close it
		//without removing the parent in the Set.
		for (String allWind : closenewwin) {

			if(!allWind.equals(firstwin)) {
				driver.switchTo().window(allWind);
				driver.close();
			}
		}
		driver.quit();
	}

}
