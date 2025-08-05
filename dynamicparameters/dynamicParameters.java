package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dynamicParameters {
	
	
	@Test(dataProvider="loginData")
	public void salesForceDynamic(String uName,String pwd) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.findElement(By.id("username")).sendKeys(uName);
	    driver.findElement(By.id("password")).sendKeys(pwd);
	    driver.findElement(By.id("Login")).click();
	    
	    WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
	    toggle.click();
	    
	    WebElement viewAll = driver.findElement(By.xpath("(//button[@class='slds-button'])[2]"));
		viewAll.click();
		
		WebElement legalEnti = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		Actions act=new Actions(driver);
		act.moveToElement(legalEnti).perform();
		legalEnti.click();
		
		WebElement newButton = driver.findElement(By.xpath("//div[@title='New']"));
		newButton.click();
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Sales Automation By Gokul");
	
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		
		WebElement Msg = driver.findElement(By.xpath("//span[text()='Legal Entity']"));
		System.out.println("The msg displayed:"  +Msg.getText());

}
	@DataProvider(name="loginData")
	 public Object[][] sendData() {
		
		return new Object[][] {
	                          {"bhuvanesh.moorthy@testleaf.com","Leaf@2025"},
			                  {"harish@testleaf.com","harish@2025"},
	                          {"vidhyar@testleaf.com","vidya@2025"}};
}
}