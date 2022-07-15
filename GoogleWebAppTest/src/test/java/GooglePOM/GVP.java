package GooglePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GVP 
{
	
	public WebDriver myD;
	
	public GVP(WebDriver myD)
	{
		this.myD=myD;
	}
	
	By vRestStat=By.id("result-stats");
	
	
	public WebElement vRestStat()
	{
		return myD.findElement(vRestStat);
	}
	

}
