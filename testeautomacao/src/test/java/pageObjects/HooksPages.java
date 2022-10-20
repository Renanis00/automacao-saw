package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class HooksPages {
	private WebDriver driver;
	
	public HooksPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Wait.untilPageLoadComplete(driver);
	}

}
