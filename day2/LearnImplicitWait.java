package week3.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnImplicitWait {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//label[text()='Username']/following-sibling::input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//input[@class='inputLogin']/following::input)[1]")).sendKeys("crmsfa");
		
		
		
		
		
	}

}
