package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase {
	
	public static WebDriver driver;
	
	String expectedUrl = "http://automationpractice.com/index.php" ;
	
	@BeforeMethod
	public void setUp(){
		
		System.setProperty("webdriver.chrome.driver", "E:\\STUDY Mate\\SELENIUM\\Jar's & Software\\webDriver Chrome\\Chrome 94\\chromedriver_win32_2\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
	}
	
	@Test
	public void getTitle(){

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://automationpractice.com/index.php");
		//String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, expectedUrl);
	}
	
	@AfterMethod
	public void tearDown(){
	
		driver.close();
	
		}
	}
	
	

