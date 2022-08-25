package handlingDropDownindiffentWays;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDropDownby {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://mbasic.facebook.com/");
    driver.manage().window().maximize();
    driver.findElement(By.xpath("//input[@value='Create New Account']")).click();
    
    List <WebElement> year=driver.findElements(By.xpath("//select[@id='year']//option"));
    for(WebElement years :year) {
    	if (years.getText().equals("1993"))years.click();
    }

    List <WebElement> month=driver.findElements(By.xpath("//select[@id='month']//option"));
    for(WebElement months:month) {
    	if (months.getText().equals("Aug"))months.click();
    	
    }
    Thread.sleep(2000);

    List <WebElement> day=driver.findElements(By.xpath("//select[@id='day']//option"));
    for(WebElement days:day) {
    	if (days.getText().equals("31"))days.click();
    }

}
}