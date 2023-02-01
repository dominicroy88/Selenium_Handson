package seleniumHandson;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileHandson {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/file.xhtml;jsessionid=node014mv76nxfj7vl1o3njzhdlgy3147990.node0");
		
		driver.findElement(By.xpath("//span[.='Download']")).click();
		
		Thread.sleep(1000);
		
		File filelocation = new File("C:\\\\Users\\\\dominicroya\\\\Downloads");
		
		File[]  totalFiles = filelocation.listFiles();
		
		for (File file : totalFiles) {
			
			if (file.getName().equals("TestLeaf Logo.png")){
				System.out.println("File Downloaded");
				break;
				
			}
		}
		
		
		
		

	}

}
