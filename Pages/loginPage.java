package Pages;

import org.openqa.selenium.By;

import BaseClass.baseCreate;

public class loginPage extends baseCreate{
	
	public loginPage userName() {
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		return this;
		
	}
public loginPage password() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		return this;
	}
public WelcomePage clickLogin() {
	
	driver.findElement(By.className("decorativeSubmit")).click();
	return new WelcomePage();
}
	

}
