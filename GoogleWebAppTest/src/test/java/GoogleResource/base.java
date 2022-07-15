package GoogleResource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class base 
{
	
	public WebDriver myD;
	public String vBrowser;
	public Properties prop;
	
	
	public WebDriver InvokeBrowser() throws IOException
	{
		
		prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\SARAVANAN R\\JAVA_SELENIUM\\GoogleWebAppTest\\src\\test\\java\\GoogleResource\\Data.properties");
		prop.load(fis);
		vBrowser=prop.getProperty("Browser");
		
		
		
		if(vBrowser.equalsIgnoreCase("Chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Downloads\\JavaIND\\chromedriver.exe");
		myD=new ChromeDriver();
		}
		
		else if (vBrowser.equalsIgnoreCase("Firefox"))
		{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SARAVANAN R\\Downloads\\JavaIND\\geckodriver.exe");
		myD=new FirefoxDriver();
		}
		
		else
		{
			System.out.println("Browser NOT Supported");
		}
		
	return myD;
		
	}

}
