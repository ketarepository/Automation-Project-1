package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import basePackage.BaseAmazonClass;
import pompackage.PomAccountPage;
import pompackage.PomHomePage;
import pompackage.PomLogin;

public class HomePageTest extends BaseAmazonClass {

	PomLogin Log;
	PomHomePage homePage;
	TimeUtils testUtil;
	PomAccountPage AccountPage;
	
	public HomePageTest() {
		super();
		
	}
	
	@BeforeMethod
	
	public void initsetup()   {
		initiate();
		AccountPage= new PomAccountPage();
		Log= new PomLogin();
	homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
	}
	
	@Test (priority=1)
	public void verifyHomePageTitleTest() {
	String homePageTitle= 	homePage.verifyPomHomePageTitle();
	Assert.assertEquals(homePageTitle, "Amazon.ca: Low Prices, Fast Shipping,Millions of Items","Home page title not matched");
	}
	
	
	@Test (priority=2)
	public void verifyUserNameTest() {
			Assert.assertTrue(homePage.verifyCorrectUserName());
		}
	
	@Test (priority=3)
	public void verifyAccountListsTest() {
	AccountPage= 	homePage.clickOnAccountLists();
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
		
		
	}
	
	
}
