package com.firefox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Test1 {
	WebDriver driver;

	@Parameters("BrowserName")
	@Test
	public void launch(String Browser) throws InterruptedException
	{
		if(Browser.equalsIgnoreCase("ie"))
		{
		 driver=new InternetExplorerDriver();	
	}
	
	else if(Browser.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
		
	}		
		driver.get("http://jqueryui.com//droppable");
		  
		   driver.switchTo().frame(0);
		   WebElement e1=driver.findElement(By.id("draggable"));
		   WebElement e2=driver.findElement(By.id("droppable"));
		   Actions a=new Actions(driver);
		   
		   a.dragAndDrop(e1,e2).build().perform();
			
	}

}
