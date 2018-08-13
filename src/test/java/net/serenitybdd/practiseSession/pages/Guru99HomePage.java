package net.serenitybdd.practiseSession.pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.practiseSession.utilities.HelperMethods;
import net.serenitybdd.practiseSession.utilities.Utilities;

public class Guru99HomePage extends PageObject {
	HelperMethods helper = new HelperMethods();
	Utilities util = new Utilities();
	

	// PAGE OBJECTs are located Here
	@FindBy(xpath = "//table//tr[@class='heading3']")
	private WebElementFacade homePageUserName;

	@FindBy(xpath = "//a[contains(text(), 'Telecom Project')]")
	private WebElementFacade telecomprojectLink;

	// Get the User name from Home Page

	public String getHomePageDashboardUserName() {
		return homePageUserName.getText();
	}

	public void clickonTelecomprojectLink() {
		telecomprojectLink.waitUntilClickable().click();
	}
//	public String getHomePageDashboardUserName() {
//		return homePageUserName.getText();
//	}

}
