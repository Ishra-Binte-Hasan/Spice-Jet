import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class testcase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Downloads (D drive)\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		/*XPath:
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("ashabhnsbs");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("ashabhnsbs");
		driver.findElement(By.xpath("//*[@id=\'u_0_h_uP\']")).click();
	*/
	//CSSPATH:
		driver.findElement(By.cssSelector("#email")).sendKeys("kfjdk");
		driver.findElement(By.cssSelector("#pass")).sendKeys("kfjdk");
		driver.findElement(By.cssSelector("#u_0_h_uP")).click();
		driver.findElement(By.xpath("//*[@id='u_0_e_qe']/div[3]/a")).click();
	

	}

}
