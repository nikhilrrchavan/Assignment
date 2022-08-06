package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.GoogleMap;

public class GoogleMapTest extends BaseTest  {
	GoogleMap mp;
	
	@BeforeClass
	public void init() {
	mp=new GoogleMap(driver);
	}
		
		
		
		@Test
		public void login() {
			mp.placename().sendKeys("Wankhede Stadium");
			mp.placesearch().click();
			//lp.getbutton().click();
			
}
		@Test
		public void Title(){
			String Actual=driver.getTitle();
			String expected= "Wankhede Stadium - Google Maps";
			Assert.assertEquals(Actual, expected);
			}
				
		@Test
		public void link() {
		
		
			
			}		
		

		
			
		
		
		@AfterClass
		public void tearDown() {
			
			// driver.close();
		}
}