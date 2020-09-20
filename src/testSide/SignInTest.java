package testSide;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import locaterPage.JoinFreeSignIn;
import mainpage.BizBangladesh;

public class SignInTest extends BizBangladesh {
	
	JoinFreeSignIn signInPage=new JoinFreeSignIn();
 @Test(priority=1)
 
 public void SignInBiz(){
	 System.out.println("Sign in with vaild email and password ");
	 clickByXpath(signInPage.clickSignIn);
	 typeByXpath(signInPage.emailLoc ,signInPage.emailvalue);
	 typeByXpath(signInPage.passwordLoc,signInPage.passwordvalue);
	 clickByXpath(signInPage.signInButtonLoc);
	 
	
 }
 @Test(priority=2)
 public void ComputerItTest() throws InterruptedException{
	 System.out.println("Computer and IT verify ");
	
	clickByXpath(signInPage.productsLoc);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,78)", "");
	clickByXpath(signInPage.computerItServicesLoc);
	clickByXpath(signInPage.websiteDesignLoc);
	clickByXpath(signInPage.requestLoc);
	 }
 
 //@Test(priority=3)
 public void  healthMedicalTest(){
	    clickByXpath(signInPage.productsLoc);
		clickByXpath(signInPage.healthMedicalLoc);
		clickByXpath(signInPage.polyCareLoc);
	    clickByXpath(signInPage.requestLoc);
	 
 }
 
}
