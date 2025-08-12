package Pages;

import org.openqa.selenium.By;

import BaseClass.baseCreate;

public class MyHomePage extends baseCreate {
	public MyLeadsPage clickLead() {
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage();
	}
	
	
	

}
