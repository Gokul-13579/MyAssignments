package Pages;

import org.openqa.selenium.By;

import BaseClass.baseCreate;

public class WelcomePage extends baseCreate {
	
	public MyHomePage clickCRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}

}
