package locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fastedlocter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://mbasic.facebook.com/");
    driver.manage().window().maximize();
    driver.findElement(By.cssSelector("Create New Account")).click();//it is second fastes locater by using css selector
    driver.findElement(By.id("year")).click();//it is fastes locater  we have called id locater
    driver.findElement(By.className("bt bu bv")).click();// classname is a locater
    driver.findElement(By.name("birthday_month")).click();//name is also a locater
    
    driver.findElement(By.linkText("Facebook')] ")).click();// it will click on that particul text 
    driver.findElement(By.partialLinkText("Face")).click(); //it also click on partcilar text
    driver.findElement(By.tagName("input")).click();// 
    
    driver.findElement(By.xpath("birthday_month")).click();//xpath it is safeste and aqurier locter we have 
    
    }
}