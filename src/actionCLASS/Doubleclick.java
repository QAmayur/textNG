package actionCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement ref=driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
		Actions doubleclicktarget=new Actions(driver);
		doubleclicktarget.doubleClick(ref).perform();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	
}

}
//Actions ref =new Actions (driver);
//ref.douboleclick(clickpoint).perform();
//driver.switchTo().alert().accept();