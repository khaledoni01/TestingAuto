package pageLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import pageTest.TestBase;

public class IndexPageLocators {

	@FindBy(xpath="//input[@id='username']")
	public WebElement username;

	@FindBy(xpath="//input[@id='password']")
	public WebElement password;

	@FindBy(xpath="//a[@href='2ndPage.html']")
	public WebElement nxtPageLink;
	
}
