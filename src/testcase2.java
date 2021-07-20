import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //selenium code
		//Invoke.exe
		//Create driver object for chrome browser
		
		/*Class name=X
				x driver=new X();*/
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//Hit url on the browser 
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("ishrahasan12@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.navigate().back();
		driver.findElement(By.id("email")).sendKeys("ishrahasan12@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.linkText("Forgotten password?")).click();
		driver.navigate().back();
		
		/*driver.findElement(By.name("login")).click();
		driver.findElement(By.id("email"));
		driver.findElement(By.name("pass"));
		driver.findElement(By.name("login")).click();
		System.out.println(driver.findElement(By.xpath("//*[@id=\'email_container\']/div[2]")).getText());//To validate the error message
		*/
		driver.close();
		
	}
}