package Util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDriver {

	
private static WebDriver dr;
	
	private static SeleniumDriver seleniumDriver;
	//init webdriver
	private static WebDriverWait waitDriver;
	public final static int TIMEOUT= 30;
	public final static int PAGE_LOAD_TIMEOUT =50;
	
	private SeleniumDriver() {
		dr =new ChromeDriver();
		dr.manage().window().maximize();
		waitDriver= new WebDriverWait(dr,TIMEOUT);
		dr.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
		dr.manage().timeouts().pageLoadTimeout(PAGE_LOAD_TIMEOUT,  TimeUnit.SECONDS);
	}
	public static void openpage(String url) {
		dr.get(url);
	}
	public static  WebDriver getDriver() {
		return dr;
	}
	public static void setUpdriver() {
		if(seleniumDriver==null) {
			seleniumDriver= new SeleniumDriver();
		}
	}
	public static void tearDown() {
		if(dr != null) {
			dr.close();
			dr.quit();
		}
		seleniumDriver=null;
	}

	}



