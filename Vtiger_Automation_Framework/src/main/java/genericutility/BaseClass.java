package genericutility;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import objectrepository.HomePage;
import objectrepository.LoginPage;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentReports eReport;
	public static ExtentTest test;
	
	// we can access in outside package
	
	public JavaUtility jutil=new JavaUtility();
	public WebDriverUtility wUtil=new WebDriverUtility();
	public FileUtility fUtil=new FileUtility();
	
	@BeforeSuite
	public void reportconfig() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtentReport_"+jutil.getSystemTime()+".html");
		eReport=new ExtentReports();
		eReport.attachReporter(spark);
	}
	
	@BeforeClass
	public void openBrowser() throws IOException, InterruptedException {
		 driver=new ChromeDriver();
		 wUtil.maximize(driver);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		 
		 driver.get(fUtil.getDataFromProperty("url"));
		 
	}
	
	@BeforeMethod
	public void login() throws IOException {
		LoginPage lp=new LoginPage(driver);
		lp.getUserNameTextField().sendKeys(fUtil.getDataFromProperty("username"));
		
		lp.getPasswordTextField().sendKeys(fUtil.getDataFromProperty("password"));
		lp.getLoginButton().click();
		
	}
	
	@AfterMethod
	public void logout() {
		HomePage hp=new HomePage(driver);
		wUtil.mouseHover(driver, hp.getMyProfileIcon());
		hp.getSignOutLink().click();
		
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	
	@AfterSuite
	public void reportBackup() {
		eReport.flush();
	}

}
