package seleniumHandson;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonHandsOn {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\dominicroya\\\\eclipse-workspace\\\\lib\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://leafground.com/button.xhtml");
		
				
		//finding the height and width of the button
		WebElement ButtonSize=driver.findElement(By.id("j_idt88:j_idt92"));
		Dimension hwSize= ButtonSize.getSize();
		int hSize=hwSize.height;
		int wSize=hwSize.width;
		System.out.println("\nHeight of the button:"+hSize+"\nWidth of the button:"+wSize);
		
		//finding the height and width of the button using getRect()
		
		Rectangle rect = driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).getRect();
		int btnHeight=rect.getHeight();
		int btnWidth=rect.getWidth();
		System.out.println("\nHEIGHT :"+btnHeight + "\nWIDTH :"+btnWidth);
		System.out.println("\nHeight:"+rect.getDimension().height+"\tWidth"+rect.getDimension().width);
		System.out.println(rect.getDimension());
		
		//finding whether the button is disabled or not	
		WebElement ableButton=driver.findElement(By.id("j_idt88:j_idt107"));
		boolean status=ableButton.isEnabled();
		assertEquals(status, true);
			System.out.println("the button is enabled");
				
		
		WebElement disableButton= driver.findElement(By.id("j_idt88:j_idt92"));
		boolean buttonStatus=disableButton.isEnabled();
		if(buttonStatus==false)
			System.out.println("\n\nthe button is disabled");
		else System.out.println("\n\nthe button is enabled");
		
		//finding the color of the button and color of the button when mouse hover
		
		WebElement ButtonColor= driver.findElement(By.id("j_idt88:j_idt100"));
		String prevColor= ButtonColor.getCssValue("background-color");
		System.out.println("\n\nthe button colour is "+prevColor);
		
		Actions actionM = new Actions(driver);	
		actionM.moveToElement(ButtonColor).build().perform();
		String afterColor = ButtonColor.getCssValue("background-color");
		System.out.println("\n\nthe button colour after mouse hover is :"+afterColor);
		
		//finding the position of the button
		WebElement ButtonPosition= driver.findElement(By.id("j_idt88:j_idt90"));
		Point xypoint=ButtonPosition.getLocation();
		int xpoint=xypoint.getX();
		int ypoint=xypoint.getY();
		System.out.println("the position of x is"+xpoint+"\nthe position of y is "+ypoint);
		
		// finding the color of the given save button
		
		WebElement SaveButtonColor= driver.findElement(By.id("j_idt88:j_idt96"));
		String savebutColor= SaveButtonColor.getCssValue("background-color");
		System.out.println("\n\nthe button colour is "+savebutColor);
		
		
		
		
	}

}
