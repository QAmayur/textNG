package gethandelMUltipalWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultilpeWindowsHandel {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
	
		String window1 =driver.getWindowHandle();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set <String>winds=driver.getWindowHandles();
	    
		for(String ref:winds) {
			driver.switchTo().window(ref);
			if(driver.getTitle().contains("OrangeHRM")) {
            driver.switchTo().window(window1);
            Thread.sleep(2000);     
          }
		}
	}
  }