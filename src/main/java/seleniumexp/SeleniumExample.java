package seleniumexp;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExample {
	@Test
	public void testHelloWorld() {
		System.out.println("Hey this is Shobhana Iyer (119A3021) from TE-IT, performing selenium testing.");
	}
	
	@Test
	public void testHelloWorld2() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Launch the url
		driver.navigate().to("http://www.javatpoint.com/");
		
		// Maximize the browser
		driver.manage().window().maximize();
		
		// Scroll down the webpage by 5000 pixels
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,10000)");
		
		// Click on the search text box and send value
		driver.findElement(By.id("gsc-i-id1")).sendKeys("core java");
		
		// Click on the search button
		driver.findElement(By.className("gsc-search-button")).click();
	}
	
}

