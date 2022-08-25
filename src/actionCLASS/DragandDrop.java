package actionCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
	WebElement 	dragoint=driver.findElements(By.xpath("//*[@id='fourth']//a")).get(0);
	
	    WebElement droppoint =driver.findElement(By.xpath("//*[@id='amt7']//li"));
	   Actions ref= new Actions(driver);
	   ref.dragAndDrop(dragoint, droppoint).build().perform();
		
}
}