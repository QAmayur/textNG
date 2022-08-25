package orange;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableCheckBOX {
	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".textInputContainer input#txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        //driver.findElement(By.xpath("//*[contains(@type,'checkbox')]")).click();
        Thread.sleep(2000);
       List <WebElement>ref=driver.findElements(By.xpath("//*[contains(@type,'checkbox')]"));
       for(WebElement print:ref) {print.click();//use click on danimecal value
       Thread.sleep(2000);
        //driver.findElement(By.xpath("//*[text()='Alice Duval']//parent::td//preceding-sibling::td")).click();
        
      

}
}}