package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPageLocators {
	
	@FindBy(xpath="//h3[text()='Alert']")
	public WebElement alertBtn;

}
