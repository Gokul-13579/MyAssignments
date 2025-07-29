package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class SnapDealActions {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		WebElement mens = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions act=new Actions(driver);
		act.moveToElement(mens).perform();
		
		WebElement sports = driver.findElement(By.xpath("//span[text()='Sports Shoes']"));
		sports.click();
		
		WebElement shoeCount = driver.findElement(By.xpath("//div[@class='sub-cat-count ']"));
		System.out.println(shoeCount.getText());
		
		WebElement trainingShoes = driver.findElement(By.xpath("//div[text()='Training Shoes']"));
		trainingShoes.click();
		
		WebElement sort = driver.findElement(By.xpath("//div[@class='sort-selected']"));
		sort.click();
		Thread.sleep(3000);
		
		WebElement lowToHigh = driver.findElement(By.xpath("//li[@data-sorttype='plth']"));
		lowToHigh.click();
		
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("500");
		
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).clear();
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("700");
		Thread.sleep(3000);
		
		WebElement go = driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']"));
		go.click();
		Thread.sleep(3000);
		
		
		WebElement colour = driver.findElement(By.xpath("//label[@for='Color_s-White%20%26%20Blue']"));
		colour.click();
		
		WebElement shoe = driver.findElement(By.xpath("//img[@class='product-image wooble']"));
		act.moveToElement(shoe).perform();
		
		WebElement quickView = driver.findElement(By.xpath("//div[@class='clearfix row-disc']"));
		quickView.click();
		
		Set<String> switchWindow = driver.getWindowHandles();
		List<String> sh=new ArrayList<String>(switchWindow);
		driver.switchTo().window(sh.get(0));
		
		String price = driver.findElement(By.xpath("//span[@class='payBlkBig']")).getText();
		System.out.println("price of the shoe:" +price);
		
		
		String discount = driver.findElement(By.xpath("//span[@class='percent-desc ']")).getText();
		System.out.println("discount:"+discount);
		
		File snap = driver.getScreenshotAs(OutputType.FILE);
	    File dest=new File("./snaps/img.png");
	    FileHandler.copy(snap, dest);
	    
	    driver.close();
	    
	    
	    	
	}

}
