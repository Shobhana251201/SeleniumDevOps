package seleniumexp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SeleniumExample {	
	
	private WebDriver driver;	
	
	@BeforeClass
	public void beforeClass() {
		
		driver = new ChromeDriver();	
	}
	
	@AfterClass
	public void afterClass() {		
		driver.quit();
	}
	
	public class TestHelloworld {
		
		@Test
		public void testhelloworld()
		{
			
		System.out.println("Hey this is Shobhana Iyer (119A3021) from TE-IT, performing selenium testing.");
		}
		
		}
	
	}


