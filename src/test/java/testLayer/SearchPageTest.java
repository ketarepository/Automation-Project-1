package testLayer;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import basePackage.BaseAmazonClass;
import pompackage.PomHomePage;
import pompackage.PomLogin;
import pompackage.PomSearchPage;

public class SearchPageTest extends BaseAmazonClass{

	PomLogin Log;
	PomHomePage homePage;
	TimeUtils testUtil;
 PomSearchPage SearchPage;
	
@BeforeMethod
	
	public void initsetup()   {
		initiate();
	
		Log= new PomLogin();
		homePage=	Log.Login(prop.getProperty("email"), prop.getProperty("password"));
		SearchPage = new PomSearchPage();
}


@Test (priority =1)
public void SearchBar() {
	SearchPage.SearchBar();
}

@Test (priority =2)
public void Tshirts() {
	SearchPage.Tshirt();
}
@Test (priority=3)
public void AddToCart() {
	SearchPage.AddToCart();
}

@Test(priority=4)
public void verifyProduct() {
	boolean VerifyProduct = SearchPage.verifyProduct();
	Assert.assertEquals(VerifyProduct, "Amazon.ca Shopping Cart");
}
@Test (priority=5)
public void CheckOut() {
	SearchPage.CheckOut();
}
@AfterMethod
public void tearDown() {
	driver.quit();
}

}