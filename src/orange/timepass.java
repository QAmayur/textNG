package orange;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class timepass {
	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver"
					,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
		driver.get("https://demo.automationtesting.in/Index.html");
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.xpath("//*[text()='Skip Sign In']")).click();
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@type='text']")).sendKeys("mayur");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("hmmmm");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@rows='3']")).sendKeys("velocity 30th april bath pune");
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mahitnahi@gamil.com");
        driver.findElement(By.xpath("//*[@type='tel']")).sendKeys("9552088522");
        Thread.sleep(2000);
       /*driver.findElement(By.xpath("//*[@type='radio']")).click();
        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("msdd")).click();
        Thread.sleep(2000);*/
        
        driver.findElement(By.xpath("//*[@lang='en']")).click();
        JavascriptExecutor m1=(JavascriptExecutor) driver;
        m1.executeAsyncScript("window.scrollBy(0,300)");
        
        driver.findElement(By.id("msdd")).click();
        WebElement lang= driver.findElement(By.xpath
        ("//*[@class='ui-autocomplete ui-front ui-menu ui-widget ui-widget-content ui-corner-all']//li"));
        Select diflang = new Select (lang);
        diflang.selectByIndex(7);
        
        List<WebElement> pro=driver.findElements(By.id("Skills"));
        for(WebElement skill:pro) {
        	if(skill.getText().equals("Java"))skill.click();
        }
          
        WebElement region=driver.findElement(By.xpath("select2-selection select2-selection--single"));
        Select countries= new Select(region);
        countries.selectByValue("5");
        
        WebElement year = driver.findElement(By.xpath("//*[@ng-model='yearbox']//option"));
        Select years = new Select(year);
        years.selectByVisibleText("1993");
        
        WebElement month= driver.findElement(By.xpath("//*[@ng-model='monthbox']//option"));
        Select months =new Select(month);
        months.selectByValue("8");
        
        WebElement day=driver.findElement(By.xpath("//*[@ng-model='daybox']//option"));
        Select days = new Select(day);
        days.selectByIndex(32);
       
       WebElement action=driver.findElement(By.xpath("//*[@id='firstpassword']"));
       Actions act= new Actions(driver);
       act.sendKeys(action,"mayur@123").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
       act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
       
       WebElement past= driver.findElement(By.xpath("//*[@id='secondpassword']"));
       past.click();
       act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
      
       String w1=driver.getWindowHandle();
       System.out.println(w1);
       
       driver.findElement(By.xpath("//*[text()='\"All Rights Reserved.\"']")).click();
       Set <String>  allwin= driver.getWindowHandles();
       
       for(String ref:allwin) {
    	   driver.switchTo().window(ref);
    	   if(driver.getTitle().contains(w1));
       }
       
       
        
        
        
        driver.findElement(By.xpath("//*[@class='select2-search__field']")).sendKeys("India");
      }
	}
	
