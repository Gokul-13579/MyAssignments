package week5.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTableYahoo {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://finance.yahoo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement market =driver.findElement(By.xpath("//span[text()='Markets']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(market).perform();
		
		WebElement crypto= driver.findElement(By.xpath("(//div[text()='Crypto'])[2]"));
		crypto.click();
		
		List<WebElement> name = driver.findElements(By.xpath("//table[@class='yf-ao6als bd']/tbody/tr/td[2]"));
		for (WebElement currency : name) {
			System.out.println(currency.getText());
			
		}
	}
	

}
