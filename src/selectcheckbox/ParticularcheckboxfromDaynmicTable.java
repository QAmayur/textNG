package selectcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParticularcheckboxfromDaynmicTable {
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
	    driver.findElement(By.xpath("//a[text()='Aravind']//parent::td//preceding-sibling::td//input")).click();
	    


}
}