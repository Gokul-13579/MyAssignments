package Pages;

import org.openqa.selenium.By;

import BaseClass.baseCreate;

public class CreateLeadPage extends baseCreate{
	public CreateLeadPage cmpName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	public CreateLeadPage firstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
		return this;
	}
	public CreateLeadPage lastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
		
	}
	public ViewLeadsPage create() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadsPage();
	}

}
