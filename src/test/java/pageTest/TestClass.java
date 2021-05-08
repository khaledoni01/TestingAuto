package pageTest;

import java.lang.annotation.Retention;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass extends TestBase {

	@Test(priority=0, groups="test")
	public void indexPageTest() {
		
		indexPageActions.indexPageInfo();
		secondPageActions.secondPageInfo();
		
	}
	
}
