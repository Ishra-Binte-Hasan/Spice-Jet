import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

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
	
		System.out.println(driver.getTitle()) ;//validate if your page title is correct
		
		System.out.println(driver.getCurrentUrl());	//validate if you are landed on correct url
		
		System.out.println(driver.getPageSource());//print page source
		
		driver.get("http://www.facebook.com");
		driver.navigate().back();//go back to previous page
		driver.navigate().forward();
		driver.close();//close the current website
		driver.quit();//close all the websites 
		
	}
 
}
