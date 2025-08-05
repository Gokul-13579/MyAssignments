package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class salesForceParameters {
	    @Parameters({"url", "username", "password"})
	    @Test
	    public void salesForce(String url, String uName, String pwd) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
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
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("Gokul");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("SalesForce");
		Thread.sleep(2000);
		
		WebElement none = driver.findElement(By.xpath("//button[@role='combobox']"));
		driver.executeScript("arguments[0].click();", none);
		
		WebElement active = driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]"));
		active.click();
		
	
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		
		WebElement Msg = driver.findElement(By.xpath("//span[text()='Legal Entity']"));
		System.out.println("The msg displayed:"  +Msg.getText());
		
		
	}

}
