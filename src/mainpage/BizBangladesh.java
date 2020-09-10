package mainpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.beust.jcommander.Parameter;


public class BizBangladesh extends WDFunctions {

	@BeforeSuite
	public void startTestSuite(){
		getCurrentTime();
	}

	@Parameters
	@BeforeTest
	
	
	public void openBrowers() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("https://bizbangladesh.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

 }
 

	@AfterTest
	public void afterEachTestMethod(){
		driver.close();
		System.out.println (" Test is ended and browser is closeded +++++++ ");
	}

	@AfterSuite
	public void tearDown(){
		driver.quit();
		System.out.println (" Terminated WD  ");
	}

}
