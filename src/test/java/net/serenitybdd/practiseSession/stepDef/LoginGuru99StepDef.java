package net.serenitybdd.practiseSession.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.practiseSession.steps.LoginTestGuru99Steps;
import net.thucydides.core.annotations.Steps;

public class LoginGuru99StepDef {
	@Steps
	LoginTestGuru99Steps LTG_steps;
	@Given("^I navigate to the login page$")
	public void i_navigate_to_the_login_page() throws Exception {
		 LTG_steps.open(); 
	}


	@When("^I submit username '(.*)' and password '(.*)'$")
	public void i_submit_username_and_password(String uname, String pass) throws Exception {
		    LTG_steps.submitUnameandPass(uname,pass);
	}
	
	@Then("^I should be logged in$")
	public void i_should_be_logged_in() throws Exception {
	   LTG_steps.logintoGuru99Accnt();
	}

	@Given("^User is already on the home page$")
	public void user_is_already_on_the_home_page() throws Exception {
	   LTG_steps.userIsOnHomePage();
	}

	@When("^User clicks on Insurance Project link$")
	public void user_clicks_on_Insurance_Project_link() throws Exception {
	    LTG_steps.userClicksOnInsuranceProjLink();
	}

	@Then("^Login page for Insurance gets displayed$")
	public void login_page_for_Insurance_gets_displayed() throws Exception {
		LTG_steps.insuranceLoginPagedisplayed();
	    
	}

	@Then("^complete registration if you are a new user$")
	public void complete_registration_if_you_are_a_new_user() throws Exception {
		LTG_steps.completeRegistration();
	   
	}

	@Then("^enter the login credentials to login to Insurance website$")
	public void enter_the_login_credentials_to_login_to_Insurance_website() throws Exception {
	   
	}


}
