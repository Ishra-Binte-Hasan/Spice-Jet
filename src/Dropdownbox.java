import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		//s.selectByValue("BDT");
		//s.selectByIndex(1);
		s.selectByValue("USD");
		driver.findElement(By.id("divpaxinfo")).click();
		Select s1= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByIndex(3);
		Select s2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		s2.selectByIndex(2);
		Select s3=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		s3.selectByIndex(3);
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		//Dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Goa (GOI)']")).click();
		//or, driver.findElement(By.xpath("(//a[@text='Goa (GOI)'])[2]")).click();

		//driver.close();
		
		
		
		
		
		
		
	}

}
