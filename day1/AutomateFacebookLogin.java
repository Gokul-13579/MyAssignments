package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomateFacebookLogin {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Tuna@321");
		driver.findElement(By.name("login")).click();
		driver.findElement(By.linkText("Find your account and log in")).click();
		driver.close();
		System.out.println(driver.getTitle());
		
		
	}	
		
}	
		
		
		
		




