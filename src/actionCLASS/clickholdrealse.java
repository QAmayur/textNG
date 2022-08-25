package actionCLASS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickholdrealse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/slider/");
	driver.manage().window().maximize();
	
	WebElement ifram=driver.findElement(By.xpath("//*[@class='demo-frame']"));
	driver.switchTo().frame(ifram);
	WebElement holdpoint=driver.findElement(By.id("slider"));
	Actions hold=new Actions(driver);
	hold.dragAndDropBy(holdpoint, 730, 0).perform();
	}

}
//Action ref=new Actions (driver);
//ref.dragAndDrop(source and dis).build().perform();