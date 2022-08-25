package actionCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KEYUPandKEYDOWN {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		WebElement ref=driver.findElement(By.id("txtUsername"));
		Actions copyact=new Actions(driver);
		copyact.sendKeys(ref,"mayur").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		copyact.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		WebElement ref2=driver.findElement(By.id("txtPassword"));
		ref2.click();
		copyact.keyDown(Keys.COMMAND).sendKeys("V").keyUp(Keys.CONTROL).build().perform();
		
		
	
		
		
	
}}