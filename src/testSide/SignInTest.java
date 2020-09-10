package testSide;

import org.testng.annotations.Test;

import locaterPage.JoinFreeSignIn;
import mainpage.BizBangladesh;

public class SignInTest extends BizBangladesh {
	
	JoinFreeSignIn signInPage=new JoinFreeSignIn();
 @Test
 
 public void SignInTest(){
	 System.out.println("Sign in with vaild email and password ");
	 clickByXpath(signInPage.clickSignIn);
	 typeByXpath(signInPage.emailLoc , signInPage.emailvalue);
	 typeByXpath(signInPage.passwordLoc, signInPage.passwordvalue);
	 //clickByXpath(signInPage.signInButtonLoc);
	 
 }
}
