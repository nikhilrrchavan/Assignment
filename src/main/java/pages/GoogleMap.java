package pages;	

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMap {
	//Pooja Nikhil Chavan
	
	@FindBy(id="searchboxinput")
	private WebElement place;
	
	@FindBy(id="searchbox-searchbutton")
	private WebElement search;
	
	@FindBy(xpath="//*[@class='fontDisplayLarge']")
	private WebElement button;
	
	public GoogleMap(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public WebElement placename() {
		return place;
		
	}
	public WebElement placesearch() {
		return search;
	}
		public WebElement getbutton() {
			return button;
			
		}


}
