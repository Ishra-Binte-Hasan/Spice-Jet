import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://login.salesforce.com/?locale=in");

     driver.findElement(By.cssSelector("#username")).sendKeys("Hi");
     driver.findElement(By.cssSelector("#password")).sendKeys("hi");
     driver.findElement(By.cssSelector("#rememberUn")).click();
     driver.findElement(By.cssSelector("#Login")).click();     
	}

}
