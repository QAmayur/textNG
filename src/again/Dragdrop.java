package again;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Dragdrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
		,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
			
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.manage().window().maximize();
	    driver.findElement(By.id("twotabsearchtextbox"))
	    .sendKeys("OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage");
	   WebElement ref1=driver.findElement(By.id("nav-search-submit-text"));
	    ref1.click();
	   String ref =driver.findElement(By.className("a-link-normal s-underline-text"
	    		+ " s-underline-link-text s-link-style a-text-normal")).getText();
	   if (ref.contains("OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage")) {
		   driver.findElement(By.xpath("OnePlus Nord CE 2 5G (Bahamas Blue, 8GB RAM, 128GB Storage")).click();
	   }
	   else {
			   System.out.println("is not present ");
		   
	   }
	   
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
	     driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
	     
	    
	}
	}

		