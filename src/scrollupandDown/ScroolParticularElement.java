package scrollupandDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScroolParticularElement {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".textInputContainer input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
	    driver.findElement(By.xpath("//b[text()='Admin']")).click();
	    
	  WebElement checkbox= driver.findElement
			  (By.xpath("//a[text()='Melan.Peiris']//parent::td//parent::td//preceding-sibling::td//input"));
	JavascriptExecutor ref2= (JavascriptExecutor)driver;
	ref2.executeScript("arguments[0]. scrollIntoView()", checkbox );
	 checkbox.click();
       
	}
}