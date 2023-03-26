package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomAccountPage extends BaseAmazonClass{

	
@FindBy(xpath= "//h2[contains(text(),'  Your Orders')]")
WebElement YourOrder;

@FindBy (xpath= "//h2[contains(text(),'Your Addresses')]")
WebElement YourAddress;

@FindBy (xpath= "//h2[contains(text(),'Your Payments')]")
WebElement YourPayment;

public PomAccountPage() {
	PageFactory.initElements(driver, this);
}

public PomOrderPage clickOnYourOrder() {
	YourOrder.click();
	return new PomOrderPage();
	
}
public PomAddressPage clickOnYourAddress() {
	YourAddress.click();
	return new PomAddressPage();
}
public PomPaymentPage clickOnYourPayment() {
	YourPayment.click();
	return new PomPaymentPage();
}
}
