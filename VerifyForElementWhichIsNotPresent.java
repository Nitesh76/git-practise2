package webDriver.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyForElementWhichIsNotPresent {
      
	public static void main(String[] args) {
		new VerifyForElementWhichIsNotPresent().testCase();
	}

	public void testCase() {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		// get url 
		driver.get("http://www.google.co.in");
	      
		try {
			WebElement element=driver.findElement(By.name("deletwishlist"));
		
		if(element.isDisplayed()) {
			System.out.println("test case fail");
		}
			
		}
		catch(Exception e) {
			
		System.out.println("test case passs");
		
		}
	}
}
		
	

