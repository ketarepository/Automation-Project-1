package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomPaymentPage extends BaseAmazonClass {

@FindBy (xpath = "//a[@id='pp-TCg1oS-10']")	
WebElement AddPayment;

@FindBy (id= "pp-XVKTaF-16")
WebElement CardNumber;

@FindBy (id= "pp-MS3u0P-18")
	WebElement Name;

@FindBy (id = "pp-MS3u0P-19_11")
WebElement Date;

@FindBy (id ="pp-MS3u0P-21_12")
WebElement Year;

@FindBy (id= "pp-MS3u0P-25")
WebElement CVV;

@FindBy (id= "pp-MS3u0P-30-announce")
WebElement Add;


public PomPaymentPage() {
	PageFactory.initElements(driver, this);
}
	
public void AddPayment() {
	AddPayment.click();
}
	
	public void CardNumber() {
		CardNumber.sendKeys("5555555555554444");
	}
	
	public void Name() {
		Name.sendKeys("Tom");
	}
public void Date() {
	Date.click();
}
	
public void Year() {
	Year.click();
}
public void CVV() {
	CVV.sendKeys("100");
}
public void Add() {
	Add.click();
}



}
