package BaseClass;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class baseCreate {
	
	public static EdgeDriver driver;	

	
	@BeforeMethod
	public void precond() {	
    
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
}
	@AfterMethod
	public void postcond (){
		
		driver.close();
		
	}
}