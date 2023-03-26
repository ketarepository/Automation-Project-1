package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePackage.BaseAmazonClass;
import pompackage.PomHomePage;
import pompackage.PomLogin;
import testdata.ExcelSheet;

public class LoginTest extends BaseAmazonClass {
	PomLogin Log;
	PomHomePage homePage;
	public LoginTest() {
		super();
		
	}
	
	@BeforeMethod
	
	public void initsetup()   {
		initiate();
		Log= new PomLogin();
	}
	
	@Test (priority=1)
	public void Title() {
	String actual=	Log.verify();
		Assert.assertEquals(actual,"Amazon Sign In");
	}
	@DataProvider
	public Object[][]Details(){
		Object result [][]=ExcelSheet.readdata("Sheet1");
		return result;
	}
	@Test(priority=2)
	public void Login() throws InterruptedException  {
		
	homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
	
	
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}