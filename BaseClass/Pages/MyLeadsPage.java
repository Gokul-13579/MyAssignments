package Pages;

import org.openqa.selenium.By;

import BaseClass.baseCreate;

public class MyLeadsPage extends baseCreate {
	
	public CreateLeadPage clickCreate() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(); 
		}
}

