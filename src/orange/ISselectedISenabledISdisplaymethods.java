package orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISselectedISenabledISdisplaymethods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver =new ChromeDriver();
			
			driver.navigate().to("https://mbasic.facebook.com/");
			driver.manage().window().maximize();
	       driver.findElement(By.xpath("//*[@name='sign_up']")).click();
	       
	   
	  
	
	boolean m1= driver.findElement(By.xpath("//input[@name='sex']")).isSelected();
	System.out.println(m1);//if checkbok is unable than false
	driver.findElement(By.xpath("//input[@name='sex']")).click();
	boolean m2= driver.findElement(By.xpath("//input[@name='sex']")).isSelected();
	System.out.println(m2);//if check box is clicked than true
	

     boolean checks=driver.findElement(By.xpath("//input[@name='sex']")).isEnabled();
	System.out.println(checks);
	driver.findElement(By.xpath("//input[@name='sex']")).click();
	boolean checks1=driver.findElement(By.xpath("//input[@name='sex']")).isEnabled();
	System.out.println(checks1);

    //is disspayled method is use to verifay that element is display or not 
    //if its than it will print true if its not display than it will print false
     boolean check= driver.findElement(By.xpath("//*[@name='submit']")).isDisplayed();
    System.out.println(check);
	
	//its use in tearm and condition if useers select tearm and condistion than it will print true
	                                                          //  if user not select tearms and condition it print false
	}

}
