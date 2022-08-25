package orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingDROPDOWN {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@name='sign_up']")).click();
		
		Thread.sleep(2000);
		//WE USE FINDELEMENTS and list and for each loop  while handling  drop down cuz its multipler elements 
	List<WebElement> bdays = driver.findElements(By.xpath("//*[@name='birthday_day']//option"));
	for(WebElement days:bdays) {
		if(days.getText().equals("31"))days.click();
		
   List<WebElement> months = driver.findElements(By.xpath("//*[@id='month']//option"));
   for(WebElement month:months) {
	   if(month.getText().equals("Aug"))month.click();
   }}}}


