package utility;

import org.openqa.selenium.support.PageFactory;

import testBaseClass.CommonTestbaseClass;

public class UtilClass extends CommonTestbaseClass
{
	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	public String geturl()
	{
		String  url = driver.getCurrentUrl();
		return url;
	}
	

}
