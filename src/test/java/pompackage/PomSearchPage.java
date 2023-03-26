package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basePackage.BaseAmazonClass;

public class PomSearchPage extends BaseAmazonClass{

@FindBy (id = "twotabsearchtextbox")
WebElement SearchBar;

 
@FindBy (id ="add-to-cart-button")
WebElement AddToCart;

@FindBy (xpath ="//h1[contains(text(),'Shopping Cart')]")
WebElement verifyProduct;

@FindBy (id ="sc-buy-box-ptc-button-announce")
WebElement CheckOut;

public PomSearchPage() {
	PageFactory.initElements(driver, this);
}


public void SearchBar() {
	SearchBar.sendKeys("t shirts");
}

public void Search() {
	driver.findElement(By.xpath("//div[contains(text(),'t shirts')]")).click();
}

public void Tshirt() {
	driver.findElement(By.xpath("//span[contains(text(),'Women's 2-Pack Classic-Fit Short-Sleeve V-Neck T-Shirt')]"));
}

public void AddToCart() {
	AddToCart.click();
}

public boolean verifyProduct() {
	return verifyProduct.isDisplayed();
}

public void CheckOut() {
	CheckOut.click();
}

}