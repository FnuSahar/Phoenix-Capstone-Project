package PageObjects;

import java.io.IOException;
import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import core.Base;
import ulitities.Utilities;

public class DesktopPageObject extends Base {

	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktop;
	@FindBy(xpath = "//a[text()='PC']")
	private WebElement deskPcNextToHomeButton;
	@FindBy(xpath = "//ul[@class='breadcrumb']//li//a//i")
	private WebElement deskHomeButton;
	@FindBy(xpath = "//h2[text()='Desktops']")
	private WebElement deskdesktopText;
	@FindBy(xpath = "//h3[text()='Refine Search']")
	private WebElement deskRefineSearchText;
	@FindBy(className = "fa fa-th-list")
	private WebElement deskList;
	@FindBy(className = "fa fa-th")
	private WebElement deskGrid;
	@FindBy(id = "compare-total")
	private WebElement deskProductCompareUnderRefineSearch;
	@FindBy(xpath = "//label[text()='Sort By:']")
	private WebElement deskSortByText;
	@FindBy(css = "[id=input-sort] ")
	private WebElement deskSortByBox;
	@FindBy(xpath = "//select//option[text()='Name (A - Z)']")
	private WebElement deskNameAtoZ;
	@FindBy(xpath = "//select//option[text()='Price (Low > High)']")
	private WebElement deskPriceLowHight;
	@FindBy(xpath = "//select//option[text()='Rating (Highest)']")
	private WebElement deskRatingHighest;
	@FindBy(xpath = "//select//option[text()='Name (Z - A)']")
	private WebElement deskNameZtoA;
	@FindBy(xpath = "//select//option[text()='Default']")
	private WebElement deskDefaultOption;
	@FindBy(xpath = "//select//option[text()='Rating (Lowest)']")
	private WebElement deskRatingLowest;
	@FindBy(xpath = "//select//option[text()='Model (A - Z)']")
	private WebElement deskModelAtoZ;
	@FindBy(xpath = "//select//option[text()='Model (Z - A)']")
	private WebElement deskModelZtoA;
	@FindBy(xpath = "//label[text()='Show:']")
	private WebElement deskShowText;
	@FindBy(css = "[id=input-limit]")
	private WebElement deskShowBox;
	@FindBy(xpath = "//select//option[text()='25']")
	private WebElement deskOption25;
	@FindBy(xpath = "//select//option[text()='15']")
	private WebElement deskOption15;
	@FindBy(xpath = "//select//option[text()='50']")
	private WebElement deskOption50;
	@FindBy(xpath = "//select//option[text()='75']")
	private WebElement deskOption75;
	@FindBy(xpath = "//select//option[text()='100']")
	private WebElement deskOption100;
	@FindBy(xpath = "//a[contains(text(),'Apple Cinema 30')]")
	private WebElement deskAppleCinema30;
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][1]//div//div//div//button[1]")
	private WebElement deskAppleCinema30addToCart;
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][1]//div//div//div//button[2]")
	private WebElement deskAppleCinema30AddTowishList;
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement deskCanonEOS5D;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][1]//child::div//child::div//child::button[3]")
	private WebElement deskAppleCinema30compareThisProduct;
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][2]//div//div//div//button[1]")
	private WebElement deskCanonEOS5DaddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//child::div//child::div//child::button[3]")
	private WebElement deskCanonEOS5DCompareThisProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][2]//child::div//child::div//child::button[2]")
	private WebElement deskCanonEOS5DAddToWishList;
	@FindBy(xpath = "//select[@id='input-option226']//option")
	private WebElement colorDropDown;
	@FindBy(xpath = "//option[@value='15']")
	private WebElement redColor;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageCanon5D;
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]//div//div//div//button[1]")
	private WebElement deskHPLP3065AddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][3]//child::div//child::div//child::button[3]")
	private WebElement deskHPLP3065CompareThisProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//child::div//child::div//child::button[1]")
	private WebElement deskHTCTouchHDAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//child::div//child::div//child::button[2]")
	private WebElement deskHTCTouchHDAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][4]//child::div//child::div//child::button[3]")
	private WebElement deskHTCTouchHDCompareThisCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][5]//child::div//child::div//child::button[1]")
	private WebElement deskIphoneAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][5]//child::div//child::div//child::button[2]")
	private WebElement deskIphoneAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][5]//child::div//child::div//child::button[3]")
	private WebElement deskIphoneCompareThisProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][6]//child::div//child::div//child::button[1]")
	private WebElement deskIPodClassicAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][6]//child::div//child::div//child::button[2]")
	private WebElement deskIPodClassicAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][6]//child::div//child::div//child::button[3]")
	private WebElement deskIPodClassicCompareThisProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][7]//child::div//child::div//child::button[1]")
	private WebElement deskMacBookAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][7]//child::div//child::div//child::button[2]")
	private WebElement deskMacBookAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][7]//child::div//child::div//child::button[3]")
	private WebElement deskMacBookCompareThisProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][8]//child::div//child::div//child::button[1]")
	private WebElement deskMacBookAirAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][8]//child::div//child::div//child::button[2]")
	private WebElement deskMacBookAirAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][8]//child::div//child::div//child::button[3]")
	private WebElement deskMacBookAirCompareToProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][9]//child::div//child::div//child::button[1]")
	private WebElement deskPalmTreoProAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][9]//child::div//child::div//child::button[2]")
	private WebElement deskPalmTreoProAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][9]//child::div//child::div//child::button[3]")
	private WebElement deskPalmTreoProCompareToProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][10]//child::div//child::div//child::button[1]")
	private WebElement deskProduct8AddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][10]//child::div//child::div//child::button[2]")
	private WebElement deskProduct8AddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][10]//child::div//child::div//child::button[3]")
	private WebElement deskProduct8CompareToProduct;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][11]//child::div//child::div//child::button[1]")
	private WebElement deskSamsungSyncMaster941BWAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][11]//child::div//child::div//child::button[2]")
	private WebElement deskSamsungSyncMaster941BWAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][11]//child::div//child::div//child::button[3]")
	private WebElement deskSamsungSyncMaster941BWCompareToProduct;
	@FindBy(xpath = "//a[text()='iPod Classic']")
	private WebElement deskIPodClassic;
	@FindBy(xpath = "//a[text()='MacBook']")
	private WebElement deskMacBook;
	@FindBy(xpath = "//a[contains(text(),'Air')]")
	private WebElement deskMacBookAir;
	@FindBy(xpath = "//a[contains(text(),'Treo Pro')]")
	private WebElement deskPalmTreoPro;
	@FindBy(xpath = "//a[contains(text(),'Product 8')]")
	private WebElement deskProduct8;
	@FindBy(xpath = "//a[text()='HP LP3065']")
	private WebElement deskHPLP3065;
	@FindBy(xpath = "//a[text()='HTC Touch HD']")
	private WebElement deskHTCTouchHD;
	@FindBy(xpath = "//a[text()='iPhone']")
	private WebElement deskIphone;
	@FindBy(xpath = "//a[contains(text(),'941BW')]")
	private WebElement deskSamsungSyncMaster941BW;
	@FindBy(xpath = "//a[contains(text(),'VAIO')]")
	private WebElement deskSonyVAIO;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][12]//child::div//child::div//child::button[1]")
	private WebElement deskSonyVAIOAddToCart;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][12]//child::div//child::div//child::button[2]")
	private WebElement deskSonyVAIOAddToWishList;
	@FindBy(xpath = "//div[@class='product-layout product-list col-xs-12'][12]//child::div//child::div//child::button[3]")
	private WebElement deskSonyVAIOCompareToProduct;
	@FindBy(className = "fa fa-home")
	private WebElement deskHomeIcon;
	@FindBy(xpath = "//a[text()='Desktops (13)']")
	private WebElement deskDesktop13;
	@FindBy(xpath = "//a[text()='PC (0)']")
	private WebElement deskSiteMenuPC0;
	@FindBy(xpath = "//a[text()='Mac (1)']")
	private WebElement deskSiteMenuMac1;
	@FindBy(xpath = "//a[text()='Laptops & Notebooks (5)']")
	private WebElement deskSiteMenuLaptopsAndNotebooks;
	@FindBy(xpath = "//a[text()='Components (2)']")
	private WebElement deskSiteMenuComponents;
	@FindBy(xpath = "//a[text()='Tablets (1)']")
	private WebElement deskSiteMenuTablets;
	@FindBy(xpath = "//a[text()='Software (0)']")
	private WebElement deskSiteMenuSoftware;
	@FindBy(xpath = "//a[text()='Phones & PDAs (3)']")
	private WebElement deskSiteMenuPhonesAndPDAs;
	@FindBy(xpath = "//a[text()='Cameras (2)']")
	private WebElement deskSiteMenuCameras;
	@FindBy(xpath = "//a[text()='MP3 Players (4)']")
	private WebElement deskSiteMenuMP3Players;
	@FindBy(xpath = "//img[@alt='HP Banner']")
	private WebElement deskHPBanner;
	@FindBy(xpath = "//h5[text()='Information']")
	private WebElement deskInformationText;
	@FindBy(xpath = "//a[text()='About Us']")
	private WebElement deskAboutUs;
	@FindBy(xpath = "//a[text()='Delivery Information']")
	private WebElement deskDeliveryInformation;
	@FindBy(xpath = "//a[text()='Privacy Policy']")
	private WebElement deskPrivacyPolicy;
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement deskTermsAndConditions;
	@FindBy(xpath = "//h5[text()='Customer Service']")
	private WebElement deskCustomerServiceText;
	@FindBy(xpath = "//a[text()='Contact Us']")
	private WebElement deskContactUs;
	@FindBy(xpath = "//a[text()='Returns']")
	private WebElement deskReturns;
	@FindBy(xpath = "//a[text()='Site Map']")
	private WebElement deskSiteMap;
	@FindBy(xpath = "//h5[text()='Extras']")
	private WebElement deskExtrasText;
	@FindBy(xpath = "//a[text()='Brands']")
	private WebElement deskBrands;
	@FindBy(xpath = "//a[text()='Gift Certificates']")
	private WebElement deskGiftCertificate;
	@FindBy(xpath = "//a[text()='Affiliate']")
	private WebElement deskaAffiliates;
	@FindBy(xpath = "//a[text()='Specials']")
	private WebElement deskSpecials;
	@FindBy(xpath = "//h5[text()='My Account']")
	private WebElement deskMyAcountText;
	@FindBy(xpath = "//aside//div//a[text()='Order History']")
	private WebElement deskOrderHistory;
	@FindBy(xpath = "//aside//div//a[text()='Newsletter']")
	private WebElement deskNewsLetter;
	@FindBy(xpath = "//p//a[text()='OpenCart']")
	private WebElement deskOpenCart;
	@FindBy(name = "search")
	private WebElement deskSearchbox;
	@FindBy(className = "btn btn-default btn-lg")
	private WebElement deskSearchButton;
	@FindBy(xpath = "//i[@class='fa fa-phone']")
	private WebElement deskTelephoneIcon;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement deskMyAcount;
	@FindBy(xpath = "//span[text()='Wish List (0)']")
	private WebElement deskWishList;
	@FindBy(linkText = "Shopping Cart")
	private WebElement dShoppingCart;
	@FindBy(xpath = "//span[text()='Checkout']")
	private WebElement deskCheckOut;
	@FindBy(id = "input-quantity")
	private WebElement quantity;
	@FindBy(id = "button-cart")
	private WebElement addToCartButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible'] ")
	private WebElement SuccessMessageForAddingHPLP3065;
	@FindBy(tagName = "a")
	private List<WebElement> desktopUIwithTagA;
	@FindBy(tagName = "span")
	private List<WebElement> desktopUIwithTagSpan;
	@FindBy(tagName = "button")
	private List<WebElement> desktopUIwithTagButton;
	@FindBy(tagName = "div")
	private List<WebElement> deskUiwithTagDiv;
	@FindBy(tagName = "input")
	private List<WebElement> deskUIwithTagInput;
	@FindBy(linkText = "Write a review")
	private WebElement writeAReview;
	@FindBy(id = "button-review")
	private WebElement continueButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageforwritingreview;
	@FindBy(id = "input-name")
	private WebElement yourName;
	@FindBy(id = "input-review")
	private WebElement yourReviewInput;
	@FindBy(xpath = "//input[@value='5']")
	private WebElement rating5;
	@FindBy(xpath = "(//div[@class='col-sm-12'])[4]//input[5]")
	private WebElement rate5ForCanon;
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12'][3]//div//div//div//button[1] ")
	private WebElement deskHPLP3065AddToCart;

	public void showAllDesktop() {
		showAllDesktop.click();
	}

	public void validateDesktopText() {
		deskdesktopText.click();
	}

	public void validateDeskAppleCinema30() {
		deskAppleCinema30.isDisplayed();
	}

	public void clickOnCinema30AddToCart() {
		deskAppleCinema30addToCart.click();
	}

	public void clickOnCinema30AddToWishList() {
		deskAppleCinema30AddTowishList.click();
	}

	public void clickOnCinema30CompareThisProduct() {
		deskAppleCinema30compareThisProduct.click();
	}

	public void validateDeskCanonEos5D() {
		deskCanonEOS5D.isDisplayed();

	}

	public void clickOnCanonEOS5D() {
		deskCanonEOS5D.click();
	}

	public void clickOnDeskCanonEOS5DAddToCart() {
		deskCanonEOS5DaddToCart.click();

	}

	public void clickOnDeskCanonEOS5DAddToWishList() {
		deskCanonEOS5DAddToWishList.click();
	}

	public void clickOnCanonEOS5DCompareThisProduct() {
		deskCanonEOS5DCompareThisProduct.click();
	}

	public void SelcolorDropDown() {

		WebElement colorOption = driver.findElement(By.id("input-option226"));

		Select dropdown = new Select(colorOption);

		dropdown.selectByIndex(2);
	}

	public void validateSuccessMessageCanon5D() throws InterruptedException, IOException {
		String actualmessage = successMessageCanon5D.getText();
		String expectedmessage = "Success: You have added Canon EOS 5D Camera to your shopping cart!";
		String strString = actualmessage.substring(0, 66);
		System.out.println("Actualmessage : " + actualmessage + " and expectedMessage: " + expectedmessage);
		Utilities.highlightelementRedBorderAndTakeScreenshot(successMessageCanon5D, "Canon5D");
		Assert.assertEquals(expectedmessage, strString);

	}

	public void validateDeskHPLP3065() {
		deskHPLP3065.isDisplayed();
	}

	public void clickOnHPLP3065AddToCart() {
		deskHPLP3065AddToCart.click();
	}

	public void validateDeskHTCTouchHD() {
		deskHTCTouchHD.isDisplayed();
	}

	public void validateDeskIphone() {
		deskIphone.isDisplayed();
	}

	public void validateDeskIpodClassic() {
		deskIPodClassic.isDisplayed();
	}

	public void validateDeskMacBook() {
		deskMacBook.isDisplayed();
	}

	public void validateDeskMacBookAir() {
		deskMacBookAir.isDisplayed();
	}

	public void validateDeskPalmTreoPro() {
		deskPalmTreoPro.isDisplayed();
	}

	public void validateDeskProduct8() {
		deskProduct8.isDisplayed();
	}

	public void validateDeskSamsungSyncMaster941W() {
		deskSamsungSyncMaster941BW.isDisplayed();
	}

	public void validateDeskSonyVAIO() {
		deskSonyVAIO.isDisplayed();
	}

	public void enterQuantity() {
		quantity.clear();
		quantity.sendKeys("1");
	}

	public void ClickOnAddToCartButton() {
		addToCartButton.click();
	}

	public void validateSuccessMessageForAddingHPLP3065() throws IOException {
		String actualmessage = SuccessMessageForAddingHPLP3065.getText();
		String expectedmessage = "Success: You have added HP LP3065 to your shopping cart!";
		String strString = actualmessage.substring(0, 56);
		System.out.println("Actualmessage : " + actualmessage + " and expectedMessage: " + expectedmessage);
		Utilities.highlightelementRedBorderAndTakeScreenshot(SuccessMessageForAddingHPLP3065, "HP LP 3065");
		Assert.assertEquals(expectedmessage, strString);
	}

	public boolean verifyTagAElementsinDesktopwithTagA() {

		List<WebElement> tagA = desktopUIwithTagA;
		for (WebElement element : tagA) {
			logger.info(element.getText() + "text name of UT element with tagA");

		}
		return false;
	}

	public boolean verifyTagElementsinDesktopwithTagSpan() {
		List<WebElement> tagSpan = desktopUIwithTagSpan;
		for (WebElement element : tagSpan) {
			logger.info(element.getText() + "text name of UT element with tagSpan");
		}

		return false;

	}

	public boolean verifyTagElementsinDesktopwithTagButton() {
		List<WebElement> tagButton = desktopUIwithTagButton;
		for (WebElement element : tagButton) {
			logger.info(element.getText() + "text name of UT element with tagButton");
		}

		return false;
	}

	public boolean verifyTagElementsinDesktopwithTagDiv() {
		List<WebElement> tagDiv = deskUiwithTagDiv;
		for (WebElement element : tagDiv) {
			logger.info(element.getText() + "text name of UT element with tagDiv");

		}

		return false;

	}

	public boolean verifyTagElementsinDesktopwithTagInput() {
		List<WebElement> tagInput = deskUIwithTagInput;
		for (WebElement element : tagInput) {
			logger.info(element.getText() + "text name of UT element with tagInput");

		}
		return false;
	}

	public void clickOnWriteAReview() {
		writeAReview.click();
	}

	public void clickOnContinueButton() {
		continueButton.click();
	}

	public void validateSccessMessageFroWritingReview() throws IOException {
		String actualmessage = successMessageforwritingreview.getText();
		String expectedmessage = "Thank you for your review. It has been submitted to the webmaster for approval.";
		Utilities.highlightelementRedBorderAndTakeScreenshot(successMessageforwritingreview, "SonyVaioWishList");
		Assert.assertEquals(expectedmessage, actualmessage);

	}

	public void enterYourName(String yourname) {
		yourName.sendKeys("name");
	}

	public void enterYourReview(String yourReview) {
		yourReviewInput.sendKeys("this is an amazing and wonderful product");
	}

	public void RatingByRadioButton(String Rating) {
		rate5ForCanon.click();

	}

}
