package basciscommends;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bassiccommends {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver"
				,"C:\\Users\\Dinesh\\Desktop\\mayur\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.youtube.com/");
    driver.manage().window().maximize(); //to maximize windows
		
       String tittle=driver.getTitle();// to prind tittle in consol
       System.out.println(tittle);
       
    String  curenturl = driver.getCurrentUrl();
    System.out.println(curenturl);    //print url in consol
    
    driver.navigate().refresh();//"      use to navigate   ""
    driver.navigate().forward();//""       -------     ""
    driver.navigate().back() ;// ""        -------  ""	}
    
    driver.close();//.closed will clossed  current tab on browswer 
    
    driver.quit(); //.quit it will quit all the tabs  aswell as browser
}
}


