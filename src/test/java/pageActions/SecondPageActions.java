package pageActions;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import pageLocators.SecondPageLocators;
import pageTest.TestBase;
import utility.CommonActions;
import utility.Log;

public class SecondPageActions {
	
	SecondPageLocators secondPageLocators = null;
	
	public SecondPageActions() {
		secondPageLocators = new SecondPageLocators();
		PageFactory.initElements(TestBase.getDriver(), secondPageLocators);
	}

	public void secondPageInfo() {
		
		String val = CommonActions.getText(secondPageLocators.alertBtn);
		CommonActions.report(val);

		Assert.assertTrue(val.equalsIgnoreCase("Alert"), "Alert text mismatched");
	}
}
