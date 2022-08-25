package iFRAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFRAMWORK {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/frames");
	driver.manage().window().maximize();
	
	WebElement ifram=driver.findElement(By.xpath("//*[@id='frame1']"));
	driver.switchTo().frame(ifram);
	  boolean text=driver.findElement(By.xpath("//*[@id='sampleHeading']")).getText().equals("This is a sample page");
	  System.out.println(text);
	
	}

}
