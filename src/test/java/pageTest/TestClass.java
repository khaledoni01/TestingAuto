package pageTest;

import java.lang.annotation.Retention;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelUtil;

public class TestClass extends TestBase {

	
	@DataProvider(name = "testdata")
	public static Object[][] testdata() {
		String inputSheet = "Sheet1";
		return ExcelUtil.getExcelData("C:\\Users\\khale\\eclipse-workspace\\TestAuto\\data\\testing.xlsx", inputSheet);
	}
	
	@Test(priority=0, groups="test", dataProvider="testdata")
	public void indexPageTest(String username, String password) {
		
		indexPageActions.indexPageInfo(username, password);
		secondPageActions.secondPageInfo();
		
	}
	
}
