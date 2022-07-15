package GoogleTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GooglePOM.GHP;
import GooglePOM.GSP;
import GooglePOM.GVP;
import GoogleResource.base;

public class TS001 extends base
{
	
	public String vSearchStat;
	
	@Test (dataProvider = "SearchData")
	public void Test1(String gSearch) throws IOException, InterruptedException
	{
	
		
		
		GHP homepage=new GHP(myD);
		homepage.GSearchTextField().sendKeys(gSearch);
		homepage.GSearchButton().click();
		
		GSP searchpage=new GSP(myD);
		vSearchStat=searchpage.RestStat().getText();
		System.out.println("The Result Statistics "+vSearchStat);
		searchpage.VideosButton().click();
		
		GVP videospage=new GVP(myD);
		vSearchStat=videospage.vRestStat().getText();
		System.out.println("The Result Statistics "+vSearchStat);
		
		Thread.sleep(5000);
		
		myD.navigate().back();
		
		//myD.navigate().to("");

		Thread.sleep(3000);
		myD.navigate().back();
		Thread.sleep(3000);
		
		
	}
	
	
	
	@DataProvider
	public String[] SearchData()
	{
		String[] vSearch=new String[2];
		
		vSearch[0]="Selenium";
		vSearch[1]="TestNG";
		//vSearch[2]="Jenkins";
		//vSearch[3]="GitHub";
				
		return vSearch;
		
		
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
