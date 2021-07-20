import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //selenium code
		//Invoke.exe
		//Create driver object for firefox browser
		
		/*Class name=X
				x driver=new X();*/
		System.setProperty("webdriver.gecko.driver", "D:\\Downloads (D drive)\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.firefox.com/");
		System.out.println(driver.getTitle()) ;
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id='email']")).click();
		
		
		
		
	}

}
