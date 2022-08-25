package bosttrapclander;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Bootstrappedcalender {
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://demo.automationtesting.in/Datepicker.html");
    driver.manage().window().maximize();
    
    
    driver.findElement(By.xpath("//*[@type='text']")).click();
     int a=0;
     while(a==0) {
    	String TEXT=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
    	if(!(TEXT.equals("August 1993")))
    		driver.findElement(By.xpath("//*[@class='ui-icon ui-icon-circle-triangle-w']")).click();
    	else
    		break;
    }
    driver.findElement(By.xpath("//*[text()='31']")).click();
  }
}