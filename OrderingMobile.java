package marathonselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import io.github.sukgu.Shadow;

public class OrderingMobile {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://dev209663.service-now.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.navigate().refresh();
		
		WebElement userName = driver.findElement(By.id("user_name"));
		userName.sendKeys("admin");
		userName.click();
		
	    WebElement password = driver.findElement(By.id("user_password"));
	    password.sendKeys("qy/Q6A=vOM3x");
		password.click();
		
		WebElement logIn = driver.findElement(By.xpath("//button[text()='Log in']"));
		logIn.click();
		Thread.sleep(2000);
		
		
	    Shadow sh=new Shadow(driver);
		WebElement all = sh.findElementByXPath("///div[text()='All']");
	    all.click();
	    Thread.sleep(2000);
	    
		
		WebElement serviceCatalog = sh.findElementByXPath("//span[text()='Service Catalog']");
		serviceCatalog.click();
		Thread.sleep(2000);
		
		WebElement frame = sh.findElementByXPath("//iframe[@title='Main Content']");
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//h2[@style='margin: 10px 0px 0px 0px; font-size:larger; font-weight:normal;'])[8]")).click();
		Thread.sleep(2000);
		
	    sh.findElementByXPath("//h2[@style='margin-top:1px;margin-bottom:0px;font-size:16px;display:inline-block;']").click();
		Thread.sleep(2000);
		
		WebElement yes = driver.findElement(By.xpath("//label[text()='Yes']"));
		yes.click();
		
		WebElement ph = driver.findElement(By.id("IO:43d5c38a9707011021983d1e6253af8a"));
		ph.sendKeys("99");
		ph.click();
		
		driver.findElement(By.xpath("//option[@value='Unlimited']")).click();
		WebElement color = driver.findElement(By.xpath("(//label[@class='radio-label'])[5]"));
		color.click();
		
		WebElement storage = driver.findElement(By.xpath("(//label[@class='radio-label'])[11]"));
		storage.click();
		
		WebElement buy = driver.findElement(By.id("oi_order_now_button"));	
        buy.click();
        
        WebElement reqNum = driver.findElement(By.id("requesturl"));
        System.out.println(reqNum.getText());
        
        File snap = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File("./snaps/img.png");
        FileHandler.copy(snap, dest);
	}   
	
}
