package utils;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonLibrary {

	private WebDriver driver;
	static WebDriverWait wait;

	public CommonLibrary()
	{
		this.driver=driver;
	}
	
	

	public static void takeScreenshot(WebDriver driver, String screenshotName) throws IOException {
		try {
			File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("./screenshots/"+screenshotName+".png"));
			System.out.println("Screenshot taken");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	
	public String getRandomNumberString() {
		Random rnd = new Random();
		int number = rnd.nextInt(999);
		return String.format("%03d", number);

	}

	public static int random()
	{
		int    Maxnumber = 2000000000;
		int    Minnumber = 1000000000;
		Random rn        = new Random();
		int    n         = Maxnumber - Minnumber + 1;
		int    i         = rn.nextInt() % n;
		int    randomNum = Minnumber + i;
		return randomNum;

	}



	public static void clickBtn(WebElement element) throws
	Exception { 
		try{
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
		}
		catch(NoSuchElementException e) 
		{
			System.out.println(e); 
		}
	}


	public static void sendKey(WebElement element,String text) throws Exception

	{
		try{
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.sendKeys(text);
		}
		catch(NoSuchElementException e)
		{
			System.out.println(e);
		}

	}

	public boolean isElementPresent(WebDriver driver, By by)

	{
		try
		{
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e)
		{
			return false;
		}
	}

	public static void randomString() {

		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = 10;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int) 
					(random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}

		String generatedString = buffer.toString();

		// System.out.println(generatedString);	

	}



}	










