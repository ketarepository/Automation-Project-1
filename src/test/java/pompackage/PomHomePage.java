package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomHomePage extends BaseAmazonClass {


	
@FindBy(id= "nav-link-accountList-nav-line-1")	
	WebElement userName;

@FindBy (css= "#nav-link-accountList > span")
	WebElement AccountLists;
	
	
public PomHomePage() {
	PageFactory.initElements(driver, this);

}

public String verifyPomHomePageTitle() {
	return driver.getTitle();
}

public boolean verifyCorrectUserName() {
return	userName.isDisplayed();
	
}
public PomAccountPage clickOnAccountLists() {
		AccountLists.click();
		return new PomAccountPage();
		
	}
	
	}
	
	
	

