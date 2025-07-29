package week5.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class BigBasketActions {
	public static void main(String[] args) throws InterruptedException, IOException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		WebElement cate = driver.findElement(By.id("headlessui-menu-button-:Ramkj6:"));
		cate.click();
		Thread.sleep(3000);
		
		WebElement food = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(food).perform();
		Thread.sleep(3000);
		
		WebElement rice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act.moveToElement(rice).perform();
		Thread.sleep(3000);
		
		WebElement boiledRice = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		boiledRice.click();
		Thread.sleep(3000);
		
		WebElement bbRoyal = driver.findElement(By.id("i-bbRoyal"));
		bbRoyal.click();
		Thread.sleep(3000);
		
		WebElement sel5kg = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		sel5kg.click();
		Thread.sleep(3000);
		
		WebElement price = driver.findElement(By.xpath("//td[@class='Description___StyledTd-sc-82a36a-4 fLZywG']"));
		System.out.println(price.getText());
		Thread.sleep(3000);
		
		
		WebElement cart = driver.findElement(By.xpath("//button[text()='Add to basket']"));
		cart.click();
		Thread.sleep(3000);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snaps/ima.png");
		FileHandler.copy(source, dest);
		Thread.sleep(3000);
		
		
		driver.close();
		
		
	}

}
