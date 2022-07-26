package GoogleTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import GooglePOM.GHP;
import GoogleResource.base;
import jdk.internal.org.jline.utils.Log;

public class TS002 extends base 
{
	
	@Test
	public void TitleTest() throws IOException, InterruptedException
	{
	
	
	GHP homepage=new GHP(myD);
	if (myD.getTitle().contains("Google"))
	{
		System.out.println("PASS");
		
	}
	else
	{
		System.out.println("FAIL");
	}
	Thread.sleep(4000);
	}
	
	@BeforeTest
	public void SETUP() throws IOException
	{
		myD=InvokeBrowser();
		myD.get(prop.getProperty("URL"));
		myD.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void tearDown()
	{
		myD.close();	
	}

}
