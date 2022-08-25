package selectcheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pending {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://admin-demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@value='admin']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("admin@yourstore.com");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("fa fa-bars")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[2]/a/p/text()")).click();
		driver.findElement(By.xpath
		("//i[@class='right fas fa-angle-left ']//parent::p//parent::a//parent::li//following-sibling::ul//li")).click();
		
		
	}

}
