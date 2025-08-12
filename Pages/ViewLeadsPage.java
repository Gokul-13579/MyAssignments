package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.baseCreate;

public class ViewLeadsPage extends baseCreate{
	
	public void verify() {
	  WebElement status = driver.findElement(By.xpath("//span[text()='Assigned']"));
	  if (status.isDisplayed()) {
		  System.out.println("true");
		
	} else {
		System.out.println("false"); 
		

	}
	  
	}

}
