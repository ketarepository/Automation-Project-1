package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import basePackage.BaseAmazonClass;
import pompackage.PomAccountPage;
import pompackage.PomHomePage;
import pompackage.PomLogin;
import pompackage.PomOrderPage;

public class OrderPageTest extends BaseAmazonClass {

	PomLogin Log;
	PomHomePage homePage;
	TimeUtils testUtil;
	PomAccountPage AccountPage;
	PomOrderPage OrderPage;
 
	public OrderPageTest() {
		super();
		
	}
	
	@BeforeMethod
	
	public void initsetup()   {
		initiate();
		AccountPage = new PomAccountPage();
		OrderPage = new PomOrderPage();
			Log= new PomLogin();
	homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
	AccountPage = homePage.clickOnAccountLists();
OrderPage = AccountPage.clickOnYourOrder();
	}

	@Test(priority=1)
	public void verifyOrder() {
		OrderPage.clickOnOrder();
		
	}
	
	@Test(priority=2)
	public void verifyBuyAgain() {
		OrderPage.clickOnBuyAgain();
	}
	
	@Test(priority=3)
	public void verifyNotYetShipped() {
		OrderPage.clickOnNotYetShipped();
	}
	
	@Test(priority=4)
	public void verifyCancelledOrder() {
		OrderPage.clickOnCancelledOrder();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
