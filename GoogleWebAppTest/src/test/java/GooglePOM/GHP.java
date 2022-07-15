package GooglePOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GHP 
{
	
	
	public WebDriver myD;
	
	public GHP(WebDriver myD)
	{
		this.myD=myD;
	}
	
	By GSearchTextField=By.className("gLFyf");
	By GSearchButton=By.name("btnK");
	
	
	public WebElement GSearchTextField()
	{
		return myD.findElement(GSearchTextField);
	}
	
	
	public WebElement GSearchButton()
	{
		return myD.findElement(GSearchButton);
	}
	

}
