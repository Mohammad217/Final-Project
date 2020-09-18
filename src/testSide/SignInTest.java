package testSide;

import org.openqa.selenium.By;


import org.testng.Assert;
import org.testng.annotations.Test;

import locaterPage.JoinFreeSignIn;
import mainpage.BizBangladesh;

public class SignInTest extends BizBangladesh {
	
	JoinFreeSignIn signInPage=new JoinFreeSignIn();
 @Test
 
 public void SignInBiz(){
	 System.out.println("Sign in with vaild email and password ");
	 clickByXpath(signInPage.clickSignIn);
	 typeByXpath(signInPage.emailLoc , signInPage.emailvalue);
	 typeByXpath(signInPage.passwordLoc, signInPage.passwordvalue);
	 clickByXpath(signInPage.signInButtonLoc);
	 
	 String act = driver.findElement(By.xpath(signInPage.myActualFullNameLoc)).getText(); 
	 String exp = "Mr. ala uddin";
	 Assert.assertEquals(act, exp);
	 
 }
}
