package net.serenitybdd.practiseSession.steps;


import org.junit.Assert;

import jline.internal.Log;
import net.serenitybdd.practiseSession.pages.Guru99HomePage;
import net.serenitybdd.practiseSession.pages.Guru99LoginPage;
import net.serenitybdd.practiseSession.pages.Guru99TelecomProjectPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestGuru99Steps extends ScenarioSteps{
	Guru99LoginPage GLP;
	Guru99HomePage GHP;
	Guru99TelecomProjectPage GTPP;
	@Step
	public void open() {
		GLP.open();	
		getDriver().manage().window().maximize();
    	Log.info("Browser window has been Maximized");
	}

	
	@Step
	public void submitUnameandPass(String uname, String pass) {
		// TODO Auto-generated method stub
		GLP.loginToGuru99(uname, pass);
	}
	@Step
	public void logintoGuru99Accnt() {
		// TODO Auto-generated method stub
		String loginPageTitle =GLP.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		Log.info("User is on the Login Page");
	}
	@Step
	public void userIsOnHomePage() {
		// TODO Auto-generated method stub
		String homePageUserName = GHP.getHomePageDashboardUserName();
		Log.info("User is on the Home Page");
	}
	public void userClicksOnInsuranceProjLink() {
		// TODO Auto-generated method stub
		GHP.clickonTelecomprojectLink();
	}
	public void insuranceLoginPagedisplayed() {
		// TODO Auto-generated method stub
		String telecomLogoInfo=GTPP.gettelecomlogoinfo();
		Assert.assertTrue(telecomLogoInfo.toLowerCase().contains("guru99 telecom"));
		Log.info("User is on the Telecom Insurance Project Page");
	}
	public void completeRegistration() {
		GTPP.clickAddCustomerLink();
	}
	
	
	
}
