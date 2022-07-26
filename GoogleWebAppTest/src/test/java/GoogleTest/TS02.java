package GoogleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import GooglePOM.GHP;
import GooglePOM.GSP;

public class TS02 
{
	
	
	
public static void main(String args[]) throws InterruptedException
{
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARAVANAN R\\Downloads\\JavaIND\\chromedriver.exe");
	WebDriver myD=new ChromeDriver();
	myD.manage().window().maximize();
	myD.get("https://www.google.com");
	GHP googleHome=new GHP(myD);
	googleHome.GSearchTextField().sendKeys("Core Java");
	Thread.sleep(5000);
	googleHome.GSearchButton().click();
	
	GSP searchPage=new GSP(myD);
	System.out.println(searchPage.RestStat().getText());
	searchPage.VideosButton().click();
	Thread.sleep(5000);
	
	
}

}
