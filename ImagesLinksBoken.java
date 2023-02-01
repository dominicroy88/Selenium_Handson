package seleniumHandson;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesLinksBoken {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dominicroya\\eclipse-workspace\\lib\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/broken");
		//To validate a image, when the attribute "natrualWidth" is zero then the image is broken
		// boolean imageDisplayed = (Boolean) ((JavascriptExecutor) driver).executeScript
		//("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", image);
		//Good Image Validating
		WebElement goodImg= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[1]"));
		
		if(goodImg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is Broken");
		} else System.out.println("The Image is not Broken");
		//Broken image Validating
		WebElement brokenImg= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/img[2]"));
		
		if(brokenImg.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is Broken");
		}else System.out.println("The Image is not Broken");
		
		//Validating a good working link this will send a HTTP Response code as 200
		String url="";
		List<WebElement>  links= driver.findElements(By.tagName("a"));
		System.out.println("Total Links in the pages "+links.size());
		
		for (WebElement link : links) {
			
			url=link.getAttribute("href");
			//System.out.println(url);
			verifyUrl(url);
			
		} 
		
		Thread.sleep(2000);
		driver.quit();
	}

	private static void verifyUrl(String link) throws IOException, MalformedURLException{
		
		try {
			URL url=new URL(link);
			//connecting with url and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()>=400)
				System.out.println(link+" - "+httpURLConnect.getResponseMessage()+" is a broken link");
			else System.out.println(link+" -"+httpURLConnect.getResponseMessage());
						
		} 
		
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
