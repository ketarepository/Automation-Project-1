package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import basePackage.BaseAmazonClass;
import pompackage.PomAccountPage;
import pompackage.PomAddressPage;
import pompackage.PomHomePage;
import pompackage.PomLogin;
import pompackage.PomOrderPage;
import pompackage.PomPaymentPage;

public class AccountPageTest extends BaseAmazonClass{

	PomLogin Log;
	PomHomePage homePage;
	TimeUtils testUtil;
	PomAccountPage AccountPage;
	PomOrderPage OrderPage;
	PomAddressPage AddressPage;
	PomPaymentPage PaymentPage;
	public AccountPageTest() {
		super();
		
	}
	
	@BeforeMethod
	
	public void initsetup()   {
		initiate();
		AccountPage = new PomAccountPage();
		OrderPage = new PomOrderPage();
		AddressPage =  new PomAddressPage();
		PaymentPage = new PomPaymentPage();
		Log= new PomLogin();
	homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
	AccountPage = homePage.clickOnAccountLists();
	}
	
	@Test (priority=1)
	public void verifyYourOrder() {
		OrderPage = AccountPage.clickOnYourOrder();
	}
	
	@Test (priority=2)
	public void verifyYourAddress() {
		AddressPage = AccountPage.clickOnYourAddress();
		
	}
	@Test (priority=3)
	public void verifyYourPayment() {
		PaymentPage= AccountPage.clickOnYourPayment();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
