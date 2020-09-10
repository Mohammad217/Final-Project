package testSide;

import org.testng.annotations.Test;

import locaterPage.JoinFreeSignIn;
import mainpage.BizBangladesh;

public class SignInWithInvalideEmail extends BizBangladesh {
	
	JoinFreeSignIn invaild= new JoinFreeSignIn();
	
	@Test
	 
	 public void SignInTest(){
		 System.out.println("Sign in with vaild email and password ");
		 clickByXpath(invaild.clickSignIn);
		 typeByXpath(invaild.emailLoc , invaild.invaildemailLoc);
		 typeByXpath(invaild.passwordLoc, invaild.passwordvalue);
		 //clickByXpath(signInPage.signInButtonLoc);

}
}