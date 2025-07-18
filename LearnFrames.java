package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;

public class LearnFrames {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
	     Alert alert = driver.switchTo().alert();
	     System.out.println(alert.getText());
	     alert.accept();
	     
		
		
		
	}

}
