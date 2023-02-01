package seleniumHandson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileHandson {

	public static void main(String[] args) throws InterruptedException, AWTException {
	
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
		driver.get("https://leafground.com/file.xhtml;jsessionid=node014mv76nxfj7vl1o3njzhdlgy3147990.node0");
		
		//Thread.sleep(2000);
		//the below code is working
		//WebElement uploadfile=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89_input\"]"));
		//uploadfile.sendKeys("C:\\\\Users\\\\dominicroya\\\\Downloads\\\\Test_Plan_document.pdf");
		
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt89\"]/span[1]")).click();  
		
		String filelocation= "C:\\Users\\dominicroya\\Downloads\\Test_Plan_document.pdf";
		
		StringSelection selection= new StringSelection(filelocation);
				
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		
		System.out.println("selection" +selection);
		
		Robot robot= new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
	}

}


