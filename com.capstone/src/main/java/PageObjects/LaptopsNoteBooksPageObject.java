package PageObjects;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import ulitities.Utilities;

public class LaptopsNoteBooksPageObject extends Base {

	public LaptopsNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks']")
	private WebElement showAllLaptopsAndNotebooks;
	@FindBy(xpath = "//h2[text()='Laptops & Notebooks']")
	private WebElement LaptopsAndNotebooksText;
	@FindBy(xpath = "//a[text()='Desktops (13)']/self::a")
	private WebElement sideMenuDesktop;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[1]")
	private WebElement sideMenulaptopsAndNotebooks;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[2]")
	private WebElement sideMenuMacs;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[3]")
	private WebElement sideMenuWindows;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[4]")
	private WebElement sideMenuComponents;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[5]")
	private WebElement sideMenuTablets;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[6]")
	private WebElement sideMenuSoftware;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[7]")
	private WebElement sideMenuPhonesAndPDAs;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[8]")
	private WebElement sideMenuCameras;
	@FindBy(xpath = "//a[text()='Desktops (13)']/following-sibling::a[9]")
	private WebElement sideMenuMP3Player;
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement HPLP3065;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//child::div//child::div//child::button[1]")
	private WebElement HPLP3065AddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//child::div//child::div//child::button[2]")
	private WebElement HPLP3065AddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//child::div//child::div//child::button[3]")
	private WebElement HPLP3065CompareThisProduct;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement macBook;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//child::div//child::div//child::button[1]")
	private WebElement macBookAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//child::div//child::div//child::button[2]")
	private WebElement macBookAddToWishList;
	@FindBy(xpath = "//div[@class='row'][4]//div[2]//div//div//button[3]")
	private WebElement macBookCompareThisProduct;
	@FindBy(xpath = "//a[contains(text(),'Air')]")
	private WebElement macBookAir;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][3]//child::div//child::div//child::button[1]")
	private WebElement macBookAirAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][3]//child::div//child::div//child::button[2]")
	private WebElement macBookAirAddToWishList;
	@FindBy(xpath = "//div[@class='row'][4]//div[3]//div//div//button[3]")
	private WebElement macBookAirCompareToProduct;
	@FindBy(xpath = "//a[text()='product comparison']")
	private WebElement ComparisonLink;
	@FindBy(xpath = "//div[@class='col-sm-12'] ")
	private WebElement comparisonTable;
	@FindBy(xpath = "//h2[text()='$2,000.00']")
	private WebElement MacbookPrice2000;
	@FindBy(xpath = "//a[text()='MacBook Pro']")
	private WebElement macBookPro;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//child::div//child::div//child::button[1]")
	private WebElement macBookProAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//child::div//child::div//child::button[2]")
	private WebElement macBookProAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//child::div//child::div//child::button[3]")
	private WebElement macBookProCompareThisProduct;
	@FindBy(xpath = "//a[contains(text(),'VAIO')]")
	private WebElement sonyVAIO;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][5]//child::div//child::div//child::button[1]")
	private WebElement sonyVAIOAddToCart;
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[5]/div[1]/div[2]/div[2]/button[2]")
	private WebElement sonyVAIOAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][5]//child::div//child::div//child::button[3]")
	private WebElement sonyVAIOCompareToProduct;
	@FindBy(xpath = "//div[text()='Showing 1 to 5 of 5 (1 Pages)']")
	private WebElement showingPage1to5;
	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement CartButtoninLaptopPage;
	@FindBy(xpath = "//div[@class='btn-group btn-block']")
	private WebElement itemsblackbutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement youMustLoginToAddSonyVaioToWishListMessage;
	@FindBy(xpath = "//button[@title='Remove']")
	private WebElement xRedButton;
	@FindBy(xpath = "//span[text()=' 0 item(s) - $0.00']")
	private WebElement cartIconWith0Items;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks']")
	private WebElement laptopsAndNoteBooksTab;
	@FindBy(xpath = "//img[@alt='MacBook']")
	private WebElement macBookItem;
	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessage;
	@FindBy(xpath = "//span[@id='cart-total']")
	private WebElement cartTotal;
	@FindBy(xpath = "//table[@class='table table-striped']//tr//td//button")
	private WebElement removeButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement McBookAirSuccessMessage;

	public void showAllLaptopAndNoteBooks() {
		showAllLaptopsAndNotebooks.click();
	}

	public void clickOnMacBook() {
		macBook.click();
	}

	public void clickOnlaptopsAndNoteBooksTab() {
		laptopsAndNoteBooksTab.click();
	}

	public void clickOnlaptopsAndNoteBooksFromList() {
		showAllLaptopsAndNotebooks.click();
	}

	public void clickOnMacBookItem() {
		macBookItem.click();
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public void verifySuccessMessage() {
		String actualSuccessMssg = successMessage.getText();
		String expected = "Success: You have added MacBook to your shopping cart!";
		String strString = actualSuccessMssg.substring(0, 54);
		Assert.assertEquals(expected, strString);

	}

	public void verifyCartTotal(String strCartTotal) {
		String actualCartTotal = cartTotal.getText();
		Assert.assertEquals(strCartTotal, actualCartTotal);
	}

	public void clickOnCartOption() {
		cartTotal.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void clickOnRemoveItemButton() {
		removeButton.click();
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void verifyCartTotalAfterRemovingItem(String strCartTotalAfterRemove) throws IOException {
		String actualCartTotal = cartTotal.getText();
		Utilities.highlightelementRedBorderAndTakeScreenshot(cartTotal, "zero cart total");
		Assert.assertEquals(strCartTotalAfterRemove, actualCartTotal);

	}

	public void ValidateSuccessMessageMacbookAirComparison(String str) throws IOException {

		String actualSuccessMssg = McBookAirSuccessMessage.getText();
		String strString = actualSuccessMssg.substring(0, 63);
		Assert.assertEquals(str, strString);
		Utilities.highlightelementRedBorderAndTakeScreenshot(McBookAirSuccessMessage, "comparison success message");

	}

	public void clickOnMacbookAirCompareProduct() {
		Utilities.clickWithJSE(macBookAirCompareToProduct);
	}

	public void clickOnMacbookComparisonIcon() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.scrolldownPage();
		macBookCompareThisProduct.click();
	}

	public void clickOnComparisonLink() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Utilities.clickWithJSE(ComparisonLink);
	}

	public void valiateComparisonTable() {
		comparisonTable.isDisplayed();
	}

	public void validateyouMustLoginToAddSonyVaioToWishListMessage(String message) throws IOException {
		String actual = youMustLoginToAddSonyVaioToWishListMessage.getText();
		String subStringactualMessage = actual.substring(0, 72);
		Assert.assertEquals(message, subStringactualMessage);
		Utilities.highlightelementRedBorderAndTakeScreenshot(youMustLoginToAddSonyVaioToWishListMessage,
				"Sony Vaio Success Message");

	}

	public void clickOnAddToWishListSonyVaio() {
		sonyVAIOAddToWishList.click();
	}

	public void clickOnMacbookProText() {
		macBookPro.click();
	}

	public void macbookPrice2000presentInUI() throws IOException {
		String actual= MacbookPrice2000.getText();
		String expected= "$2,000.00";
		Assert.assertEquals(actual, expected);	
		Utilities.highlightelementRedBorder(MacbookPrice2000);
		Utilities.takeScreenShot("Macbook price 2000");
		
	}

}
