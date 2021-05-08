package pageTest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import pageActions.IndexPageActions;
import pageActions.SecondPageActions;

public class TestBase {
	
	public static WebDriver driver = null;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static IndexPageActions indexPageActions = null;
	public static SecondPageActions secondPageActions = null;

	public static SecondPageActions secondPageActionsObject() {
		return new SecondPageActions();			
	}
	public static IndexPageActions indexPageActionsObject() {
		return new IndexPageActions();
	}
		
	@BeforeSuite(alwaysRun = true)
	@Parameters("baseURL")
	public void beforeSuite(String baseURL) {
		TestBase.setupExtentReport();
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/browser/chromedriver_89.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
//		driver.manage().window().maximize();
		TestBase.indexPageActions = TestBase.indexPageActionsObject();
	}
	
	@AfterSuite(alwaysRun = true)
	public void afterSuite() {
		TestBase.tearDownReport();
		driver.quit();
	}
	
	public static void setupExtentReport() {
		extent = new ExtentReports(
				System.getProperty("user.dir") + "/extentReport/Automation_Report.html", true);

		extent.addSystemInfo("Host Name", "Test Project")
				.addSystemInfo("Environment", "QA Automation Testing")
				.addSystemInfo("User Name", "Khaled");
		extent.loadConfig(new File(System.getProperty("user.dir") + "/src/test/resources/extent-config.xml"));
	}
	public static void tearDownReport() {
		extent.flush();
		extent.close();
	}
	
	public static WebDriver getDriver() {
		return TestBase.driver;
	}
	
}
