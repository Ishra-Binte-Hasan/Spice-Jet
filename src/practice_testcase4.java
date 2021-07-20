import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_testcase4 {
	
   public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div[2]/input")).sendKeys("https://www.facebook.com/");//Parent-child xpath relationship
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//center/input")).click(); //Parent-child xpath relationship
		//driver.findElement(By.xpath("//input[contains(@class,'gNO89b')]")).click();
		//driver.findElement(By.xpath("driver.findElement(By.xpath(\"//div[@class='FPdoLc lJ9FBc']//center/input\"))")).click();//using chropath
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ishrahasan12@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("RAIMA02091995@");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/button[1]")).click();
		driver.close();
		
		


			
				
	}

}
