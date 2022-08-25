
package actionCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickANDholdANDrealease {
	public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
    WebElement clickhold =driver.findElements(By.xpath("//*[@id='fourth']//a")).get(0);
    WebElement  droppoint= driver.findElement(By.xpath("//*[@id='amt7']//li"));
    Thread.sleep(2000);
	Actions ref =new Actions(driver);
	ref.clickAndHold(droppoint).moveToElement(droppoint).release().build().perform();
}
}

//Actions ref=new Actions (driver);
//ref.clickAndHold(source).noveToElement(dist).release().build().perform();