package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxHandon {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com");
		
		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]/a")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt88:name")).sendKeys("dominic roy");
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:age\"]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys(", Tamil Nadu");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt106:float-input")).sendKeys(Keys.ENTER);
		
		Thread.sleep(500);
		
		WebElement disabledBox = driver.findElement(By.id("j_idt88:j_idt93"));
		boolean boxStatus=disabledBox.isEnabled();
		
		if (boxStatus == false) {
				System.out.println("the testBox is disabled");
		}
		else {System.out.println("the textBox is enabled");}
		driver.findElement(By.name("j_idt106:auto-complete_input")).sendKeys("ROY");
		
		Thread.sleep(500);
		
		//driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete\"]/button")).click();
		
		//Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt106:auto-complete_panel\"]/ul/li[4]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt88:j_idt95")).clear();
		
		Thread.sleep(500);
		
		WebElement retrivexbox=driver.findElement(By.id("j_idt88:j_idt97"));
		String contentinbox= retrivexbox.getAttribute("value");
		System.out.println(contentinbox);
		
		Thread.sleep(500);
		
		WebElement dobBox=driver.findElement(By.id("j_idt106:j_idt116_input"));
		dobBox.sendKeys("10/26/1988");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt116_panel\"]/div/div[2]/table/tbody/tr[5]/td[4]/a")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt106:j_idt118_input")).sendKeys("100000000"+Keys.ENTER);
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt106:slider")).sendKeys("80");
		
		Thread.sleep(500);
		
		WebElement emailbox = driver.findElement(By.id("j_idt88:j_idt99"));
		emailbox.sendKeys("dominicroy@gmail.com"+ Keys.TAB +"welcome to Automation testing");
		
		Thread.sleep(500);
		
		driver.findElement(By.id("j_idt106:j_idt122")).click();
		
			
		Thread.sleep(500);
		
		//driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div[2]/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]")).sendKeys("Marvels"+ Keys.ENTER + "DC" +  Keys.ENTER +"Warner Bros");
		
		Thread.sleep(500);
		
	    driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_editor\"]/div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a"));
	    
	    Thread.sleep(500);
	    
	    WebElement textEditFont =driver.findElement(By.xpath("//span[@class='ql-picker-label']"));
		textEditFont.click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//span[@class='ql-picker-item'])[3]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt103_toolbar\"]/span[1]/span[2]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//span[@class='ql-picker-item'])[6]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//button[@class='ql-list'])[1]")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//button[@class='ql-list'])")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("(//button[@class='ql-list ql-active'])")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt124_editor\"]/div[1]")).sendKeys("Marvels"+ Keys.ENTER + "DC" +  Keys.ENTER +"Warner Bros");
		
		
		
		
		

	}

}
