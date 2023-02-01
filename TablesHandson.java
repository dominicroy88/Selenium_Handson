package seleniumHandson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TablesHandson {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dominicroya\\eclipse-workspace\\lib\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
	
		driver.navigate().to("https://letcode.in/advancedtable");
		
		WebElement sf=driver.findElement(By.xpath("//*[@id=\"advancedtable_length\"]/label/select"));
		Select sl = new Select(sf);
		sl.selectByValue("25");
		
		List<WebElement> columns = driver.findElements(By.tagName("th"));
		System.out.println("No of Columns: "+columns.size());
		
		List<WebElement> rows= driver.findElements(By.tagName("tr"));
		System.out.println("No of rows: "+rows.size());
		
		WebElement getmail =driver.findElement(By.xpath("//td[normalize-space()='University of Aberdeen']//following::td[2]"));
		System.out.println("University of Aberdeen Mail id is : "+getmail.getText());
		
		//selecting the email id column and getting its length into a Array List
		//Finding the least length in the array and printing the corresponding college name
		
		//Creating a Array List to store the length of the mailid
		List<Integer> lenOfMailI= new ArrayList<Integer>();
		//Creating a WebElemet List and storing the mail id
		List<WebElement> lengthOfMail= driver.findElements(By.xpath("//td[4]"));
		//Using For Each, getting the elements from the list, getting the length and adding it to List<Integer>
		for (WebElement webElement : lengthOfMail) {
			
			String local =webElement.getText();
			int lenlocal=local.length();
			lenOfMailI.add(lenlocal);		
			
		}
		//Finding the least value in the List
		int leastlen=Collections.min(lenOfMailI);
		//Creating a String variable "id" for storing the text of the 
		String id="";
		//Using For Each, finding the webElement by comparing the length of webElement of the least length 
		for (WebElement mail : lengthOfMail) {
			
			if(mail.getText().length()== leastlen)
				id= mail.getText();				
				
		}
		//Printing the text of the webElement having least length
		System.out.println(id);
		//storing the xpath in a String Variable to find the corresponding college name
		String finalpath="//td[normalize-space()='"+ id + "']//preceding::td[2]";
		WebElement univname =driver.findElement(By.xpath(finalpath));
		System.out.println(univname.getText());
		//WebElement getmail =driver.findElement(By.xpath("//td[normalize-space()='University of Aberdeen']//following::td[2]"));
		
		//Check	the xpath  
		// System.out.println("//td[normalize-space()='"+ id + "']//preceding::td[2]");
		// this below xpath gives the corresponding univname. 
		//td[4]//preceding::td[2]
	
		driver.quit();

	}

}
