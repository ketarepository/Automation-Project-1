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

public class AddressPageTest extends BaseAmazonClass {

	
	PomLogin Log;
	PomHomePage homePage;
	TimeUtils testUtil;
	PomAccountPage AccountPage;
	PomAddressPage AddressPage;
 
	public AddressPageTest() {
		super();
		
	}
	
	@BeforeMethod
	
	public void initsetup()   {
		initiate();
		AccountPage = new PomAccountPage();
		AddressPage = new PomAddressPage();
			Log= new PomLogin();
	homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
	AccountPage = homePage.clickOnAccountLists();
AddressPage = AccountPage.clickOnYourAddress();

	}	
	
	@Test (priority=1)
	public void AddAddress() {
		AddressPage.AddAddress();
	}
	
	@Test(priority=2)
	public void SelectCountry() {
		AddressPage.SelectCountry("Canada");
	}
	
	@Test (priority=3)
	public void Details() throws InterruptedException {
		Thread.sleep(3000);
		AddressPage.AddAddress();
		AddressPage.FullName();
		AddressPage.PhoneNumber();
		AddressPage.Address();
		AddressPage.City();
		AddressPage.PostalCode();
		AddressPage.SelectProvince();
		AddressPage.Default();
		AddressPage.Add();
	}

	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}











