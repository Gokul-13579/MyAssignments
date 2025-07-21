package marathonselenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class PvrCinemas {
	public static void main(String[] args) throws InterruptedException {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//h6[contains(text(),'Chennai')]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[@class='cinemas-inactive']")).click();
		Thread.sleep(3000);
		
		WebElement selCinema=driver.findElement(By.xpath("//span[text()='Select Cinema']"));
		selCinema.click();
		
		WebElement theatre=driver.findElement(By.xpath("//span[contains(text(),'INOX National')]"));
		theatre.click();
		Thread.sleep(3000);
		
		WebElement date=driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[2]"));
		date.click();
		Thread.sleep(2000);
		
		WebElement film=driver.findElement(By.xpath("(//span[text()='JENMA NATCHATHIRAM'])[2]"));
		film.click();
		Thread.sleep(2000);
		
		WebElement time=driver.findElement(By.xpath("//li[@class='p-dropdown-item']"));
		time.click();
		Thread.sleep(2000);
		
		WebElement book=driver.findElement(By.xpath("(//span[text()='Book'])[4]"));
		book.click();
		Thread.sleep(2000);
		
		WebElement agree=driver.findElement(By.xpath("//button[text()='Accept']"));
		agree.click();
		Thread.sleep(2000);
		
		WebElement seat = driver.findElement(By.xpath("//span[@class='seat-current-pvr']"));
		seat.click();
		Thread.sleep(2000);
		
		WebElement proceed = driver.findElement(By.xpath("//button[text()='Proceed']"));
		proceed.click();
		Thread.sleep(2000);
		
		WebElement seatInfo = driver.findElement(By.xpath("//div[@class='seat-number']"));
		System.out.println(seatInfo.getText());
		Thread.sleep(2000);
		
		WebElement grandTotal = driver.findElement(By.xpath("//div[@class='all-grand']"));
		System.out.println(grandTotal.getText());
		Thread.sleep(2000);
		
		WebElement cont= driver.findElement(By.xpath("//button[text()='Continue']"));
		cont.click();
		Thread.sleep(2000);
		
		WebElement close = driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]"));
		close.click();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.close();
		

		
		
		
		
	
		
		
		
		
	}
}
		
		