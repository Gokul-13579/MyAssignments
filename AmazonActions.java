package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class AmazonActions {
	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus9 pro");
		Thread.sleep(3000);
		
		driver.findElement(By.id("nav-search-submit-text")).click();
		Thread.sleep(3000);
		
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
        System.out.println(price.getText());
        Thread.sleep(3000);
        
        WebElement ratings = driver.findElement(By.xpath("//span[text()='211']"));
        System.out.println(ratings.getText());
        Thread.sleep(3000);
        
        WebElement firstLine = driver.findElement(By.xpath("//h2[@class='a-size-medium a-spacing-none a-color-base a-text-normal']"));
        firstLine.click();
        Thread.sleep(3000);
        
        File source = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File("./snaps/ima.png");
        FileHandler.copy(source, dest);
        
	}
}

