package framework;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityscreenSHOT {

	static WebDriver driver;
	
	public void screenshot() throws IOException {
			TakesScreenshot  ss=(TakesScreenshot)driver;
	      File source= ss.getScreenshotAs(OutputType.FILE);
	      File dist= new File("C:\\Users\\Dinesh\\Desktop\\mayur\\red.png");
          FileHandler.copy(source, dist);
	}
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		 UtilityscreenSHOT 	ref=new  UtilityscreenSHOT ();
		 ref.screenshot();
		 driver.quit();
	}
	}