package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BackEndMasterPage {
	
	
	
	@FindBy(xpath="//div[@class='create-news']//div[@class='btn-group']//span[1]")
	public WebElement txtdefaultGroup;

}
