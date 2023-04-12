package POM.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utils.CommonLibrary;
import utils.TestBase;

public class contact_Us_Page extends TestBase {

	CommonLibrary CommnLib;
	WebDriver driver;


	//	Object Repository

	@FindBy(how = How.XPATH, using ="//img[@title=\"intelligence-bank-logo-x1\"]")
	private WebElement imageAndLog;

	@FindBy(how = How.XPATH, using ="//div[contains(@class,'company pd-text  ')]//input")
	private WebElement companyName;

	@FindBy(how = How.XPATH, using ="//label[text()='First Name*']//following-sibling::input")
	private WebElement firstNameInputBox;

	@FindBy(how = How.XPATH, using ="//label[text()='Last Name*']//following-sibling::input")
	private WebElement LastNameInputBox;

	@FindBy(how = How.XPATH, using ="//label[text()='Work Email*']//following-sibling::input")
	private WebElement inputWorkEmailBox;

	@FindBy(how = How.XPATH, using ="//label[text()='Phone']//following-sibling::input")
	private WebElement PhoneBox;

	@FindBy(how = How.XPATH, using ="//label[contains(text(),'Country*')]//ancestor::div/select")
	private WebElement CountyDropDown;

	@FindBy(how = How.XPATH, using ="//label[contains(text(),'Country*')]//ancestor::div/following-sibling::div[1]/textarea")
	private WebElement EnquiryDetailsInputBox;

	@FindBy(how = How.XPATH, using ="//label[contains(text(),'How did you hear about us?')]//ancestor::div/select")
	private WebElement hearAboutUsDropDown;

	@FindBy(how = How.XPATH, using ="//*[@id=\"pardot-form\"]/div[10]/span/span/label")
	private WebElement iAgreeCheckBox;

	@FindBy(how = How.XPATH, using ="//label[contains(text(),'* Terms and Privacy Policy')]//ancestor::div//following-sibling::p[2]/input")
	private WebElement contactUSBtn;



	//	Initializing Page Objects
	public contact_Us_Page() {
		PageFactory.initElements(driver, this);
	}


	//	Actions/Methods

	public Boolean checkImageAndLog() {
		return imageAndLog.isDisplayed();
	}

	public Boolean checkVisibilityOfCompanyNameInputBox() {
		return companyName.isDisplayed();

	}


	public void enterCompanyName() throws Exception {

		CommonLibrary.sendKey(companyName, CommnLib.getRandomNumberString());

	}




	public void checkVisibilityOfFirstnameAndEnterValue() throws Exception {

		if(firstNameInputBox.isDisplayed()==true) {
			System.out.println("Input Email Box is visible");
			CommonLibrary.sendKey(firstNameInputBox, CommnLib.getRandomNumberString());
		}else
		{
			System.out.println("Input Email Box is not visible ");
		}
	}


	public void checkVisibilityOfLastnameAndEnterValue() throws Exception {

		if(LastNameInputBox.isDisplayed()==true) {
			System.out.println("Input LastNameInputBox  is visible");
			CommonLibrary.sendKey(LastNameInputBox, CommnLib.getRandomNumberString());
		}else
		{
			System.out.println("Input LastNameInputBox is not visible ");
		}
	}

	public void checkVisibilityOfEorkEmailAndEnterValue() throws Exception {

		if(inputWorkEmailBox.isDisplayed()==true) {
			System.out.println("Input inputWorkEmailBox  is visible");
			CommonLibrary.sendKey(inputWorkEmailBox, CommnLib.getRandomNumberString()+"@mailinator.com");
		}else
		{
			System.out.println("Input inputWorkEmailBox is not visible ");
		}		
	}

	public void checkVisibilityOfPhoneInputBoxAndEnterValue() throws Exception {

		if(PhoneBox.isDisplayed()==true) {
			System.out.println("Input inputWorkEmailBox  is visible");
			PhoneBox.sendKeys("132132165");
		}else
		{
			System.out.println("Input inputWorkEmailBox is not visible ");
		}	}



	public void checkVisibilityOfEnquiryDetailsInputBoxAndEnterDetails() throws Exception {

		if(PhoneBox.isDisplayed()==true) {
			System.out.println("Input EnquiryDetailsInputBox  is visible");
			CommonLibrary.sendKey(EnquiryDetailsInputBox, CommnLib.getRandomNumberString());
		}else
		{
			System.out.println("Input EnquiryDetailsInputBox is not visible ");
		}

	}

	public void selectCountryFromDropDown() {

		Select select= new Select(CountyDropDown);

		select.selectByIndex(10);

	}

	public void selectValueForHearAboutUsFromDropDown() {

		Select select= new Select(hearAboutUsDropDown);

		select.selectByValue("Social Media");

	}


	@SuppressWarnings("static-access")
	public void claickOnCheckBox() throws Exception {

		CommnLib.clickBtn(iAgreeCheckBox);
	}


	
	  public void clickOnCountactUSBtn() throws Exception {
	  CommonLibrary.clickBtn(contactUSBtn);
	  
	  }
	 



}