package seleniumHandson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropHandson {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com");

		driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a")).click();
		
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@id=\"menuform:m_drag\"]/a")).click();
		
		//WebElement dragblock= driver.findElement(By.id("form:conpnl_header"));
		WebElement dragFrom= driver.findElement(By.id("form:drag_content"));
		WebElement dropTo= driver.findElement(By.id("form:drop_content"));
		
		Actions action= new Actions(driver);
		
		//action.clickAndHold(dragFrom).moveToElement(dropTo).release().build().perform();
		action.dragAndDrop(dragFrom, dropTo).build().perform();
		System.out.println(dropTo.getText());
		
		//action.dragAndDropBy(dragblock, 100, 100);
		
		//WebElement category=driver.findElement(By.id("form:j_idt94:j_idt95"));
		
		
		//action .dragAndDrop(category, quantity).build().perform();
		//action.clickAndHold(category).moveToElement(quantity).release().build().perform();
		
		//WebDriverWait w=new WebDriverWait(driver, 30);
		//w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"form:j_idt125\\\"]/span[1]")));
		
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[1]"));
		int lwidth= slider.getSize().width;
		System.out.println(lwidth);
		action.dragAndDropBy(slider, lwidth*3, 0).build().perform();
		
		WebElement lslider=driver.findElement(By.xpath("//*[@id=\"form:j_idt125\"]/span[2]"));
		int rwidth=lslider.getSize().width; 
		System.out.println(rwidth);
		action.dragAndDropBy(lslider,-rwidth*2, 0).build().perform();
		

	}

}
