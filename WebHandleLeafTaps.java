package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebHandleLeafTaps {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.getTitle();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		WebElement crm = driver.findElement(By.id("label"));
	    crm.click();
		
		WebElement contacts = driver.findElement(By.xpath("(//div[@class='x-panel-header'])[3]"));
		contacts.click();
		
		WebElement merge = driver.findElement(By.xpath("//a[text()='Merge Contacts']"));
		merge.click();
		
		WebElement fromWid = driver.findElement(By.xpath("//img[@alt='Lookup']"));
		fromWid.click();
		
		Set<String> parent = driver.getWindowHandles();
		List<String> ls=new ArrayList<String>(parent);
		System.out.println(parent);

		driver.switchTo().window(ls.get(1));
		
		
		WebElement frmNme = driver.findElement(By.xpath("//a[@class='linktext']"));
		frmNme.click();
		driver.switchTo().window(ls.get(0));
		
		WebElement toWid = driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]"));
		toWid.click();
		
		Set<String> child = driver.getWindowHandles();
		List<String> ch=new ArrayList<String>(child);
		System.out.println(child);
		driver.switchTo().window(ch.get(1));
		
		
		WebElement toNme = driver.findElement(By.xpath("//a[text()='DemoPrivilegedCust']"));
		toNme.click();
		
		driver.switchTo().window(ls.get(0));
		
		WebElement merge1 = driver.findElement(By.xpath("//a[@class='buttonDangerous']"));
		merge1.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.getTitle();
		
	}

}
