package handlingDropDownindiffentWays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selecclasstmethods {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://mbasic.facebook.com/"); //  both methods hit url link	
	driver.get("https://mbasic.facebook.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@value='Create New Account']")).click();
     Thread.sleep(3000);
     
    WebElement day= driver.findElement(By.xpath("//*[@id='day']"));
    Select days= new Select(day);
    days.selectByValue("31");
    Thread.sleep(1000);
    WebElement month=driver.findElement(By.xpath("//*[@id='month']"));
    Select months=new Select(month);
    months.selectByIndex(7);
    Thread.sleep(1000);
   WebElement year=driver.findElement(By.xpath("//*[@id='year']"));
   Select years= new Select (year);
   years.selectByValue("1993");
}
	}
