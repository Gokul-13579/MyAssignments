package week5.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ebHandleIRCTC {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement ok = driver.findElement(By.xpath("//button[text()='OK']"));
		ok.click();
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		WebElement flight = driver.findElement(By.xpath("//a[text()=' FLIGHTS ']"));
		flight.click();
		String fliTic = driver.getTitle();
		System.out.println(fliTic);
		
		driver.switchTo().window(parent);
		driver.close();		
		
	}

}
