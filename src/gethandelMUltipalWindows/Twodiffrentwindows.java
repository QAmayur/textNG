package gethandelMUltipalWindows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twodiffrentwindows {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
       String ref=driver.getWindowHandle();
       Thread.sleep(2000);
      driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
      Set <String>ref2=driver.getWindowHandles();
      
      for(String window:ref2) {
    	  if(!window.equals(ref))
    		  driver.switchTo().window(window);
    	  Thread.sleep(2000);
      }
      
      driver.switchTo().window(ref);
     }
	}

