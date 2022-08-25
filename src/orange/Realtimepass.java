package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Realtimepass {
public static void main(String[] args)throws Exception {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://mbasic.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@value='Create New Account']")).click();

	WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
	WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
	WebElement days=driver.findElement(By.xpath("//*[@id='day']"));
	
	Select months =new Select(month);
	months.selectByValue("8");
	
	Select years=new Select(year);
	years.selectByVisibleText("1993");
	
	Select day=new Select(days);
	day.selectByIndex(32);
	
	
	
	
	
	
}

}
