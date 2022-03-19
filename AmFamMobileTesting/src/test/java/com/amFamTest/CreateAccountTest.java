package com.amFamTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.amFamHome.AmFamHome;
import com.nativeAppPages.CreateAmFamAcount;

public class CreateAccountTest extends AmFamHome{
	
	CreateAmFamAcount cFamAcount;
	
	@BeforeMethod
	public void initialization() {
	cFamAcount=new CreateAmFamAcount(driver);
	}
	
	@Test
	public void createAnAccountTest() {	
		cFamAcount.createAnAccount();
		cFamAcount.lastName();
		cFamAcount.nextButton();
		cFamAcount.doBirth();
		cFamAcount.nextVerify();
		cFamAcount.zipCode();
	}
	
}
