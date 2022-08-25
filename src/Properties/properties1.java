package Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class properties1 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	FileInputStream	load =new FileInputStream("C:\\Users\\Dinesh\\eclipse-workspace\\Selenium\\config.properties");
	Properties prop =new Properties();
	prop.load(load);
	WebDriver driver =new ChromeDriver();
	driver.get(prop.getProperty("url"));
	driver.manage().window().maximize();
	
	driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("txtpassword")).sendKeys(prop.getProperty("password"));
	driver.findElement(By.id("btnLogin")).click();
		
	
		
}
}