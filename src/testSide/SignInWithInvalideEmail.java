package testSide;

import org.openqa.selenium.By;
import org.testng.Assert;
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
		 clickByXpath(invaild.signInButtonLoc);
		 
		
				String myActualFullNameLoc = null;
				String act = driver.findElement(By.xpath(myActualFullNameLoc)).getText(); 
				String exp = "Mr. ala uddin"; 
				Assert.assertEquals(act, exp);
}
}