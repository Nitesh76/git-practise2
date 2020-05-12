package webDriver.day4;


this is the first day of learning github
all things is going ggod


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementPresentOrNot {
	
	public static void main(String[] args) {
		new VerifyElementPresentOrNot().testCase();
	}
 public void testCase() {
	 
	    /// verify text on the page
	 //getTex /getAttribute/ getTitle/getCurentURL

	 
	 // element is present or not
	 
	 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (1)\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://www.google.co.in");
	 
	 String titlevlaue= driver.getTitle();
	 System.out.println(titlevlaue);
	 
	boolean elementFound= driver.findElement(By.name("q")).isDisplayed();
	 System.out.println(elementFound);
	 if(elementFound) {
		 System.out.println("test case pass");
	 }
	 else {
		 System.out.println("test case fail");
	 }
	 
 }
}
