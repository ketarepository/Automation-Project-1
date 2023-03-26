package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomLogin extends BaseAmazonClass {

	
	
	@FindBy(id="ap_email")
	WebElement email;
	
	@FindBy(id="continue")
	WebElement Continuebtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement SignInbtn;
	
	
	public PomLogin() {
		PageFactory.initElements(driver, this);
	
	}
	public PomHomePage Login(String name, String pass) {
		email.sendKeys("ketanikunj2608@gmail.com");
		Continuebtn.click();
		password.sendKeys("Keta@1205");
		SignInbtn.click();
	
		
		return new PomHomePage();
	}
	public String verify() {
		return driver.getTitle();
		
	}
}
