package Patona.Assignment;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Pages.contact_Us_Page;
import utils.CommonLibrary;
import utils.TestBase;


public class Verify_Contact_Us_Page extends TestBase
{

	
	contact_Us_Page ContactUS_Page;
	CommonLibrary CommnLib;
	WebDriver Driver;
	
	//defining child class constructor to call parent class constructor by using super() keyword for accessing config.properties file.
	
	public Verify_Contact_Us_Page()
	{
		this.Driver=driver;	
	}
	
//	!!!--- Pre Conditions ---!!!
	@BeforeMethod
	public void setup(String chrome) {
		initialization(chrome);
		
	}
	


	@Test
	public void checkImageAndLogo() {
		Boolean b = ContactUS_Page.checkImageAndLog();
		Assert.assertTrue(b);
		System.out.println("Logo displayed is = "+b);
		
	}
	
	
	@Test
	public void VerifyvisibilityOfAllInPutBoxesAndEnterValues() throws Exception
	
	{
		
		ContactUS_Page.checkVisibilityOfCompanyNameInputBox();
		ContactUS_Page.enterCompanyName();
		ContactUS_Page.checkVisibilityOfFirstnameAndEnterValue();
		ContactUS_Page.checkVisibilityOfLastnameAndEnterValue();
		ContactUS_Page.checkVisibilityOfEorkEmailAndEnterValue();
		ContactUS_Page.checkVisibilityOfPhoneInputBoxAndEnterValue();
		ContactUS_Page.selectCountryFromDropDown();
		ContactUS_Page.checkVisibilityOfEnquiryDetailsInputBoxAndEnterDetails();
		ContactUS_Page.selectValueForHearAboutUsFromDropDown();
		ContactUS_Page.claickOnCheckBox();
	//	ContactUS_Page.clickOnCountactUSBtn();
		
		CommonLibrary.takeScreenshot(Driver, "Contact US");
	
		
	}

	
//	!!!--- Post Conditions ---!!!
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	
}