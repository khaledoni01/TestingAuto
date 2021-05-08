package utility;

import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.LogStatus;

import pageTest.TestBase;

public class CommonActions {
	
	public static void sendKeys(WebElement ele, String val) {
		ele.clear();
		ele.sendKeys(val);
	}
	
	public static void click(WebElement ele) {
		ele.click();
	}

	public static String getText(WebElement ele) {
		return ele.getText().trim();
	}
	
	public static void report(String msg) {
		Log.info(msg);
		TestBase.test.log(LogStatus.INFO, msg);
	}
}
