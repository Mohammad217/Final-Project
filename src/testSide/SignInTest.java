package testSide;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
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
 
 public void NameVerify(){
	 System.out.println("Verify full name Mr.ala uddin");
	 clickByXpath(signInPage.clickSignIn);
	 typeByXpath(signInPage.emailLoc ,signInPage.emailvalue);
	 typeByXpath(signInPage.passwordLoc,signInPage.passwordvalue);
	 clickByXpath(signInPage.signInButtonLoc);
	 String act = driver.findElement(By.xpath(signInPage.myActualFullNameLoc)).getText(); 
	 String exp = "Mr. ala uddin"; 
	 Assert.assertEquals(act, exp);
 }
 @Test(priority=3)
	 
  public void SignOut(){	 
	 System.out.println("Sign out Sucessfully");
	 clickByXpath(signInPage.clickSignIn);
	 typeByXpath(signInPage.emailLoc ,signInPage.emailvalue);
	 typeByXpath(signInPage.passwordLoc,signInPage.passwordvalue);
	 clickByXpath(signInPage.signInButtonLoc);
	 clickByXpath(signInPage.logoutLoc);
	 scroll();
	 clickByXpath(signInPage.logoutButtonLoc);
 }
 
 
 @Test(priority=4)
 public void ComputerItTest() {
	 
	System.out.println("Computer and IT test verify ");
	clickByXpath(signInPage.productsLoc);
	scroll();
	clickByXpath(signInPage.computerItServicesLoc);
	clickByXpath(signInPage.websiteDesignLoc);
	
	 }
 
 @Test(priority=5,enabled=false)
 public void  healthMedicalTest(){
	 
	    System.out.println("Don't want to exectue the test at all and it won't show up in report");
	    clickByXpath(signInPage.productsLoc);
	    scroll();
		clickByXpath(signInPage.healthMedicalLoc);
		clickByXpath(signInPage.polyCareLoc);
	    clickByXpath(signInPage.requestLoc);
		
	 
 }
 @Test(priority=6)
	public void distableTest(){
		System.out.println ("skipping this test because business requiment is changed ");
		throw new SkipException("skipping test");
	}
 @Test(priority=7, enabled=true)
	public void tryCatchTest(){
		System.out.println (" try catch block test");
		String actual 		= "Bangladesh Business Information and Business Opportunities";
		String expected 	= "Bangladesh Business Information and Business Opportunities";
		try {
			Assert.assertEquals(actual, expected);
		}catch (Throwable issue){
			System.err.println ("actual is not matching with expected" + issue);
		}
 }
@Test(priority=8)
		 
	 public void invaildemail(){
			 System.out.println("Sign in with vaild email and password ");
			 clickByXpath(signInPage.clickSignIn);
			 typeByXpath(signInPage.emailLoc , signInPage.invaildemailLoc);
			 typeByXpath(signInPage.passwordLoc, signInPage.passwordvalue);
			 clickByXpath(signInPage.signInButtonLoc);
			 
 }
}
