package GooglePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GSP 
{
	
	public WebDriver myD;
	
	
	public GSP(WebDriver myD)
	{
		this.myD=myD;
	}
	
	By RestStat=By.id("result-stats");
	By VideosButton=By.linkText("Videos");
	

	public WebElement RestStat()
	{
		return myD.findElement(RestStat);
	}
	
	public WebElement VideosButton()
	{
		return myD.findElement(VideosButton);
	}
	

}
