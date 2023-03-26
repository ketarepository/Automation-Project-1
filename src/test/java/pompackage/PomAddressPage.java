package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import basePackage.BaseAmazonClass;

public class PomAddressPage extends BaseAmazonClass {

	@FindBy (xpath= "//div[@id='ya-myab-plus-address-icon']")
	WebElement AddAddress;
	
	@FindBy (xpath ="//span[contains(text(),'Canada')]")
	WebElement Country;
	
	@FindBy (xpath= "//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement FullName;
	
	@FindBy (xpath= "//input[@id='address-ui-widgets-enterAddressPhoneNumber']")
	WebElement PhoneNumber;
	
	@FindBy (xpath= "//input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement Address;
	
	@FindBy (xpath = "//input[@id='address-ui-widgets-enterAddressCity']")
	WebElement City;
	
	@FindBy (xpath= "//span[contains(text(),'Select')]")
	WebElement Province;
	
	@FindBy (xpath= "//input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement PostalCode;
	
	@FindBy (xpath= "//input[@id='address-ui-widgets-use-as-my-default']")
	WebElement Default;
	
	@FindBy (xpath= "//span[contains(text(),'Add preferences, notes, access codes and more')]")
	WebElement Delivery;
	
	@FindBy (xpath= "//span[contains(text(),'Add address')]")
	WebElement Add;
	
	
	public PomAddressPage() {
		PageFactory.initElements(driver, this);
	}	
	
	public void AddAddress() {
		AddAddress.click();
	}
	
	public void SelectCountry(String name) {
		driver.findElement(By.xpath("//span[contains(text(),'Canada')]")).isDisplayed();
	}
	
	public void FullName() {
	driver.findElement(By.cssSelector("#address-ui-widgets-enterAddressFullName")).sendKeys("Keta Patel");
	}
	public void PhoneNumber() {
	PhoneNumber.sendKeys("234567891");
}
	public void Address() {
	Address.sendKeys("21 abc drive");
}
	public void City() {
	City.sendKeys("Hamilton");
	}
	public void PostalCode() {
	PostalCode.sendKeys("L8E2H2");
	}

	public void SelectProvince( ) {
		driver.findElement(By.xpath("//span[contains(@class,'a-dropdown-prompt')]")).click();
		driver.findElements(By.xpath("//ul[contains(@class,'a-nostyle a-list-link')]//li//a"));
	
	}
	
	public void Default() {
		Default.click();
	}
	
	public void Delivery() {
		Delivery.click();
	}
	
	public void Add() {
		Add.click();
	}

	
	

	
	
}
