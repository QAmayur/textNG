package dropdowncheckboxs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAllCheckBox {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();
	driver.findElement(By.xpath("//*[text()='Admin']")).click();
	Thread.sleep(2000);
	//all check box get click
    /* List <WebElement> ref=driver.findElements(By.xpath("//*[text()='Username']//parent::th//preceding-sibling::th"));
     for(WebElement checkbox:ref)
     
     
    	 checkbox.click();*/
	//singel and particural check box click
      WebElement singelcheckbox =driver.findElement(By.xpath("//*[text()='Kiyara.Hu']//parent::td//preceding-sibling::td"));
      singelcheckbox.click();
	
	
	//driver.findElement(By.xpath(""))

}
}