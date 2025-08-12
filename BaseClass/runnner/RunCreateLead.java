package runnner;

import org.testng.annotations.Test;

import BaseClass.baseCreate;
import Pages.loginPage;

public class RunCreateLead extends baseCreate {
	
	@Test
	public void runnerCreateLead() throws InterruptedException {
		loginPage lg=new loginPage();
		lg.userName().password().clickLogin().clickCRM().clickLead().clickCreate()
		.cmpName().firstName().lastName().create().verify();
		 
		 
	  
}
}