package stepDefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesForceStepDefenition {
	public WebDriver driver;

	@Given("launch the browser and load the url")
	public void launch_the_browser_and_load_the_url() {
		
      driver=new EdgeDriver();
      driver.get("https://login.salesforce.com/");
      
      
    
}
	@When("enter the username as (.*)$")
public void enter_the_username_as_bhuvanesh_moorthy_testleaf_com(String uName) {
		
	driver.findElement(By.id("username")).sendKeys(uName);    
}

@When("enter the password as (.*)$")
public void enter_the_password_as_leaf(String int1) {
	
	driver.findElement(By.id("password")).sendKeys(int1);

	driver.findElement(By.id("Login")).click();

	
}		


@When("Click the App Launcher Icon next to Setup")
public void click_the_app_launcher_icon_next_to_setup() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement toggle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='slds-icon-waffle']"))); 
	toggle.click();
}

@When("click Select Accounts")
public void click_select_accounts() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='slds-button'])[2]"))).click();
	Thread.sleep(2000);
	WebElement accounts = driver.findElement(By.xpath("//p[text()='Accounts']"));
	Actions act=new Actions(driver);
	act.moveToElement(accounts).perform();
	accounts.click();
}

@Then("Search for the account using your unique account name")
public void search_for_the_account_using_your_unique_account_name() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Gokul']"))).click();
	
	
   
}

@Then("Click the dropdown icon next to the account and select Edit")
public void click_the_dropdown_icon_next_to_the_account_and_select_edit() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement editDD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button slds-button_icon-border-filled fix-slds-button_icon-border-filled slds-button_last']")));
	editDD.click();
	driver.findElement(By.xpath("//span[text()='Edit']")).click();
    
}

@Then("Set Type to Technology Partner")
public void set_type_to_technology_partner() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement type = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[2]")));
	type.click();
    
    WebElement techPart = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Technology Partner']")));
    techPart.click();
}

@Then("Set Industry to Healthcare")
public void set_industry_to_healthcare() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement industry = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[4]")));
    Thread.sleep(5000);
	industry.click();
	
   
    WebElement health = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[normalize-space()='Healthcare']")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", health);
    health.click();
    
}

@When("^Enter the Billing Address as (.*)$")
public void enter_the_billing_address(String bAdd) throws InterruptedException {
	Thread.sleep(3000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement billAdd = wait.until(ExpectedConditions.elementToBeClickable
			(By.xpath("//textarea[@class='slds-textarea']")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", billAdd);
	billAdd.click();
	billAdd.sendKeys(bAdd);
	    
}

@When("^Enter the Shipping Address  as (.*)$")
public void enter_the_shipping_address(String sAdd) throws InterruptedException {
	Thread.sleep(3000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement shipAdd = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//textarea[@class='slds-textarea'])[2]")));
	
	shipAdd.click();
	shipAdd.sendKeys(sAdd);
}

@When("Set Customer Priority to Low")
public void set_customer_priority_to_low() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement cusPrio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[5]")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cusPrio);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Low']")).click();
}

@When("Set SLA to Silver")
public void set_sla_to_silver() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement SLA = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[6]")));
    ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SLA);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//span[text()='Silver']")).click();
}

@When("Set Active to NO")
public void set_active_to_no() throws InterruptedException {
	Thread.sleep(3000);
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement active= wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("(//button[@aria-haspopup='listbox'])[8]"))));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", active);
    active.click();
    
    WebElement no = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='No']")));
    no.click();
}

@When("Enter a unique number in the Phone field as (.*)$")
public void enter_a_unique_number_in_the_phone_field(String int2) throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement ph = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='slds-input'])[3]")));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ph);
	ph.click();
	ph.sendKeys(int2);
	Thread.sleep(3000);
    
}

@When("Set Upsell Opportunity to No")
public void set_upsell_opportunity_to_no() throws InterruptedException {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
	WebElement upShell = wait.until((ExpectedConditions.elementToBeClickable(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[7]"))));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", upShell);
    upShell.click();
    
    WebElement no2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("//span[@title='No']"))));
    no2.click();
}

@When("Click Save and verify the phone number")
public void click_save_and_verify_the_phone_number() throws InterruptedException {
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Save']")).click();
	Thread.sleep(3000);
	WebElement toastMsg = driver.findElement(By.xpath("//span[@data-aura-class='forceActionsText']"));
    System.out.println(toastMsg.getText());
}



    }