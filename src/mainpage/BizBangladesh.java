package mainpage;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BizBangladesh extends WDFunctions {

	@BeforeSuite
	public void startTestSuite(){
		getCurrentTime();
	}

	
	@BeforeMethod
	public void beforeEachTestMethod(String browser){
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver = new ChromeDriver(); 
		System.out.println (" chrome driver open ++++++++++++++++ ");
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		// open browser	
		driver.get("https://bizbangladesh.com/");
	}

	@AfterMethod
	public void afterEachTestMethod(){
		// close browser
		driver.close();
		System.out.println (" Test is ended and browser is closeded +++++++ ");
	}

	@AfterSuite
	public void tearDown(){
		//driver.quit();
		System.out.println (" Terminated WD +++++++ ");
	}

}
