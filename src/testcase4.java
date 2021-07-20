import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
			//CustomizedXPATH
		
		/*driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ishrahasan12@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@value='1']")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]")).getText());
		driver.navigate().back();*/
		
		//CustomizedCSS
		
		driver.findElement(By.cssSelector("[name='email']")).sendKeys("ishrahasan12@gmail.com");
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("hi");
		driver.findElement(By.cssSelector("[name='login']")).click();
		
		driver.close();

	}

}
