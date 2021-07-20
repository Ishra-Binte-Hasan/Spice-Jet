import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Aizawl (AJL)')]")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT'] //input[@text='Chennai (MAA)']")).click();
        driver.findElement(By.xpath("(//a[@text='Chennai (MAA)'])[2]")).click();
        
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        
        
        
        
        
        
        driver.findElement(By.id("divpaxinfo")).click();
        Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("3");
        Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
        s1.selectByValue("3");
        Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
        s2.selectByValue("4");
       
       driver.close();
	}

}
