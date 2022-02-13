package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class PhonesPDAsPageObject extends Base {
	public PhonesPDAsPageObject() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[text()='Phones & PDAs']")
	private WebElement phoneAndPDAsText;
	@FindBy(linkText = "HTC Touch HD")
	private WebElement HTCTouchHDText;
	@FindBy(xpath = "//span[text()='Ex Tax: $279.99']")
	private WebElement HTCTouchHDPrice;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div//button[1]")
	private WebElement HTCTouchHDAddToCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div//button[2]")
	private WebElement HTCTouchHDAddToWishList;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][1]//div//div//button[3]")
	private WebElement HTCTouchHDCompareThisProduct;
	@FindBy(linkText = "iPhone")
	private WebElement iphoneText;
	@FindBy(xpath = "Ex Tax: $101.00")
	private WebElement iphonePrice;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div//button[1]")
	private WebElement iphoneAddToCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div//button[2]")
	private WebElement iphoneAddToWishList;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][2]//div//div//button[3]")
	private WebElement iphoneCompareThisProduct;
	@FindBy(linkText = "Palm Treo Pro")
	private WebElement palmTreoProText;
	@FindBy(xpath = "Ex Tax: $100.00")
	private WebElement palmTreoProPrice;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div//button[1]")
	private WebElement palmTreoProAddToCart;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div//button[2]")
	private WebElement palmTreoProAddToWishList;
	@FindBy(xpath = "//div[contains(@class,'product-layout')][3]//div//div//button[3]")
	private WebElement palmTreoProCompareThisProduct;
	@FindBy(xpath = "//div[text()='Showing 1 to 3 of 3 (1 Pages)']")
	private WebElement showing1of3page;

}
