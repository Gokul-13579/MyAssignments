package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {
	
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
	   WebElement sourceDD= driver.findElement(By.id("createLeadForm_dataSourceId"));
	   Select sel=new Select(sourceDD);
	   sel.selectByIndex(4);
	   
	   WebElement MarketingCampaignDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	   Select sel1=new Select(MarketingCampaignDD);
	   sel1.selectByVisibleText("Automobile");
	   
	   WebElement Ownership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	   Select sel2=new Select(Ownership);
	   sel2.selectByValue("OWN_CCORP");
	   
	  driver.findElement(By.name("submitButton")).click();
	  
	  
	  
	   
	    
		
		
		
	}
	
}
				
		
		
	


