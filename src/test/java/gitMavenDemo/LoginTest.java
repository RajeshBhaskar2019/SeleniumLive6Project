package gitMavenDemo;

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
		driver.findElement(By.id("email")).sendKeys("rajesh_nit@yahoo.co.in");
		driver.findElement(By.id("pass")).sendKeys("Rajesh@32");
		
	}
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}
}
