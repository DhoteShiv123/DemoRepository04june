package pagelayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import testBaseClass.CommonTestbaseClass;

public class LoginPage extends CommonTestbaseClass
{
	private By username = By.xpath("//body/app-root[1]/div[1]/scrm-login-ui[1]/div[1]/form[1]/div[2]/div[1]/div[1]/input[1]");
	private By password = By.xpath("//body/app-root[1]/div[1]/scrm-login-ui[1]/div[1]/form[1]/div[2]/div[1]/div[2]/input[1]");
	private By loginButton= By.xpath("//button[@id='login-button']");
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void enterUserName(String un)
	{
		driver.findElement(username).click();
		driver.findElement(username).sendKeys(un);
	}	
		
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).click();
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}

}
