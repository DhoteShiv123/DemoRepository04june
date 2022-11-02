package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



import testBaseClass.CommonTestbaseClass;


public class Readconfig extends CommonTestbaseClass
{
	Properties pro;
	public Readconfig()
	{
		String path ="C:\\Users\\Shivam\\OneDrive\\Desktop\\GithubDemo\\DemoRepository04june\\DemoRepository04june\\CRMFramework\\Config\\Config.properties\\";
		
		File file = new File(path);
		
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		}
		catch (IOException e) 
		{
			System.out.println("Exception is " + e.getMessage());
		    
		}
		
	}
	
	public String getApplicationURL()
	{
		
		String url= pro.getProperty("url");
		System.out.println("URL failed"+url);
		return url;
	}

}
