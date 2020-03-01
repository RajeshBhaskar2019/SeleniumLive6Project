package gitMavenDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest 
{
	public static WebDriver driver;
	
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\gitMavenDemo\\src\\test\\java\\Excecutable\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void doLogin()
	{
		driver.findElement(By.id("email")).sendKeys("rajesh");
		driver.findElement(By.id("pass")).sendKeys("Rajesh@30122");
		driver.getTitle();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
