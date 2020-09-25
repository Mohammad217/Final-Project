package mainpage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;


public class BizBangladesh extends WDFunctions {

	@BeforeSuite
	public void startTestSuite(){
		getCurrentTime();
	}

	@Parameters
	@BeforeMethod
	
	
//	public void beforeEachTestMethod(String browser){
//		if (browser.equalsIgnoreCase("ch")){
//			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
//			driver = new ChromeDriver(); 
//			System.out.println (" chrome driver open ++++++++++++++++ ");
//		} else if (browser.equalsIgnoreCase("ff")){
//			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
//			driver = new FirefoxDriver(); 
//			System.out.println (" Firefox driver open ++++++++++++++++ ");
	
	
	
	public void openBrowers() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
		driver=new ChromeDriver();
        driver.get("https://bizbangladesh.com/");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

 }
 

	@AfterMethod
	public void afterEachTestMethod(){
		driver.close();
		System.out.println (" Test is ended and browser is closeded++ ");
	}

	@AfterSuite
	public void tearDown(){
		//driver.quit();
		System.out.println (" Terminated WDfunction  ");
	}

}
