package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.GoogleMap;

public class BaseTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void beforeSuite() {
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/maps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
	}
	@AfterSuite
	public void afterSuite(){
		driver.close();
		
		
		
	}
	

}
