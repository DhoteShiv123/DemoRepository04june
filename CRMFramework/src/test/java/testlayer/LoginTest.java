package testlayer;

import org.testng.annotations.Test;

import pagelayer.LoginPage;
import testBaseClass.CommonTestbaseClass;

public class LoginTest extends CommonTestbaseClass 
{
	@Test
	public void loginAccount() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		login.enterUserName("will");
		login.enterPassword("will");
		login.clickOnLoginButton();
		Thread.sleep(3000);
	}

}
