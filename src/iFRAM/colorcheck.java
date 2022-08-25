package iFRAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class colorcheck {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/#colorpicker");
	driver.manage().window().maximize();
	
    WebElement  iframe =driver.findElement(By.xpath("//*[@class='demo-frame']"));
    driver.switchTo().frame(iframe);
    
   WebElement coloradr=driver.findElement(By.xpath("//*[@id='red']"));
   String colour=coloradr.getCssValue("color");
   System.out.println(colour);
	

}
}
