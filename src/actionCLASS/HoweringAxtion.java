package actionCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoweringAxtion {public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector(".textInputContainer input#txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
    driver.findElement(By.id("btnLogin")).click();
    
      WebElement ref=driver.findElement(By.id("menu_maintenance_purgeEmployee"));
    Actions hower=new Actions (driver);
    hower.moveToElement(ref).perform();

}
}