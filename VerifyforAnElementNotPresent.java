package webdriver.day9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import webdriver.day2.Setup;

public class VerifyforAnElementNotPresent implements Setup{

	
	public void testCase() {
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		WebDriver driver=new ChromeDriver();
		driver.get(AUTOMATION_URL);
		
		List<WebElement> ele=driver.findElements(By.xpath("deleteWishList"));
		
		System.out.println("Elements size "+ele.size() );
		
		if(ele.size()==0) {
			
		}
	}
	
	
	public static void main(String[] args) {
		new VerifyforAnElementNotPresent().testCase();
	}
}
