package marathonselenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonMarathon {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//button[text()='Continue shopping']")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//print results
		WebElement results = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
		System.out.println(results.getText());
		
	
		//brand checkBox
	    driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[7]")).click();
		Thread.sleep(3000);
		
		//sort
		driver.findElement(By.xpath("//span[@class='a-button a-button-dropdown a-button-small']")).click();
		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		//bag name
		driver.findElement(By.xpath("//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal']")).click();
		WebElement bagName = driver.findElement(By.id("productTitle"));
		System.out.println(bagName.getText());
		
		//page title
		System.out.println(driver.getTitle());
		
		//close
		driver.close();
	
	}

}
