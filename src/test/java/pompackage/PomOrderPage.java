package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomOrderPage extends BaseAmazonClass {

	@FindBy (xpath= "//li[contains(text(),'Orders')]")	
	WebElement Order;
	
	@FindBy (xpath= "//a[contains(text(),'Buy Again')]")
	WebElement BuyAgain;
	
	@FindBy (xpath= "//a[contains(text(),'Not Yet Shipped')]")
	WebElement NotYetShipped;
	
	@FindBy (xpath= "//a[contains(text(),'Cancelled Orders')]")
	WebElement CancelledOrder;
	
	public PomOrderPage() {
		PageFactory.initElements(driver, this);
	}	
	
public void clickOnOrder() {
	Order.click();
}

public void clickOnBuyAgain() {
	BuyAgain.click();
}

public void clickOnNotYetShipped() {
	NotYetShipped.click();
}

public void clickOnCancelledOrder() {
	CancelledOrder.click();
	 
}

}



