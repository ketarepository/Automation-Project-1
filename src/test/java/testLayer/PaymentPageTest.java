package testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import basePackage.BaseAmazonClass;
import pompackage.PomAccountPage;
import pompackage.PomHomePage;
import pompackage.PomLogin;
import pompackage.PomPaymentPage;

public class PaymentPageTest extends BaseAmazonClass {


	PomLogin Log;
	PomHomePage homePage;
	TimeUtils testUtil;
	PomAccountPage AccountPage;
	PomPaymentPage PaymentPage;
	public PaymentPageTest() {
		super();
		
	}
	
	@BeforeMethod
	
	public void initsetup()   {
		initiate();
		AccountPage = new PomAccountPage();
		PaymentPage = new PomPaymentPage();
		Log= new PomLogin();
	homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
	AccountPage = homePage.clickOnAccountLists();
	PaymentPage = AccountPage.clickOnYourPayment();
	}
	
	@Test (priority=1)
	public void AddPayment() throws InterruptedException {
		Thread.sleep(3000);
		PaymentPage.AddPayment();
		
	}
	
	@Test (priority=2)
	public void Payment() {
		PaymentPage.CardNumber();
		PaymentPage.Name();
		PaymentPage.Date();
		PaymentPage.Year();
		PaymentPage.CVV();
		PaymentPage.Add();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
