package wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implictwait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://chercher.tech/practice/implicit-wait-example");
	    driver.manage().window().maximize();
	    
	   // driver.manage().timeouts().getPageLoadTimeout();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     int i=1;
	     while(i>0) {
	    driver.findElement(By.xpath("(//*[@id='q']//input)["+i+"]")).click();
	    i++;
	     }
	}
}

