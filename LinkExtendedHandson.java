package seleniumHandson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExtendedHandson {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dominicroya\\eclipse-workspace\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://leafground.com/link.xhtml");
		
		WebElement homepageLink= driver.findElement(By.linkText("Go to Dashboard"));
		homepageLink.click();
		
		driver.navigate().back();
		//finding the url without clicking the hyperlink
		WebElement findURL= driver.findElement(By.partialLinkText("Find the URL"));
		System.out.println("the URl is "+findURL.getAttribute("href"));
		//checking the hyperlink is broken or not simple method
		WebElement brokenUrl=driver.findElement(By.linkText("Broken?"));
		brokenUrl.click();
		String title=driver.getTitle();
		if(title.contains("404"))
			System.out.println("the link is broken");
		
		driver.navigate().back();
		//getting the no of links in the pages
		List<WebElement> noOflink= driver.findElements(By.tagName("a"));
		System.out.println("no of links in this page is :"+noOflink.size());
		//getting the no of links in the layout
		WebElement layout=driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[2]"));
		List<WebElement> layoutLink=layout.findElements(By.tagName("a"));
		System.out.println("No of links in this layout:"+layoutLink.size());
		//StaleElementReferenceException will be thrown as the page is reloaded.
		homepageLink.click();
		
		driver.quit();
		
		

	}

}
