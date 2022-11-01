package testBaseClass;






import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;



public class CommonTestbaseClass {
	
	public static WebDriver driver;
	public static Logger logger;

	
	@BeforeClass
	public void start()
	{
		logger= Logger.getLogger("Dala Street Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework execution started");
	}
	@AfterClass
	public void stop()
	{
		logger.info("Framework execution finished");
	}

	@Parameters("browser")
    @BeforeMethod
	public void setup(String br) throws InterruptedException
	{
	 
		
	  if(br.equalsIgnoreCase("chrome"))
	  {
	      WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	  }
	  
	  else if(br.equalsIgnoreCase("firefox"))
	  {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	  
	  else
	  {
		  System.out.println("This browser is not supported \n Please try with another");
	  }
	  
	  logger.info("Browser Launched");
	   
	   driver.get("https://suite8demo.suiteondemand.com/#/Login");
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	   
	   logger.info("open url,maximize the window,implicit wait provided");
	
	}
    @AfterMethod
	public void closeBrowser()
	{
       
      // driver.quit();
      // logger.info("Browser close");
	}
    
  
    
}
