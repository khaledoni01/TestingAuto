package pageActions;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

import pageLocators.IndexPageLocators;
import pageTest.TestBase;
import utility.CommonActions;
import utility.Log;

public class IndexPageActions {

	IndexPageLocators indexPageLocators = null;
	
	public IndexPageActions() {
		indexPageLocators = new IndexPageLocators();
		PageFactory.initElements(TestBase.getDriver(), indexPageLocators);
	}
	
	public void indexPageInfo() {
		
		CommonActions.sendKeys(indexPageLocators.username, "username");
		CommonActions.report("Username is provided");
		
		CommonActions.sendKeys(indexPageLocators.password, "abc123");		
		CommonActions.report("Password is provided");
		
		String val = CommonActions.getText(indexPageLocators.nxtPageLink);
		
		CommonActions.report("Next Page Link is clicked");
		
		
		CommonActions.click(indexPageLocators.nxtPageLink);
		
		TestBase.secondPageActions = TestBase.secondPageActionsObject();
	}
	
}
