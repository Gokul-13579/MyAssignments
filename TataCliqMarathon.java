package marathonselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class TataCliqMarathon {
	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement noThanks = driver.findElement(By.id("moe-dontallow_button"));
		noThanks.click();
		
		WebElement brand = driver.findElement(By.xpath("(//div[@role='button'])[8]"));
		Actions act=new Actions(driver);
		act.moveToElement(brand).perform();
		Thread.sleep(3000);
		
		WebElement wna = driver.findElement(By.xpath("//div[@aria-label='Watches & Accessories button, Press right arrow or Enter to expand']"));
		wna.click();
		Thread.sleep(2000);
		
		WebElement casio = driver.findElement(By.xpath("//div[text()='Casio']"));
		casio.click();
		Thread.sleep(2000);
		
		WebElement sort = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		sort.click();
		Thread.sleep(2000);
		
        WebElement newArrival = driver.findElement(By.xpath("//option[text()='New Arrivals']"));
		newArrival.click();
		Thread.sleep(2000);
		
		WebElement men = driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckbox']"));
		men.click();
		Thread.sleep(2000);
		
	   List	<WebElement> priceList =driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']"));
		System.out.println("price of the watches:");
		for (WebElement price : priceList) {
			System.out.println(price.getText());
			
			
		}
	    WebElement firstWatch = driver.findElement(By.xpath("(//div[@class='ProductDescription__content'])[1]"));
	    act.click(firstWatch).perform();
	    Thread.sleep(2000);
	 
	    Set<String> parent = driver.getWindowHandles();
	    List <String> ls=new ArrayList<String>(parent);
	    System.out.println(parent);
	
	    driver.switchTo().window(ls.get(1));
	    
	    WebElement watch1 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']"));
	    WebElement watch2 = driver.findElement(By.xpath("(//div[@class='ProductDescription__priceHolder'])[1]"));
	   
	    if (watch1.equals(watch2)) {
	    	System.out.println("price is same");
			
		}
	    else {
	    	System.out.println("price is different");
			
		}
	    WebElement addToBag = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
	    addToBag.click();
	    
	    WebElement cartCount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']"));
	    System.out.println(cartCount.getText());
	    
	    WebElement bagIcon = driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']"));
		bagIcon.click();
		
		File snap = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/img.png");
		FileHandler.copy(snap, dest);
		
		driver.switchTo().window(ls.get(1)).close();
		Thread.sleep(2000);
		
		driver.switchTo().window(ls.get(0)).close();
	}

}
