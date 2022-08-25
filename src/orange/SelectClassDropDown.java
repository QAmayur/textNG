package orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDropDown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	 
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://mbasic.facebook.com/");
	driver.findElement(By.xpath("//input[@value='Create New Account']")).click();
	
    WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
    Select years=new Select(year);
    years.selectByVisibleText("1993");
    //we are using select  methods and creat new obj by using new keyword and then  select class down handling
    //we selecting singel element from multiple elements
   
    WebElement month=driver.findElement(By.xpath("//*[contains(@id,'month')]"));
    Select months=new Select(month);
    months.selectByValue("8");
    
    
   WebElement day=driver.findElement(By.xpath("//*[@id='day']"));
    Select days=new Select(day);
    days.selectByIndex(32);
	
}
}
