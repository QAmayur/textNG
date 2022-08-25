package scrollupandDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingCoMands {
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
		    driver.findElement(By.xpath("//b[text()='Admin']")).click();
		   JavascriptExecutor ref=(JavascriptExecutor)driver;
		   ref.executeScript("windows.scrollBy(0,800");
		   Thread.sleep(2000);
		   
		   JavascriptExecutor ref2=(JavascriptExecutor)driver;
		   ref2.executeScript("windows.scrollBy(0,-600");
		   
		
	}

}
