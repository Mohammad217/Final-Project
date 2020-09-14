package testSide;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.annotations.Test;

import locaterPage.JoinFreeLocater;
import mainpage.BizBangladesh;

public class JoinInTest extends BizBangladesh {

	JoinFreeLocater joinInfree=new JoinFreeLocater();
	
	@Test
	public JoinInTest(){
		System.out.println("Join in free BizBangladesh ");
		clickByXpath(joinInfree.joinInLinkLoc );
		typeByXpath(joinInfree.companyNameLoc, joinInfree.companyNameValue);
		driver.findElement(By.cssSelector(joinInfree.countryClickLoc)).sendKeys(joinInfree.countrySelectLoc);
		driver.findElement(By.cssSelector(joinInfree.contactPrasonClick)).sendKeys(joinInfree.contactselectLoc);
		typeByXpath(joinInfree.fullNameLoc,joinInfree.fullNameValue);
		typeByXpath(joinInfree.phoneNumberTypeLoc,joinInfree.phoneNumberValue);
		typeByXpath(joinInfree.emailTypeLoc,joinInfree.emailValue);
		typeByXpath(joinInfree.passwordLoc,joinInfree.PasswordValue);
		typeByXpath(joinInfree.confirmPasswordLoc,joinInfree.confirmPasswordValue);
		clickByXpath(joinInfree.clickSubmitLoc);
		
		
		String act = driver.findElement(By.xpath(joinInfree.myActualFullNameLoc)).getText(); 
		 String exp = "Mohammad uddin";
		 Assert.assertEquals(act, exp);
	}

	
		
	}

