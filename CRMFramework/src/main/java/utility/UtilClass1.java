package utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import testBaseClass.CommonTestbaseClass;

public class UtilClass1 extends CommonTestbaseClass
{
	static String path = "D:\\ECLIPSE WORKSPACE\\DalalStrret_IB\\Screenshots\\"; 
	public static void takeScreenShot(String fileName)
	{
		
		try
		{
			TakesScreenshot ts =(TakesScreenshot)driver;
		    File src = ts.getScreenshotAs(OutputType.FILE);
		    File des = new File(path+fileName+System.currentTimeMillis()+".png");
		    
		    FileHandler.copy(src,des);
		}
		catch(IOException e)
		{
			System.out.println("Please provide current path");
			e.printStackTrace();
		}
	}

}
