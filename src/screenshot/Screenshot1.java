package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	static WebDriver driver;
	public void screenshot() throws IOException {
		TakesScreenshot ref=(TakesScreenshot)driver;
		File source =ref.getScreenshotAs(OutputType.FILE);
         File dis=   new File("C:\\Users\\Dinesh\\Desktop\\mayur\\New folder\\velocity.png");
         FileHandler.copy(source, dis);
       }
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		Screenshot1 ref2= new Screenshot1();
		ref2.screenshot();
		
		driver.quit();
	}
}

