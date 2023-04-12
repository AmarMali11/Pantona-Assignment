package utils;

import java.io.FileInputStream;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {


	public static WebDriver driver;
	public static Properties prop;

	//	Constructor for loading config.properties file

	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(
					"G:\\Manual & Automation\\Eclipse Project\\Assignment\\src\\driver");
			prop.load(fis);
		} catch (Exception e) {
		}
	}

	public static void initialization(String browser)
	{
	//	String browser = prop.getProperty("browser");
		if (browser.equals("chrome"))
		{	
/*
   			//to disable browser popus
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
*/
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
			driver = new FirefoxDriver();
		}


		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("URL"));
	
	}
	
	}
